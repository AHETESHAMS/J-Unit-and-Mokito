package com.bridgelabz.ArmstrongNumberDemo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArstrongNumberTesting {

	@Test
	void test() 
	{
		assertTrue(new CheckArmstarongNumber().check(153));
	}

}
