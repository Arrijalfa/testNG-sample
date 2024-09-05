import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class sampleTest {
	@BeforeSuite
	 public void beforeSuiteMethod() {
		//Bussiness Logic should be here
	        System.out.println("Executing before test suite.");
	    }
	 
	@AfterSuite
	 public void afterSuiteMethod() {
	        System.out.println("Executing after test suite.");
	    }
}
