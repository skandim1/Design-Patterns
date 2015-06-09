
package bugModel.driver;

import bugModel.results.Results;
import bugModel.results.Display;
import bugModel.results.FileLog;
import bugModel.results.StoreMovements;
import bugModel.bug.AllDirectionsBug;
import bugModel.bug.Bug;
import bugModel.util.Debug;

public class Driver{
        public String toString() {
        String retValue = "\n I am a 2015 Volkswagen Bettle Convertible \n";
        return retValue;
        }
	public static void main(String args[]) {

	               if(args.length < 2) {
	                        System.err.println("Usage:  FIXME\n");
	                        System.exit(1);
	                }
	                Debug.setvalue(Integer.parseInt(args[0]));
	                StoreMovements res = new Results();
	                AllDirectionsBug b = new Bug(res);

                   //All Test Cases
	               b.moveLeft();
	               b.moveUp();
	               b.moveDown();
	               b.moveRight();
	               b.undoPrev();
	               if(Integer.parseInt(args[0]) == 1)
	                ((Display)res).writeToScreen();

	                ((FileLog)res).writeToFile(args[1]);

	} // end main(...)

} // end public class Client

