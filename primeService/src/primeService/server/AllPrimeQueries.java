package primeService.server;


import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class AllPrimeQueries {
	
	private static Map<String, String> hmap = new ConcurrentHashMap<String, String>();
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "AllPrimeQueries class tostring method\n";
		return str;
	}
	/**
	 * To save the client details in the hashmap
	 * @param username
	 * @param number
	 * @return none
	 */
	public static void saveData(String username, String number) {
		String existing_number = null;
		if(hmap.containsKey(username)) {
			
			existing_number = hmap.get(username);
			existing_number= existing_number+" "+number;

		}
		else
			existing_number = number;
		
		hmap.put(username, existing_number);
	}
	/*
	 * This method prints client details if the client exists
	 */
	public static String getClientDetails(String cName){
		String clientData = null;
		if(hmap.containsKey(cName)){
			clientData = cName + " " + hmap.get(cName);
		}
		else{
			clientData = cName+" not exists";
		}
		return clientData;
	}
	/**
	 * This method prints all client details in the hashmap
	 * @param none
	 * @return none
	 */
	public static void printAllClientDetails(){
			if(!hmap.isEmpty()){
				Set<String> setOfKeys = hmap.keySet();
				Iterator<String> iterator = setOfKeys.iterator();
				while (iterator.hasNext()){
					String key = (String)iterator.next();						
					 String value = (String)hmap.get(key);						 
					System.out.println( key + " " + value);
				}
			}
		}
}
