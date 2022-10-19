package TestNGBasicsPractice;

import org.testng.annotations.Test;

public class IntroductionPractice {

	@Test(priority = 1)
	public void OpenUrl() {
		System.out.println("Open the Url");
	}
	
	@Test(priority = 2)
	public void Login() {
		System.out.println("login to the application");
	}
	
	@Test(priority = 3)
	public void Logout() {
		System.out.println("logout from the application");
	}
}
