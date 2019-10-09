package com.bridgelabz.anagram;
public class CheckingAnagrams 
{
	public boolean checkAnagrams(String firstString, String secondString)
	{
		char[] firstCharArray = firstString.toCharArray();
		char[] secondCharArray = secondString.toCharArray();
		int found = 0;
		for(int i=0;i<firstString.length();i++)
		{
			for(int j=0;j<secondString.length();j++)
			{
				if(firstCharArray[i] == secondCharArray[j])
				{
					found++;
				}
			}
		}
		if(found == firstString.length())
			return true;
		else
			return false;
	}
}
