package com.bridgelabz.ArmstrongNumberDemo;

public class CheckArmstarongNumber 
{
	public boolean check(int number)
	{
		int sum=0;
		int rem ;
		int originalNumber = number;
		while(number!=0)
		{
			rem = number%10;
			number = number/10;
			sum = sum+(rem*rem*rem);
		}
		if(originalNumber==sum)
			return true;
		return false;
		
	}
}
