package primeService.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import primeService.util.Debug;

public class PrimeServerSocket implements Runnable{
	private int port;
	
	public PrimeServerSocket(int port) {
		Debug.getUniqueInstance().printToStdout(2,"PrimeServerSocket Constructor invoked");
		this.port = port;
	}
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "PrimeServerSocket class tostring method\n";
		return str;
	}
	public void run() {
		try {
		ServerSocket SRVSock = new ServerSocket(port);
		while(true) {
		Socket sock = SRVSock.accept();
		
		PrimeServerWorker psw = new PrimeServerWorker(sock);
		(new Thread(psw)).start();
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
