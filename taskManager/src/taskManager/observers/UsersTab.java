package taskManager.observers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import taskManager.display.DisplayFile;
import taskManager.util.FileProcessor;
import taskManager.util.myLogger;

public class UsersTab implements Observer, DisplayFile {
	int start2;
	List<UsersInfo> l = new ArrayList<UsersInfo>();
	FileProcessor fp;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "UsersTab class tostring method\n";
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
	public void Update(String s,FileProcessor f,int start,int end) {
		myLogger.getUniqueInstance().printToStdout(3,"UserTab Upadte method invoked");
        fp =f; 

		start2 = l.size();
		int flag = 1;
        	String patternString = "-";
        	Pattern pattern = Pattern.compile(patternString); 
        	String[] split = pattern.split(s); 
        		for(String element : split){
        			UsersInfo p = new UsersInfo();
        			String patternString2 = ":";
        			Pattern pattern2 = Pattern.compile(patternString2);
        			String[] split2 = pattern2.split(element);
        			if(flag == 1) {
        				if(start == 1) {
        					myLogger.getUniqueInstance().printToStdout(1,"---TAB(s) BEGIN---");
        					fp.writeToFile("---TAB(s) BEGIN---");
        				}
        				if(start == 1) {
        					myLogger.getUniqueInstance().printToStdout(1,"---USERS---");
        				fp.writeToFile("---USERS---");
        				}
        				else {
        					myLogger.getUniqueInstance().printToStdout(1,"\n"+"---USERS---");
        					fp.writeToFile("\n"+"---USERS---");
        				}
        					p.setInfo(split2[1],split2[2]);
        				flag = 0;
        			}
        			else 
        				p.setInfo(split2[0],split2[1]);
        			l.add(p);
        		}
	        display();	
			if(end == 1) {
				myLogger.getUniqueInstance().printToStdout(1,"\n"+"---TAB(s) END---");
				fp.writeToFile("\n"+"---TAB(s) END---");
			}
	}
	/**
	 * display output
	 * @param : none
	 * @return : none
	 */
	public void display() {
		for(int i=start2;i<l.size();i++) {
			myLogger.getUniqueInstance().printToStdout(1,l.get(i).getInfo());
			fp.writeToFile(l.get(i).getInfo());
		}
	}

}
