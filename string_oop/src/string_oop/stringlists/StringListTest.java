package string_oop.stringlists;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import string_oop.String;

class StringListTest {

	@Test
	void test() {
		String hello = String.valueOf(new char[] {'h', 'e', 'l', 'l', 'o'});
		String world = String.valueOf(new char[] {' ', 'w', 'o', 'r', 'l', 'd', '!'});
		String[] myStrings = {hello, world};
		StringList myStringList = new StringList(myStrings);
		assertArrayEquals(new String[] {hello, world}, myStringList.getElements());
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}, myStringList.getConcatenation().toArray());
		
		myStrings[0] = null;
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}, myStringList.getConcatenation().toArray());
		
		String[] yourStrings = myStringList.getElements();
		yourStrings[0] = null;
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'}, myStringList.getConcatenation().toArray());
	}

}
