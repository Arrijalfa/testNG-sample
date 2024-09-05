package com.testng.training;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test
	public void testOne() {
		System.out.println("Hi, I am test one ...");
	}
	
	@Test (priority = 3)
	public void testTwo() {
		System.out.println("Hi, I am test two ...");
	}
	
	@Test (priority = 2)
	public void testThree() {
		System.out.println("Hi, I am test three ...");
	}
	
	@Test (priority = 1)
	public void testFour() {
		System.out.println("Hi, I am test four ...");
	}
}
