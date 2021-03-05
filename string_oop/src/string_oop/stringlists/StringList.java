package string_oop.stringlists;

import string_oop.String;

/**
 * Each instance of this class stores a sequence of strings.
 * 
 */
public class StringList {

	public String[] getElements() { throw new RuntimeException("Not yet implemented"); }
	
	public String getConcatenation() {
		String[] elements = getElements();
		String result = String.valueOf(new char[0]);
		for (String element : elements) {
			result = result.concatenate(element);
		}
		return result;
	}
	
	public StringList(String[] elements) { throw new RuntimeException("Not yet implemented"); }
	
}
