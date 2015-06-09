package wordCount.visitors;

import java.util.Map;

import wordCount.treesForStrings.Data;
import wordCount.treesForStrings.DataElement;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;

public class WordCountVisitor implements Visitor {
	FileProcessor fp;
	Map<Integer, Data> tmap;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "WordCountVisitor class tostring method\n";
		return str;
	}
	/**
	 * WordCountVisitor Constructor
	 * @param : FileProcessor
	 * @return : none
	 */
	public WordCountVisitor(FileProcessor f) {
		MyLogger.getUniqueInstance().printToStdout(1,"WordCountVisitor constructor method invoked");
		fp = f;
	}
  	/**
   	 * visit method
   	 * @param : DataElement
   	 * @return : none
   	 */
	public void visit(DataElement e) {
		MyLogger.getUniqueInstance().printToStdout(2,"WordCountVisitor visit method invoked");
		int total_words = 0;
		int total_characters = 0;
		tmap = e.getTmap();
                 int unique_words = tmap.size();
		for(Data data : tmap.values()) {
			total_words += data.count;
			total_characters += data.count * data.Num_Characters;
		}
		String str;
		str = "total words : "+total_words+" total unique words : "+unique_words+" total characters : "+total_characters;
		fp.writeToFile(str);
	}
}
