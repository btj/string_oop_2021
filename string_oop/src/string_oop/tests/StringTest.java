package string_oop.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import string_oop.String;

class StringTest {

	@Test
	void test() {
		char[] helloChars = {'h', 'e', 'l', 'l', 'o'};
		
		String hello = String.valueOf(helloChars);
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, hello.toArray());
		
		assertEquals(5, hello.length());
		assertEquals('h', hello.charAt(0));
		
		helloChars[0] = 'b';
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, hello.toArray());
		
		char[] myChars = hello.toArray();
		myChars[0] = 'b';
		assertArrayEquals(new char[] {'h', 'e', 'l', 'l', 'o'}, hello.toArray());
	}

}
