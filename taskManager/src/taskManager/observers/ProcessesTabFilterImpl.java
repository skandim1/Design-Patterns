package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.myLogger;

public class ProcessesTabFilterImpl implements DashboardFilter {
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "ProcessesTabFilterImpl class tostring method\n";
		return str;
	}
	/**
	 * check filter
	 * @param : filterString
	 * @return : boolean
	 */
	public boolean check(String filterString) {
		myLogger.getUniqueInstance().printToStdout(4,"ProcessesTabFilter check method invoked");
		if(filterString.startsWith("Processes"))
			return true;
		else
			return false;
	}

}
