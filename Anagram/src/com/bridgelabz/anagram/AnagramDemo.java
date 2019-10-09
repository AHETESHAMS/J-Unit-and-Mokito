package com.bridgelabz.anagram;

public class AnagramDemo 
{
	public static void main(String []args)
	{
		String firstString = "earth";
		String secondString = "heart";
		CheckingAnagrams checkingAnagrams = new CheckingAnagrams();
		boolean result = checkingAnagrams.checkAnagrams(firstString,secondString);
		System.out.println(result);
		if(result == true)
			System.out.println("Anagram");
		else 
		{
			System.out.println("Not Anagram");
		}
	}
}
