package objComp.util;

public class MyLogger {
	private int DEBUG_VALUE;
    private static volatile MyLogger UniqueInstance = null;   
     private MyLogger() { }  
     /**
      * Singleton pattern is implemented
      * @param none
      * @return UniqueInstance
      */
     public static MyLogger getUniqueInstance() 
     {
        if(UniqueInstance==null) { 
         synchronized (MyLogger.class) {
             if (UniqueInstance == null) {
                 UniqueInstance = new MyLogger();
             }
         }
        }      
         return UniqueInstance;
     }
     /**
      * To set the value of debug level
      * @param debuglevel
      */
    public void setvalue(int debuglevel){
 	   DEBUG_VALUE = debuglevel;
    }
    /**
     * To print debug message 
     * @param debuglevel
     * @param debugMessage
     */
    public void printToStdout(int debuglevel,String debugMessage){
 	   if( debuglevel == DEBUG_VALUE )
 		   System.out.println(debugMessage);
    }
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "MyLogger class tostring method\n";
		return str;
	}
}
