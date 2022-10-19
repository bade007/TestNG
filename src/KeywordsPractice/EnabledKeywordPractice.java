package KeywordsPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EnabledKeywordPractice {

  @BeforeClass
  public void LaunchtheBrowser() {
	  System.out.println("browser is launched");
  }
  
  @AfterClass
  public void ClosetheBrowser() {
	  System.out.println("browser is closed");
  }
  
  @BeforeMethod
  public void Login() {
	  System.out.println("login to the application");
  }
  
  @AfterMethod
  public void Logout() {
	  System.out.println("logout from the application");
  }
  
  @Test(priority = 1)
  public void homepage() {
	  System.out.println("check the homepage");
  }
  
  @Test(priority = 2,invocationCount = 5,enabled = false)
  public void profilepage() {
	  System.out.println("check the profilepage");
  }
  
  @Test(priority = 3)
  public void settingpage() {
	  System.out.println("check the settingpage");
  }
	
}