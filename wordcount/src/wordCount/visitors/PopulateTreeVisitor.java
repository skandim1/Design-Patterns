package wordCount.visitors;

import java.util.Map;
import java.util.TreeMap;

import wordCount.treesForStrings.Data;
import wordCount.treesForStrings.DataElement;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class PopulateTreeVisitor implements Visitor{
	FileProcessor fp;
	/**
	 * PopulateCountVisitor Constructor
	 * @param : FileProcessor
	 * @return : none
	 */
	public PopulateTreeVisitor(FileProcessor f) {
		MyLogger.getUniqueInstance().printToStdout(1,"PopulateTreeVisitor constructor method invoked");
		fp = f;
	}
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "PopulateTreeVisitors class tostring method\n";
		return str;
	}
   	/**
   	 * visit method
   	 * @param : DataElement
   	 * @return : none
   	 */
	public void visit(DataElement e) {
		MyLogger.getUniqueInstance().printToStdout(2,"PopulateTreeVisitor visit method invoked");
		Map<Integer, Data> tmap = new TreeMap<Integer, Data>();
		String str;
		Data d;
		while((str=fp.readFromFile())!=null) {
			d = tmap.get(str.hashCode());
			if(d == null){
				tmap.put(str.hashCode(), new Data(str.length()));
			}
			else {
				d.count++;
			}
		}
		e.setTmap(tmap);
	}
}
