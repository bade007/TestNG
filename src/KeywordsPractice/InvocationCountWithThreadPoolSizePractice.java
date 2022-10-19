package KeywordsPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCountWithThreadPoolSizePractice {

	@Test(invocationCount = 10,threadPoolSize = 10)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\All Jar Files\\Chrome jar version 105\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//driver.close();
	}
}
