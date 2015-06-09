package primeService.server;

import java.util.Scanner;

import primeService.socket.PrimeServerSocket;
import primeService.util.Debug;

public class ServerDriver implements serverInterface {
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "ServerDriver class tostring method\n";
		return str;
	}
	/**
	 * To connect to server
	 * @param portNumber
	 * @return none
	 */
	public void connectServer(int portNumber) {
		Scanner sc = new Scanner(System.in);		
		try {
			PrimeServerSocket socketServer = new PrimeServerSocket(portNumber);
			(new Thread(socketServer)).start();
			
			while(true) {
			ServerMenu.displayServerMenu();
			String userInput = sc.next();
			if(userInput.equals("1")) {
				System.out.println("Enter client name :");
				String client_name = sc.next();
				
				System.out.println(AllPrimeQueries.getClientDetails(client_name));
			}
			else if(userInput.equals("2")) {
				
				AllPrimeQueries.printAllClientDetails();
			}
			else if(userInput.equals("3")) {
				System.out.println("Quit");
				System.exit(-1);
			}
			else {
				System.out.println("Invalid choice");
				
			}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
}
