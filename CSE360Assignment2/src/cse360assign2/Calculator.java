package cse360assign2;

/**
 * This Calculator program simulates basic calculator functions
 * Class ID: 443
 * Assignment #2
 * 
 * @author Randall Knutson
 * @version 3.0
 *
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor method for Calculator, initializes the int total and the String history
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Getter for the current total
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * adds an inputed number to the total, and updates the String history
	 * @param value The value to add
	 */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**
	 * subtracts the total by the inputed number and updates the String history
	 * @param value The number to subtract by
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies the total by the inputed number, and updates the String history
	 * @param value The number to multiply by
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**
	 * Divides the total by the inputed number, and updates the string history
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
		
		history = history + " / " + value;
	}
	
	/**
	 * Returns a string of the history of operations performed
	 * @return The string history
	 */
	public String getHistory () {
		return history;
	}
}