package objComp.driver;

import objComp.fileOperations.FileProcessor;
import objComp.util.MyLogger;
import objComp.util.PopulateObjects;

public class Driver {

	public static void main(String[] args) {
		if(args.length != 3) {
			System.err.println("enter valid arguments");
			System.exit(-1);
		}
		if(!((Integer.parseInt(args[2]) >= 0) && (Integer.parseInt(args[2]) <= 2))) {
			System.err.println("Invalid debug value");
			System.exit(-1);
		}
		MyLogger.getUniqueInstance().setvalue(Integer.parseInt(args[2]));	
		long NUM_ITERATIONS = Integer.parseInt(args[1]);	
		FileProcessor fp;
		PopulateObjects popObj = null;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<NUM_ITERATIONS;i++){		
			fp = new FileProcessor(args[0]);
			popObj = new PopulateObjects(fp);
			popObj.setTypes();
			popObj.deserObjects();	
		}
		long finishTime = System.currentTimeMillis();
		long total_time = (finishTime-startTime)/NUM_ITERATIONS;
		double total_time_seconds = ((double)total_time/1000);
		popObj.objCount();		
		System.out.println("Total time :"+total_time_seconds + " seconds");	
		
	}

}
