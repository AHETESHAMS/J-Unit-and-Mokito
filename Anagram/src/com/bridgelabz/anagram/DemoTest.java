package com.bridgelabz.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {

		CheckingAnagrams a=new CheckingAnagrams();
		assertTrue(a.checkAnagrams("earth", "heart"));
	}

}
