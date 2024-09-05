package executionorder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTest {

	@Test
	public void first() {
		System.out.println("From first test annotated in AnnotationTest ..");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("From beforeMethode annotation in AnnotationTest ..");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("From afterMethode annotation in AnnotationTest ..");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("From beforeClass annotation test in AnnotationTest class ..");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("From afterClass annotation test in AnnotationTest class ..");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("From afterTest annotation in AnnotationTest class ..");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("From afterSuite annotation in AnnotationTest class ..");
	}
}
