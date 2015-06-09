package primeService.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import primeService.util.Debug;

public class PrimeClientWorker {
	private static Socket clientSocket;
	
	public PrimeClientWorker(Socket clientSocket) {
		Debug.getUniqueInstance().printToStdout(2,"PrimeClientWorker Constructor invoked");
		PrimeClientWorker.clientSocket = clientSocket;
	}
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "PrimeClientWorker class tostring method\n";
		return str;
	}
	/*
	 * To receive server response
	 */
	public static void receiveMessage() {
		Debug.getUniqueInstance().printToStdout(3,"receiveMessage method invoked");
		try {
		
			BufferedReader BR = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			String serverResponse = BR.readLine();
			Debug.getUniqueInstance().printToStdout(1,serverResponse);
		}
		catch (IOException e) {
			System.err.println("error : recieve message");
			System.exit(-1);
		}
	}
	/**
	 * To send client details
	 * @param str
	 */
	public static void sendMessage(String str) {	
		Debug.getUniqueInstance().printToStdout(3,"sendMessage method invoked");
		try {
			OutputStreamWriter OSW = new OutputStreamWriter(clientSocket.getOutputStream());
			BufferedWriter BW = new BufferedWriter(OSW);

			str = str+"\n";
            BW.write(str);	
            BW.flush();
		}
		catch (IOException e) {
			System.err.println("error : sending message");
			System.exit(-1);
		}
	}
}
