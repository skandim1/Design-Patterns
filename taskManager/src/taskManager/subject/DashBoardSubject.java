package taskManager.subject;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;
import taskManager.util.FileProcessor;
import taskManager.util.myLogger;

public class DashBoardSubject implements Subject{

	String input, output;
	String str;	
	private Map<Observer, DashboardFilter> observers = new HashMap<Observer, DashboardFilter>();
	FileProcessor f;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "DashBoardSubject class tostring method\n";
		return str;
	}
	/**
	 * DashBoardSubject Constructor
	 * @param : input file
	 * @param : output file
	 * @return : none
	 */
	public DashBoardSubject(String ip, String op) {
		myLogger.getUniqueInstance().printToStdout(2,"DashBoardSubject constructor method invoked");
		input = ip;
		output = op;
		f = new FileProcessor(input,output);
	}
	/**
	 * start Processing
	 * @param : none
	 * @return : none
	 */
	public void startProcessing() {
		while((str=f.readFromFile())!=null) {
			NotifyObserver();
		}		
	}
	/**
	 * Add Observer
	 * @param : Observer
	 * @param : filter
	 * @return : none
	 */
	public void AddObserver(Observer o, DashboardFilter f) {
		observers.put(o,f);
	}
	/**
	 * Remove Observer
	 * @param : Observer
	 * @return : none
	 */
	public void RemoveObserver(Observer o) {
		observers.remove(o);
	}
	/**
	 * Notify Observer
	 * @param : none
	 * @return : none
	 */
	public void NotifyObserver() {
		int count = 1,start = 0,end = 0;
        String patternString3 = "\\*";
        Pattern pattern3 = Pattern.compile(patternString3); 
        String[] split3 = pattern3.split(str);  
        int len = split3.length;
        for(String element2 : split3){
		Iterator<Observer> keySetIterator = observers.keySet().iterator();
		while(keySetIterator.hasNext()){
		  Observer key = keySetIterator.next();
		   if(observers.get(key).check(element2)) {
			   if(count == 1) {
				   start = 1;
				   end = 0;
				   if(len == 1)
					   end = 1;
			   }
			   else if(count == len) {
				   start = 0;
				   end = 1; 
			   }
			   else {
				   start = 0;
				   end = 0;
			   }
			   count++;

			   key.Update(element2,f,start,end);
		   }			   
		}
        }
	}

}
