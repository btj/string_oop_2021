package string_oop;

import java.util.stream.IntStream;

/**
 * Each instance of this class represents a sequence of text characters.
 * 
 * @invar The length is nonnegative.
 *    | 0 <= length()
 * 
 * @immutable
 */
public class String {
	
	/**
	 * Returns the length of the sequence of text characters represented by this object. 
	 * 
	 * @inspects | this
	 * @basic
	 */
	public int length() { throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * Returns the character at the given index in the sequence of characters represented by this object. 
	 * 
	 * @pre | 0 <= index && index < length()
	 * @basic
	 */
	public char charAt(int index) { throw new RuntimeException("Not yet implemented."); }
	
	/**
	 * Returns the sequence of characters represented by this object in an array.
	 * 
	 * @post | result != null
	 * @post | result.length == length()
	 * @post | IntStream.range(0, length()).allMatch(i -> result[i] == charAt(i))
	 */
	public char[] toArray() { throw new RuntimeException("Not yet implemented."); }
	
}
