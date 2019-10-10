package com.bridgelabz.anagram;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestAnagram
{
	
	@Test
	public void test()
	{
		assertTrue(new CheckingAnagrams().checkAnagrams("earth", "heart"));
	}
}
