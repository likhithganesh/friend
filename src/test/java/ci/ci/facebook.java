package ci.ci;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class facebook {
	@Test

	public void facebook1() throws InterruptedException {
		// TODO Auto-generated method stub
		String urname = "9182418046";
		String passwor = "Abrs@143";
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA2ODU5MzUyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(urname);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys(passwor);
		driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		Thread.sleep(3000);
		
		
		
	}

}
