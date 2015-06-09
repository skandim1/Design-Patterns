package taskManager.observers;

public class UsersInfo {
	public String User, Status;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "UserInfo class tostring method\n";
		return str;
	}
	public void setInfo(String s1,String s2) {
		User = s1;
		Status = s2;
	}
	public String getInfo() {
		return "User: "+User+"  "+"Status: "+Status;
	}
}
