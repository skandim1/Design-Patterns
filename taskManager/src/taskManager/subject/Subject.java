package taskManager.subject;

import taskManager.filter.DashboardFilter;
import taskManager.observers.Observer;

public interface Subject {
	void AddObserver(Observer o, DashboardFilter f);
	void RemoveObserver(Observer o);
	void NotifyObserver();
}
