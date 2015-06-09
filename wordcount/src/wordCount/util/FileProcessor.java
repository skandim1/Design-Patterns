package wordCount.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;


public class FileProcessor {
	private Scanner x;
	String ip_file, op_file;
	File file;
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
	 * @param : output file
	 * @return : none
	 */
	public FileProcessor(String ip_path, String op_path) {
		MyLogger.getUniqueInstance().printToStdout(1,"FileProcessor constructor method invoked");
		ip_file = ip_path;
		op_file = op_path;
		try {
				x = new Scanner(new File(ip_file));
				file = new File(op_file);
				if(!file.exists()) {
					file.createNewFile();
				}
				file.setWritable(true);
			} catch(Exception e) {
				System.out.println("could not find file");
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
	/**
	 * write to file
	 * @param : data
	 * @return : none
	 */
	public void writeToFile(String data) {
        Writer fileWriter = null;
        BufferedWriter bufferWriter = null;
        try {
        	fileWriter = new FileWriter(file,true);
        	bufferWriter = new BufferedWriter(fileWriter);      		
        	bufferWriter.write(data+"\n");	
        } catch (IOException e) {
        	System.err.println("Error writing the file : ");
        	e.printStackTrace();
        } finally {
        	if(bufferWriter != null && fileWriter != null) {
        		try {
        			bufferWriter.close();
        			fileWriter.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
	}

}

