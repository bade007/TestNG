package KeywordsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonMethodKeywordPractice {

	@Test(priority = 1)
	public void OpenUrl() {
		System.out.println("launch the url");	
	}
	
	@Test(priority = 2,dependsOnMethods = "OpenUrl")
	public void Login() {
		System.out.println("login to the application");
		Assert.fail();
	}
	
	@Test(priority = 3,dependsOnMethods = {"OpenUrl","Login"})
	public void Logout() {
		System.out.println("logout from the application");
	}
	
}
