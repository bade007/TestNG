package TestNGBasicsPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodPractice {

	@BeforeMethod
	public void Login() {
		System.out.println("login to the application");
		Reporter.log("login to the application");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("logout from the application");
		Reporter.log("logout to the application");
	}
	
	@Test(priority = 1)
	public void profilepage() {
		System.out.println("check the profile page");
		Reporter.log("check the profile page");
	}
	
	@Test(priority = 2)
	public void notificationpage() {
		System.out.println("check the notification page");
		Reporter.log("check the notification page");
	}
	
	@Test(priority = 3)
	public void homepage() {
		System.out.println("check the home page");
		Reporter.log("check the home page");
	}
}
