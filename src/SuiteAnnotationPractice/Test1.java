package SuiteAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeSuite
	public void Emailconfigure() {
		System.out.println("Email is configured");
	}
	
	@AfterSuite
	public void EmailSent() {
		System.out.println("Email is sent after the declaration ");
	}
	
	@BeforeTest
	public void OpenDB() {
		System.out.println("open the database");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("close the database");
	}
	
	@BeforeClass
	public void openbrowser() {
		System.out.println("open the browser");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@Test
	public void m1() {
		System.out.println("method 1");
	}
	
	@Test
	public void m2() {
		System.out.println("method 2");
	}
	
	@Test
	public void m3() {
		System.out.println("method 3");
	}
}
