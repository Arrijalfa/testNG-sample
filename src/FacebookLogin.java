import org.testng.annotations.Test;

public class FacebookLogin {
		
		@Test
		public void loginWithValidCredentials () {
			System.out.println("Hi, Im successfuly Login");
		}
		
		@Test
		public void loginWithInvalidCredentials () {
			System.out.println("Hi, Im not able to login");
		}
}
