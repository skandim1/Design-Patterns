package primeService.client;

import java.util.Scanner;

import primeService.socket.PrimeClientSocket;
import primeService.socket.PrimeClientWorker;
import primeService.util.Debug;

public class ClientDriver implements clientInterface {
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "ClientDriver class tostring method\n";
		return str;
	}
	/**
	 * To create a client thread, 
	 * @param hostname
	 * @param port_p
	 * @return none
	 */
	public void connectClient(String hostname, int port_p) {
		Debug.getUniqueInstance().printToStdout(3,"connectClient method invoked");
		Scanner sc = new Scanner(System.in);
		try {
			PrimeClientSocket clientServer = new PrimeClientSocket(hostname, port_p);
			(new Thread(clientServer)).start();
			
			String clientData = null;

			while(true){
				
				ClientMenu.displayClientMenu();
				String userinput = sc.next();
				
				if(userinput.equals("1")) {
					System.out.println("Enter client name :");
				   String client_name = sc.next();	
				   clientData = client_name;	
				}
				else if(userinput.equals("2")) {
					System.out.println("Enter prime number :");
					String prime_number = sc.next();
					clientData = clientData+" "+prime_number;
				}
				else if(userinput.equals("3")) {
					PrimeClientWorker.sendMessage(clientData);
					PrimeClientWorker.receiveMessage();	
				}
				else if(userinput.equals("4")) {			
					System.out.println("Quit");
					System.exit(-1);				
				}
				else {
					System.out.println("Invalid choice");	
				}
			}
		}
		catch (Exception e) {
			System.err.println("error :socket connection");
			System.exit(-1);
		}
		finally {
			sc.close();
		}
	}
}
