package NEW;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basetest {
	WebDriver driver ;
	public landingpage lp;
	
	public WebDriver intalizeDriver() throws IOException {
		Properties prob = new Properties();
		FileInputStream files = new FileInputStream("C:\\Users\\Likhith Ganesh\\Desktop\\testing\\.metadata\\ci\\src\\test\\java\\NEW\\PRO.properties");
		
		prob.load(files);
		 String browsername=prob.getProperty("browser");
		 if(browsername.equalsIgnoreCase("chrome")) {
		
		 driver = new ChromeDriver();
		
	}
		 else if (browsername.equalsIgnoreCase("firefox")) {
			  driver = new FirefoxDriver();
				
		} else if (browsername.equalsIgnoreCase("edge")) {
			  driver = new EdgeDriver();
					
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().window().maximize();
			return driver;	
			
		}
@BeforeMethod
	public  landingpage lanchingapp() throws IOException  {
	 
	 driver =intalizeDriver();
	 lp = new landingpage(driver);
	 lp.landpage();
	 return lp;
	 
	}
@AfterMethod
public void teardown() {
	driver.close();
	System.out.println("close");
}
	
}
