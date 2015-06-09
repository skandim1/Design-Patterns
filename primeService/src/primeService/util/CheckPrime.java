package primeService.util;

public class CheckPrime {
	
	/**
	 * To know about a class
	 * @param : none
	 * @return : String
	 */
	public String toString() {
		String str = "CheckPrime class tostring method\n";
		return str;
	}
	/**
	 * To check whether a number is prime or not.
	 * @param value
	 * @return true|false
	 */
	public static boolean checkprime(int value) {
		Debug.getUniqueInstance().printToStdout(3,"checkprime method invoked");

		for(int i =2;i<=Math.sqrt(value);i++) {
			if((value%i)==0) {
				return false;
			}
		}
		
		 return true;
	}
}
