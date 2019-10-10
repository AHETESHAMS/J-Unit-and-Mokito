package com.bridgelabz.ArmstrongNumberDemo;

public class ArmstrongNumberDemo 
{
	public static void main(String []args)
	{
		int number = 371;
		CheckArmstarongNumber checkArmstarongNumber = new CheckArmstarongNumber();
		boolean result = checkArmstarongNumber.check(number);
		System.out.println(result);
	}
}
