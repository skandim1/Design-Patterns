package taskManager.observers;

import taskManager.util.FileProcessor;

public interface Observer {
	void Update(String s,FileProcessor f,int start,int end);
}
