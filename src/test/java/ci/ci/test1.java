package ci.ci;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	
	WebDriver driver ;
@Test(priority = 1)
	public void testcase3() {
		
		 driver = new ChromeDriver();
		driver.get("https://exlink.pmkisan.gov.in/Index.aspx");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		
	}
	
	

@AfterTest
public void teardown() {
	driver.close();
		
	}}


