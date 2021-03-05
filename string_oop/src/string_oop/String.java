package string_oop;

import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of text characters.
 * 
 * @invar The length is nonnegative.
 *    | toArray() != null
 * 
 * @immutable
 */
public class String {
	
	/**
	 * Returns the sequence of characters represented by this object in an array.
	 * 
	 * @inspects | this
	 * 
	 * @basic
	 */
	public char[] toArray() { throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * Returns the length of the sequence of text characters represented by this object. 
	 * 
	 * @inspects | this
	 * @post | result == toArray().length
	 */
	public int length() { throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * Returns the character at the given index in the sequence of characters represented by this object. 
	 * 
	 * @pre | 0 <= index && index < length()
	 * @post | result == toArray()[index]
	 */
	public char charAt(int index) { throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * Returns a String object that represents the given sequence of characters.
	 * 
	 * @inspects | characters
	 * @pre | characters != null
	 */
	public static String valueOf(char[] characters) { throw new RuntimeException("Not yet implemented."); }
	
}
