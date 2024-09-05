package com.testng.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
	
	@Test
	public void testOne() {
		System.out.println("Hi, I am test one ...");
	}
	
	@Test (enabled = false)
	public void testTwo() {
		System.out.println("Hi, I am test two ...");
	}
	
	@Test
	public void testThree() {
		System.out.println("Hi, I am test three ...");
		
		throw new SkipException("Skipping Delibretly, As this Test is incomplete");
	}
	
	@Test
	public void testFour() {
		System.out.println("Hi, I am test four ...");
	}
}
