package objComp.fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import objComp.util.MyLogger;

public class FileProcessor {
	private Scanner x;
	private String ip_file;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "FileProcessor class tostring method\n";
		return str;
	}
	/**
	 * FileProcessor Constructor
	 * @param : input file
	 * @return : none
	 */
	public FileProcessor(String ip_path) {
		MyLogger.getUniqueInstance().printToStdout(1,"FileProcessor constructor method invoked");
		ip_file = ip_path;
		try {
			x = new Scanner(new File(ip_file));
		} catch (FileNotFoundException e) {
			System.err.println("Could not open file");
		}
	}
	/**
	 * read from file
	 * @param : none
	 * @return : String
	 */
	public String readFromFile() {
		while(x.hasNext()) 		
	          return x.nextLine();
	    return null;
	}	
}
