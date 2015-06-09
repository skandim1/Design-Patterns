package bugModel.util;

public class Debug {

       private static int DEBUG_VALUE;
     /**
       * This doesnot have a return type           
       * This function sets the debug value given in the arguments
       * This is called in the driver class.
       */
       public static void setvalue(int debuglevel){
    	   DEBUG_VALUE = debuglevel;
       }
 
        public String toString() {
        String retValue = "\n Debubg class \n";
        return retValue;
    }
     /**
       * This doesnot have a return type           
       * When this function is invoked prints message of which
       * method is called based on debug value.
       */
       public static void printToStdout(int debuglevel,String debugMessage){
    	   if( debuglevel == DEBUG_VALUE )
    		   System.out.println(debugMessage);
       }
}
