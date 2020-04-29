package com.epam.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeAinFirst2Chars {
	Remove2Chars remove2Chars;
	
	@AfterAll
	static void fun() {
		System.out.println("All Executed");
	}
	@BeforeEach
	void setup()
	{
		remove2Chars=new Remove2Chars();
	}
	@Test
	void testTwoAAchars() {
		assertEquals("", remove2Chars.remove("AA"));
	}
	@Test
	void testZeroChars() {
	
		assertEquals("",remove2Chars.remove(""));
	}
	@Test
	void testOneAChars() {
		assertEquals("", remove2Chars.remove("A"));
		}
	@Test
	void testOneBChars1() {
		assertEquals("B",remove2Chars.remove("B"));
		}
	@Test
	void testTwoABChars() {
		assertEquals("B", remove2Chars.remove("AB"));	
	}
	@Test
	void testTwoBAChars() {
		 assertEquals("B", remove2Chars.remove("BA"));
	}
	@Test
	void testNABChars() {
		 assertEquals("BAAA",remove2Chars.remove("ABAAA"));
	}
	@Test
	void testNAAChars() {
		assertEquals("BAAA",remove2Chars.remove("AABAAA"));
	}
	@Test
	void testNBAChars() {
		assertEquals("BBAAA",remove2Chars.remove("BABAAA"));
	}
	@Test
	void testAllAAChars() {
		assertEquals("A",remove2Chars.remove("AAA"));
	}
}
