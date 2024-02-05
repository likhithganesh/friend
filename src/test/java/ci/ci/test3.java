
package ci.ci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test3 {
	@Test
	public void case3 () {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.angelone.in/trade/watchlist/chart");
		System.out.println(driver.getTitle());
	}
	
	
	}


