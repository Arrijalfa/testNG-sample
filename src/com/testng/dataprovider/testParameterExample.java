package com.testng.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testParameterExample {

	@Test (dataProvider = "getData", priority = 1)
	public void testAddition(int actual, int expected) {
		int actualValue = actual + 20;
		Assert.assertEquals(actualValue, expected);
	}
	
	@Test (dataProvider = "doubleSet", priority = 2)
	public void testAddition2(int actual2, int expected2) {
		int actualValue2 = actual2 + 20;
		Assert.assertEquals(actualValue2, expected2);
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{100, 120},
			{200, 220},
			{250, 270},
			{300, 310},
			{400, 420}
		};
	}
	
	@DataProvider (name = "doubleSet")
	public Object[][] getDataSet2() {
		return new Object[][] {
			{10, 30},
			{20, 40}
		};
	}
}
