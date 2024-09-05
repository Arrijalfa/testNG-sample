package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testOne() {
		System.out.println("Hi, I am test one ...");
		Assert.assertEquals("Facebook", "Facebook");
	}
	
	@Test 
	public void testTwo() {
		System.out.println("Hi, I am test two ...");
		Assert.assertEquals(404, 200);
	}
	
	@Test 
	public void testThree() {
		System.out.println("Hi, I am test three ...");
		Assert.assertTrue(true);
	}
	
	@Test 
	public void testFour() {
		System.out.println("Hi, I am test four ...");
		Assert.assertTrue(false, "Making test failure");
	}
	
	@Test 
	public void testFive() {
		System.out.println("Hi, I am test five ...");
	}
	
	@Test 
	public void testSix() {
		System.out.println("Hi, I am test six ...");
	}
}
