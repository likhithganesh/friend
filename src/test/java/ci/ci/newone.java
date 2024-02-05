package ci.ci;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class newone {
	WebDriver 
	driver;
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	@Test(priority = 3)
	public void tst1() {
		 driver = new ChromeDriver();
		driver.get("https://exlink.pmkisan.gov.in/Index.aspx");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	}
	
}
