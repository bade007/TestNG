package TestAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeTest
	public void OpenDB() {
		System.out.println("Open the database");
	}
	
	@AfterTest
	public void CloseDB() {
		System.out.println("CLOSE THE DATABASE");
	}
	
	@BeforeClass
	public void Openbrowser() {
		System.out.println("Open the browser");
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
