package primeService.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import primeService.server.AllPrimeQueries;
import primeService.util.CheckPrime;
import primeService.util.Debug;

public class PrimeServerWorker implements Runnable{
	
	private Socket cSocket;
	private static final int THRESHOLD = 3;
	
	PrimeServerWorker(Socket cSocket) {
		Debug.getUniqueInstance().printToStdout(2,"PrimeServerWorker Constructor invoked");
		this.cSocket = cSocket;
	}
	
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "PrimeServerWorker class tostring method\n";
		return str;
	}
	
	public void run() {
		
		try {
			while(true) {
			InputStreamReader IR = new InputStreamReader(cSocket.getInputStream());
			BufferedReader BR = new BufferedReader(IR);
			String uinput = BR.readLine();
		
			String []str;
			str = uinput.split(" ");
			String uname = str[0];
			String number = str[1];
			String msg = str[1];
			
			int n = Integer.parseInt(number);
			
			if(n >THRESHOLD) {
				Boolean b = CheckPrime.checkprime(n);
				if(b) {
					AllPrimeQueries.saveData(uname,number);	
					msg = msg+"  YES\n";	
				}
				else 
					msg = msg+"  Not Valid\n";
			}
			else 
				msg = msg+"  No Idea!\n";
	
			OutputStreamWriter OSW = new OutputStreamWriter(cSocket.getOutputStream());
			BufferedWriter BW = new BufferedWriter(OSW);
            BW.write(msg);	
            BW.flush();
		}
		}
		catch(NumberFormatException ne) {
			System.err.println("Invalid number from client");
		}
		catch(IOException e) {
			System.err.println("error: reader/writer issue in server driver");
            System.exit(-1);
		}
	}
}
