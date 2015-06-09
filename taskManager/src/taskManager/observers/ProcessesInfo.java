package taskManager.observers;

public class ProcessesInfo {
	private String PID,COMMAND,USER,CPU_Percent,MEM_Percent;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "ProcessesInfo class tostring method\n";
		return str;
	}
	public void setInfo(String s1,String s2,String s3,String s4,String s5) {
		PID = s1;
		COMMAND = s2;
		USER = s3;
		CPU_Percent = s4;
		MEM_Percent = s5;
	}
	public String getInfo() {
		String data = "";
		data = String.format("%5s", PID)+" "+String.format("%-15s",COMMAND)+" "+String.format("%-8s", USER)+" "+String.format("%4s", CPU_Percent)+" "+String.format("%4s", MEM_Percent);
		return data;
	}
}
