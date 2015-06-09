package primeService.socket;

import java.io.IOException;
import java.net.Socket;

import primeService.util.Debug;

public class PrimeClientSocket implements Runnable {
	
	private String hostname;
	private int port;
	Socket socketClient;
	/*
	 * constructor to initialize local data members.
	 */
	public PrimeClientSocket(String hostname, int port) {
		Debug.getUniqueInstance().printToStdout(2,"PrimeClientSocket constructor invoked");
		this.hostname = hostname;
		this.port = port;
	}
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "PrimeClientSocket class tostring method\n";
		return str;
	}
	public void run() {
		try {
			socketClient = new Socket(hostname,port);
			PrimeClientWorker clientHandler = new PrimeClientWorker(socketClient);
			
		}
		catch(IOException e) {
			System.err.println("Server Not ready");
			System.exit(-1);
		}
	}

}
