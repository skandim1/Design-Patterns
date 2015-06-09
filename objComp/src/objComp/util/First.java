package objComp.util;

public class First {
	private int IntValue;
	private String StringValue;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "First class tostring method\n";
		return str;
	}
	
	/**
	 * Empty constructor
	 */
	public First() {
		
	}
	
	/**
	 * set IntValue
	 * @param : int
	 * @return : none
	 */
	public void setIntValue(int iIn) {
		IntValue = iIn;
	}
	
	/**
	 * set IntValue
	 * @param : String
	 * @return : none
	 */
	public void setStringValue(String sIn) {
		StringValue = sIn;
	}
	
	/**
	 * hashCode
	 * @param : none
	 * @return : int
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + IntValue;
		result = prime * result
				+ ((StringValue == null) ? 0 : StringValue.hashCode());
		return result;
	}
	
	/**
	 * equals
	 * @param : Object
	 * @return : boolean
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		First other = (First) obj;
		if (IntValue != other.IntValue)
			return false;
		if (StringValue == null) {
			if (other.StringValue != null)
				return false;
		} else if (!StringValue.equals(other.StringValue))
			return false;
		return true;
	}
}
