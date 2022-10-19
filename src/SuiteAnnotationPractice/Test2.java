package SuiteAnnotationPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeClass
	public void openbrowser() {
		System.out.println("open the browser");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("close the browser");
	}
	
	@Test
	public void m4() {
		System.out.println("method 4");
	}
	
	@Test
	public void m5() {
		System.out.println("method 5");
	}
	
	@Test
	public void m6() {
		System.out.println("method 6");
	}
}
