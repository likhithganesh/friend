package NEW;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import dev.failsafe.internal.util.Assert;

public class landingpage {
	WebDriver driver;
	expilice_wait wait = new expilice_wait(driver);
	String expated_text = "Create a FREE Account";

	public landingpage(WebDriver driver) {
		this.driver = driver;
		
	}
	By free = By.xpath("//span[normalize-space()='Free Trial']") ;
public void landpage() {
	
	driver.get("https://www.browserstack.com/guide/page-object-model-in-selenium");
}

public void freetrail() {
	wait.expilictwiat(free);
	
	driver.findElement(free).click();
	
	
}
public void textof() {
	 String textof =driver.findElement(By.xpath("//h1[normalize-space()='Create a FREE Account']")).getText();
	org.testng.Assert.assertEquals(textof, expated_text);
	System.out.println("veriyfed ");
}

	
}
