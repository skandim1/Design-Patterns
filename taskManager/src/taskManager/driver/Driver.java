package taskManager.driver;

import taskManager.filter.DashboardFilter;
import taskManager.observers.DefaultTab;
import taskManager.observers.DefaultTabFilterImpl;
import taskManager.observers.Observer;
import taskManager.observers.PerformanceTab;
import taskManager.observers.PerformanceTabFilterImpl;
import taskManager.observers.ProcessesTab;
import taskManager.observers.ProcessesTabFilterImpl;
import taskManager.observers.UsersTab;
import taskManager.observers.UsersTabFilterImpl;
import taskManager.subject.DashBoardSubject;
import taskManager.subject.Subject;
import taskManager.util.myLogger;

public class Driver {

	public static void main(String[] args) {
		
		if(args.length == 3) {
			if((Integer.parseInt(args[2]) >= 0) && (Integer.parseInt(args[2]) <= 4)) {
				 myLogger.getUniqueInstance().setvalue(Integer.parseInt(args[2]));
			} else {
				System.err.println("Invalid debug value");
				System.exit(-1);
			}
				 
		Subject sub = new DashBoardSubject(args[0],args[1]);
		Observer obs1 = new PerformanceTab();
		Observer obs2 = new ProcessesTab();
		Observer obs3 = new UsersTab();
		Observer obs4 = new DefaultTab();
		
		DashboardFilter f1 = new PerformanceTabFilterImpl();
		DashboardFilter f2 = new ProcessesTabFilterImpl();
		DashboardFilter f3 = new UsersTabFilterImpl();
		DashboardFilter f4 = new DefaultTabFilterImpl();
		
		sub.AddObserver(obs1, f1);
		sub.AddObserver(obs2, f2);
		sub.AddObserver(obs3, f3);
		sub.AddObserver(obs4, f4);
		
		((DashBoardSubject) sub).startProcessing();
		} else{
			System.out.println("enter valid arguments");
			System.exit(-1);
		}
	}

}
