package com.bridgelabz.addtionoftwonumbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddition {

	@Test
	void test() {
		assertEquals(25,new Add().add(20, 5));
		assertEquals(15,new Substract().substract(5, 20));
		assertEquals(4,new Divide().divide(20, 5));
	}
	
}