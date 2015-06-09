package primeService.client;

public class ClientMenu {
	/**
	 * To display client menu
	 * @param none
	 * @return none
	 */
	public static void displayClientMenu() {
		
		System.out.println("[1] Set client name");
		System.out.println("[2] Enter number to query for prime");
		System.out.println("[3] What is the server response?");
		System.out.println("[4] Quit");
		System.out.print("Enter your choice :  ");
	}
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "ClientMenu class tostring method\n";
		return str;
	}
}
