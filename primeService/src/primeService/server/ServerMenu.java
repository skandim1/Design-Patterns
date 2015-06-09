package primeService.server;

public class ServerMenu {
	/**
	 * To display server menu
	 * @param none
	 * @return none
	 */
	public static void displayServerMenu() {
		System.out.println("[1] Client Name");
		System.out.println("[2] All Client Queries");
		System.out.println("[3] Quit");
		System.out.print("Enter your choice :  ");
	}
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "ServerMenu class tostring method\n";
		return str;
	}
}
