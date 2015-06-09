package objComp.util;

public class Second {
	private double DoubleValue;
	private int IntValue;
   	/**
   	 * To know about a class
   	 * @param : none
   	 * @return : String
   	 */
	public String toString() {
		String str = "Second class tostring method\n";
		return str;
	}
	/**
	 * Empty constructor
	 */
	public Second() {
		
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
	 * set DoubleValue
	 * @param : double
	 * @return : none
	 */
	public void setDoubleValue(double dIn) {
		DoubleValue = dIn;
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
		long temp;
		temp = Double.doubleToLongBits(DoubleValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + IntValue;
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
		Second other = (Second) obj;
		if (Double.doubleToLongBits(DoubleValue) != Double
				.doubleToLongBits(other.DoubleValue))
			return false;
		if (IntValue != other.IntValue)
			return false;
		return true;
	}
}
