package com.testng.training;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
public class testParamaters {
	
	@Test
	@Parameters("browser")
	public void testCaseOne(String browser) {
		System.out.println("Browser passed as :- " + browser);
	}
	
	@Test
	@Parameters({"username", "password"})
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for username passed as :- " + username);
		System.out.println("Parameter for password passed as :- " + password);
	}
}
