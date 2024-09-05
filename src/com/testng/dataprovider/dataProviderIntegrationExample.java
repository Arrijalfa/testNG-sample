package com.testng.dataprovider;

import org.testng.annotations.Test;

public class dataProviderIntegrationExample {

	@Test(dataProvider = "testType", dataProviderClass=dataProviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration testing: Data(" + data + ")");
	}
}
