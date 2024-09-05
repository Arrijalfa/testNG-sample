package com.testng.dataprovider;

import org.testng.annotations.Test;

public class dataProviderAcceptanceExample {

	@Test(dataProvider = "testType", dataProviderClass=dataProviderSource.class)
	public void acceptanceTest(String data) {
		System.out.println("Acceptance testing: Data(" + data + ")");
	}
}
