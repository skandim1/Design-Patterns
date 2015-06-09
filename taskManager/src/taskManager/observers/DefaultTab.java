package taskManager.observers;

import taskManager.util.FileProcessor;
import taskManager.util.myLogger;

public class DefaultTab implements Observer{
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "DefaultTab class tostring method\n";
		return str;
	}
	/**
	 * Update input
	 * @param : s
	 * @param : f
	 * @param : start
	 * @param : end
	 * @return : none
	 */
	public void Update(String s, FileProcessor f, int start, int end) {
		myLogger.getUniqueInstance().printToStdout(3,"DefaultTab Upadte method invoked");
		myLogger.getUniqueInstance().printToStdout(1,"---TAB(s) BEGIN---");
			f.writeToFile("---TAB(s) BEGIN---");
		myLogger.getUniqueInstance().printToStdout(1,"---TAB(s) END---");
			f.writeToFile("---TAB(s) END---");
	}

}
