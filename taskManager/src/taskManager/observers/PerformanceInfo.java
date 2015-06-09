package taskManager.observers;

public class PerformanceInfo {
	public String Memory_Total,Memory_Used,Memory_Free,Memory_Cached,CPU_Idle,CPU_User_Level,CPU_System_Level;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "PerformanceInfo class tostring method\n";
		return str;
	}
	public void setInfo(String s1,String s2,String s3,String s4,String s5,String s6,String s7) {
		Memory_Total = s1;
		Memory_Used = s2;
		Memory_Free = s3;
		Memory_Cached = s4;
		CPU_Idle = s5;
		CPU_User_Level = s6;
		CPU_System_Level = s7;
	}
	public String getInfo() {
		return "Memory Total: "+Memory_Total+"  Memory Used: "+Memory_Used+"  Memory  Free: "+ Memory_Free+"  Memory  Cached: "+ Memory_Cached+"\n"+"CPU Idle: "+ CPU_Idle+"  CPU User Level: "+CPU_User_Level+"  CPU System Level: "+ CPU_System_Level;
	}
}
