
package bugModel.results;

import bugModel.results.Code;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import bugModel.util.Debug;

public class Results implements Display,FileLog,StoreMovements{

        ArrayList<Code> Allmovements;
     /**
       * This doesnot have a return type           
       * This constructor is called when an object is called
       * In this constructor array list is created.
       */
        public Results(){
               Debug.printToStdout(4,"Results Constructor is called");
               Allmovements = new ArrayList<Code>();
        }
        public String toString() {
        String retValue = "\n Results Class \n";
        return retValue;
        }
     /**
       * This doesnot have a return type           
       * This function prints the data in the data structure to console
       */
	public void writeToScreen() {
                Debug.printToStdout(3,"writeToScreen method is called");
		Debug.printToStdout(1,"Writing Results to stdout");
		for (int i = 0; i < Allmovements.size(); i++) {
			System.out.print(Allmovements.get(i).getinputMovement());
		}
		System.out.print("\n");
	}
     /**
       * This doesnot have a return type
       * This function prints the data in the data structure to bugLog.txt file
       */
	public void writeToFile(String filepath) {
                Debug.printToStdout(3,"writeToFile method is called");

        Writer fileWriter = null;
        BufferedWriter bufferWriter = null;
        try {
               File file = new File(filepath);
               if(!(file.exists()))
                     file.createNewFile();
        	fileWriter = new FileWriter(file,true);
        	bufferWriter = new BufferedWriter(fileWriter);

                for (int i = 0; i < Allmovements.size(); i++) {
                        bufferWriter.write(Allmovements.get(i).getinputMovement());
               }

        } catch (IOException e) {
        	System.err.println("Error writing the file : ");
        	e.printStackTrace();
        } finally {
        	if(bufferWriter != null && fileWriter != null) {
        		try {
        			bufferWriter.close();
        			fileWriter.close();
        		} catch (IOException e) {
        			e.printStackTrace();
        		}
        	}
        }
	}

   /**
       * This doesnot have a return type
       * This function saves the movements of the bug in the datastructure
       * This is invoked for every movement of bug
       */
	public void saveMovements(Code c) {
		Debug.printToStdout(3,"Save Movements is called");
		Allmovements.add(c);
		Debug.printToStdout(2,"Changes made to DataStructure...Entry added");
	}
   /**
       * This doesnot have a return type
       * This function undo the previous movement of the bug
       * If there is no previous movement 0 is added to the datastructure
       */
	public void undoMovements(Code c) {
		Debug.printToStdout(3,"Undo Movements is called");
		if(!(Allmovements.isEmpty())) {
			Allmovements.remove(Allmovements.size()-1);
		}
		if(Allmovements.isEmpty())
			Allmovements.add(c);
	}
}

