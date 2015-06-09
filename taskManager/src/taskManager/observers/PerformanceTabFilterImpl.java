package taskManager.observers;

import taskManager.filter.DashboardFilter;
import taskManager.util.myLogger;

public class PerformanceTabFilterImpl implements DashboardFilter {
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "PerformanceTabFilterImpl class tostring method\n";
		return str;
	}
	/**
	 * check filter
	 * @param : filterString
	 * @return : boolean
	 */
	public boolean check(String filterString) {
		myLogger.getUniqueInstance().printToStdout(4,"PerformanceTabFilter check method invoked");
		if(filterString.startsWith("Performance"))
			return true;
		else
			return false;
	}

}
