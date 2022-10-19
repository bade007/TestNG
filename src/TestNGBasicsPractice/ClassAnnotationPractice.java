package TestNGBasicsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassAnnotationPractice {

	@BeforeClass
	public void Login() {
		System.out.println("Login to the application");
	}
	
	@AfterClass
	public void Logout() {
		System.out.println("Logout from the application");
	}
	
	@Test(priority = 1)
	public void homepage() {
		System.out.println("caheck the home page");
	}
	
	@Test(priority = 2)
	public void notificationpage() {
		System.out.println("check the notification page");
	}
	
	@Test(priority = 3)
	public void profilepage() {
		System.out.println("check the profile page");
	}
}
