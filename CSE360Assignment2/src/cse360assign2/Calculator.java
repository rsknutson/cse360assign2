package cse360assign2;

/**
 * This Calculator program simulates basic calculator functions
 * 
 * @author Randall Knutson
 * @ version 2.0
 *
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructor method for Calculator, initializes the int total
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Getter for the current total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds an inputed number to the total
	 * @param value The value to add
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * subtracts the total by the inputed number 
	 * @param value The number to subtract by
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the total by the inputed number
	 * @param value The number to multiply by
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/**
	 * Divides the total by the inputed number.
	 * If the parameter is zero, the total is set to zero
	 * @param value The number to divide by
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}	
	}
	
	/**
	 * Returns a string of the history of operations performed
	 * @return The string of history
	 */
	public String getHistory () {
		return "";
	}
}