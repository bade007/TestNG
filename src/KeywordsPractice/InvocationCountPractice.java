package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountPractice {

	@BeforeClass
	public void openbrowser() {
		System.out.println("open the browser");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login to the app");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from the app");
	}
	
	@Test(priority = 1)
	public void profilepage() {
		System.out.println("check the profile page");
	}
	
	@Test(priority = 2,invocationCount = 3)
	public void homepage() {
		System.out.println("check the home page");
	}
}
