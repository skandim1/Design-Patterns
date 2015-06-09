package primeService.util;

public class Debug {
	
	       private int DEBUG_VALUE;
	       private static volatile Debug UniqueInstance = null;
	        
	        private Debug() { }   
	        /**
	         * Singleton pattern is implemented
	         * @param none
	         * @return UniqueInstance
	         */
	        public static Debug getUniqueInstance() 
	        {
	           if(UniqueInstance==null) { 
	            synchronized (Debug.class) {
	                if (UniqueInstance == null) {
	                    UniqueInstance = new Debug();
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
