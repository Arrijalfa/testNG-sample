package com.testng.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTestDependency {
	
	
	//Dependecy agar posisi test yang di execute beraturan
	//tapi ini tidak direkomendasikan karena ketika satu test failed, maka test dibawahnya akan di skip
	@Test
	public void start() {
		System.out.println("Starting the server");
	}
	
	@Test (dependsOnMethods="start")
	public void init() {
		System.out.println("Initializing the data for processing!");
	}
	
	@Test (dependsOnMethods="init")
	public void process() {
		System.out.println("Processing the data!");
	}
	
	@Test (dependsOnMethods="process")
	public void get() {
		Assert.assertTrue(false);
		System.out.println("Get the data!");
	}
	
	@Test (dependsOnMethods={"get","process","init"})
	public void stop() {
		System.out.println("Stoping the server");
	}
}
