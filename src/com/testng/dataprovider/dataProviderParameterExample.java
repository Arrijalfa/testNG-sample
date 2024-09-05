package com.testng.dataprovider;

import org.testng.annotations.Test;

public class dataProviderParameterExample {

	@Test(dataProvider = "scenarioData", dataProviderClass=dataProviderSource.class)
	public void scenario1 (String scenarioData) {
		System.out.println("Scenario testing: Data(" + scenarioData + ")");
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass=dataProviderSource.class)
	public void scenario2 (String scenarioData) {
		System.out.println("Scenario testing: Data(" + scenarioData + ")");
	}
	
	@Test(dataProvider = "scenarioData", dataProviderClass=dataProviderSource.class)
	public void scenario3 (String scenarioData) {
		System.out.println("Common Scenarios testing: Data(" + scenarioData + ")");
	}
}
