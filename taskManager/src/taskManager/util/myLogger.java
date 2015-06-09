package taskManager.util;

public class myLogger {
	private int DEBUG_VALUE;
    private static volatile myLogger UniqueInstance = null;   
     private myLogger() { }  
     /**
      * Singleton pattern is implemented
      * @param none
      * @return UniqueInstance
      */
     public static myLogger getUniqueInstance() 
     {
        if(UniqueInstance==null) { 
         synchronized (myLogger.class) {
             if (UniqueInstance == null) {
                 UniqueInstance = new myLogger();
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
		String str = "CheckPrime class tostring method\n";
		return str;
	}
}
