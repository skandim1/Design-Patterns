package wordCount.treesForStrings;

import java.util.Map;

import wordCount.util.MyLogger;
import wordCount.visitors.Visitor;

public class DataElement {
	
	private Map<Integer, Data> tmap;
	
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "DataElement class tostring method\n";
		return str;
	}
  	/**
   	 * visit method
   	 * @param : Visitor object
   	 * @return : none
   	 */
	public void accept(Visitor visitor) {
		MyLogger.getUniqueInstance().printToStdout(2,"DataElement accept method invoked");
		visitor.visit(this);
	}
  	/**
   	 * get method
   	 * @param : none
   	 * @return : data structure
   	 */
	public Map<Integer, Data> getTmap() {
		MyLogger.getUniqueInstance().printToStdout(2,"DataElement get method invoked");
		return tmap;
	}
	/**
   	 * set method
   	 * @param : data structure
   	 * @return : none
   	 */
	public void setTmap(Map<Integer, Data> tmap) {
		MyLogger.getUniqueInstance().printToStdout(2,"DataElement set method invoked");
		this.tmap = tmap;
	}
}
