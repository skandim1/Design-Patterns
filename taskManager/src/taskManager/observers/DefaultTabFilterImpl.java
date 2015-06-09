package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.myLogger;

public class DefaultTabFilterImpl implements DashboardFilter {
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "DefaultTabFilterImpl class tostring method\n";
		return str;
	}
	/**
	 * check filter
	 * @param : filterString
	 * @return : boolean
	 */
	public boolean check(String filterString) {
		myLogger.getUniqueInstance().printToStdout(4,"DefaultTabFilter check method invoked");
		if(filterString.isEmpty())
			return true;
		else
			return false;
	}

}
