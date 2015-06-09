package bugModel.bug;

import bugModel.results.Code;
import bugModel.results.Results;
import bugModel.results.StoreMovements;
import bugModel.util.Debug;

public class Bug implements AllDirectionsBug {

    private StoreMovements movements; 

    private static String right="1";
    private static String left="2";
    private static String up="3";
    private static String down="4";
    private static String undo="0";
     /**
       * This doesnot have a return type           
       * When an object is created this constructor is invoked
       */
    public Bug(StoreMovements res) {
		// TODO Auto-generated constructor stub
    	Debug.printToStdout(4,"Bug constructor is called");
    	movements = res;
	}
      /**
       * Returns string
       * @return given string in the function. 
       */
	public String toString() {
        String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
        return retValue;
        }
      /**
       * This doesnot have a return type
       * When this function is invoked 1 is stored in data structure
       * This is invoked when bug moves right
       */
         public void moveRight() {
               Debug.printToStdout(3,"Move Right is called");
                movements.saveMovements(new Code(right));  
          }
     /**
       * This doesnot have a return type           
       * When this function is invoked 2 is stored in data structure
       * This is invoked when bug moves left 
       */
    public void moveLeft() {
    	Debug.printToStdout(3,"Move left is called");
    	movements.saveMovements(new Code(left));
    }
     /**
       * This doesnot have a return type           
       * When this function is invoked 3 is stored in data structure
       * This is invoked when bug moves Up 
       */
    public void moveUp() {
    	Debug.printToStdout(3,"Move Up is called");
    	movements.saveMovements(new Code(up));
    }
     /**
       * This doesnot have a return type           
       * When this function is invoked 4 is stored in data structure
       * This is invoked when bug moves down 
       */
    public void moveDown() {
    	Debug.printToStdout(3,"Move Down is called");
    	movements.saveMovements(new Code(down));
    }
     /**
       * This doesnot have a return type           
       * When this function is invoked 0 is stored in data structure
       * if no data is present.
       * This is invoked to undo previous move. 
       */
    public void undoPrev() {
    	Debug.printToStdout(3,"Undo prev is called");
        movements.undoMovements(new Code(undo));
    }
}
