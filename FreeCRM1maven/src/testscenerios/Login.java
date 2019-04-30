package testscenerios;




import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
	}
	@Test
	public void valid_logincredentials() {
		Logger log = Logger.getLogger("devpinoyLogger");
		
		
        driver.get("https://freecrm.com/");
         //log.debug("opening website");
        log.debug("opening website");
		
		
		
		String title=driver.getTitle();
		
		Assert.assertEquals("#1 Free CRM software in the Cloud FreeCRM", title);
		
		System.out.println(title);
		System.out.println("test passed");}
		
	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
