package wordCount.driver;


import wordCount.treesForStrings.DataElement;
import wordCount.util.FileProcessor;
import wordCount.util.MyLogger;
import wordCount.visitors.PopulateTreeVisitor;
import wordCount.visitors.Visitor;
import wordCount.visitors.WordCountVisitor;

public class Driver {

	public static void main(String[] args) {
		if(args.length == 4) {
			if((Integer.parseInt(args[3]) >= 0) && (Integer.parseInt(args[3]) <= 2)) {
				 MyLogger.getUniqueInstance().setvalue(Integer.parseInt(args[3]));
			} else {
				System.err.println("Invalid debug value");
				System.exit(-1);
			}
		long NUM_ITERATIONS = Integer.parseInt(args[2]);	
		FileProcessor fp = new FileProcessor(args[0],args[1]);;
		long startTime = System.currentTimeMillis();
		
		for(int i=0;i<NUM_ITERATIONS;i++){
			DataElement e = new DataElement();		
			fp = new FileProcessor(args[0],args[1]);
			Visitor ptVisitor = new PopulateTreeVisitor(fp);
			Visitor wcVisitor = new WordCountVisitor(fp);
			e.accept(ptVisitor);
			e.accept(wcVisitor);		
		}
			long finishTime = System.currentTimeMillis();
			long total_time = (finishTime-startTime)/NUM_ITERATIONS;
			fp.writeToFile("total time :"+total_time);
			if(Integer.parseInt(args[3]) == 0)
			System.out.println("total time :"+total_time);	
		} else{
			System.out.println("enter valid arguments");
			System.exit(-1);
		}
	}

}
