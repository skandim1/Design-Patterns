package bugModel.results;

import bugModel.util.Debug;

public class Code {

       private String BugMovements;
   /**
       * This doesnot have a return type
       * This constructor  takes string input and assigns
       * to BugMovements 
       */
       public Code(String input) {
              Debug.printToStdout(4,"Code constructor is called");
              BugMovements = input;
       }
     /**
       * Return the string 
       * This function is called in write to screen and 
       * write to functions in the results class.
       */
       public String getinputMovement() {
              Debug.printToStdout(3,"getinputMovement method  is called");
              return BugMovements;
       }

}
