package objComp.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import objComp.fileOperations.FileProcessor;

public class PopulateObjects {
	private FileProcessor fp;
	Map<First,Integer> f = new HashMap<First,Integer>();
	Map<Second,Integer> s = new HashMap<Second,Integer>();
	Map<String, Class<?>> preElem = new HashMap<String, Class<?>>();
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "PopulateObjects class tostring method\n";
		return str;
	}
	/**
	 * PopulateObjects Constructor
	 * @param : FileProcessor
	 * @return : none
	 */
	public PopulateObjects(FileProcessor fp) {
		MyLogger.getUniqueInstance().printToStdout(1,"PopulateObjects class: Constructor method invoked");
		this.fp = fp;
	}
	/**
	 * set Types
	 * @param : none
	 * @return : none
	 */
	public void setTypes(){	
		MyLogger.getUniqueInstance().printToStdout(2,"PopulateObjects class: setTypes method invoked");
		preElem.put("int", Integer.TYPE);
		preElem.put("Integer", Integer.class);
		preElem.put("double", Double.TYPE);
		preElem.put("String", String.class);
	}
	/**
	 * object count
	 * @param : none
	 * @return : none
	 */
	public void objCount() {
		MyLogger.getUniqueInstance().printToStdout(2,"PopulateObjects class: objCount method invoked");
		int fCount = 0;
		int sCount = 0;
		for(int c:f.values()) {
			fCount += c;
		}
		for(int c:s.values()) {
			sCount += c;
		}
		MyLogger.getUniqueInstance().printToStdout(0,"Number of non-duplidate First objects: "+f.size());
		MyLogger.getUniqueInstance().printToStdout(0,"Total Number of First objects: "+fCount);
		MyLogger.getUniqueInstance().printToStdout(0,"Number of non-duplidate Second objects: "+s.size());
		MyLogger.getUniqueInstance().printToStdout(0,"Total Number of Second objects: "+sCount);
	}
	/**
	 * deserObjects
	 * @param : none
	 * @return : none
	 */
	public void deserObjects() {
		MyLogger.getUniqueInstance().printToStdout(2,"PopulateObjects class: deserObjects method invoked");
		String str;
		int count = 0;
		Object obj = null;
		Class<?> cls = null;
		String patternString = ", ";
	    Pattern pattern = Pattern.compile(patternString);
		while((str=fp.readFromFile())!=null) {
		  if(!str.isEmpty()) {
			try {
				if(str.contains("fqn:")) {
				str=str.replace("fqn:", "").trim();
				cls = Class.forName(str);
				obj = cls.newInstance();  
				}
				else {
		        String[] split1 = pattern.split(str); 
		        obj = setObject(cls, obj, split1);
		          count++;
				  if(count == 2) {
					if(obj instanceof First){
						if(!f.containsKey((First) obj))
						f.put((First) obj,1);
						else
							f.put((First) obj, f.get((First) obj)+1);
					}
					else if (obj instanceof Second){		
						if(!s.containsKey((Second) obj))
						s.put((Second) obj,1);
						else
							s.put((Second) obj, s.get((Second) obj)+1);
	
					}
					count = 0;
				  }
				}
			} catch (ClassNotFoundException e) {
				System.err.println("Invalid Class type");
				System.exit(-1);
			} catch (InstantiationException e) {
				System.err.println("Invalid instantiation");
				System.exit(-1);
			} catch (IllegalAccessException e) {
				System.err.println("Illegal access");
				System.exit(-1);
			} catch (SecurityException e) {
				System.err.println("Security Exception");
				System.exit(-1);
			} catch (IllegalArgumentException e) {
				System.err.println("Illegal arguments");
				System.exit(-1);
			} 
		  }
		}
	}
	/**
	 * set Object
	 * @param : Class<?>, Object, String[]
	 * @return : Object
	 */
	public Object setObject(Class<?> cls,Object obj,String[] str) {	
		try {
			String type = str[0].replace("type=", "").trim();
	        String var = str[1].replace("var=", "").trim();
	        String value = str[2].replace("value=", "").trim();        
	        
			Class<?>[] signature = new Class<?>[1];  
	        signature[0] = preElem.get(type);
	        
	        String methodName = "set" + var;
	        Method meth;
			meth = cls.getMethod(methodName, signature);
		    Object[] params = new Object[1]; 
		        if(type.equals("int") || type.equals("Integer")){
			    	params[0] = Integer.parseInt(value);			
			    }
			    else if(type.equals("double") || type.equals("Double")){
			    	params[0] = Double.parseDouble(value);
			    }
			    else if(type.equals("String")){
			    	params[0] = value;
			    }
		        meth.invoke(obj, params);
		} catch (NoSuchMethodException e) {
			System.err.println("No Such Method Found");
                        System.exit(-1);
		} catch (SecurityException e) {
			System.err.println("Security Exception");
                        System.exit(-1);
		} catch (IllegalAccessException e) {
                        System.err.println("Illegal access");
                        System.exit(-1);
		} catch (IllegalArgumentException e) {
			System.err.println("Illegal arguments");
                        System.exit(-1);
		} catch (InvocationTargetException e) {
			System.err.println("Invalid invocatio target");
                        System.exit(-1);
		}     
		return obj;
	}
}
