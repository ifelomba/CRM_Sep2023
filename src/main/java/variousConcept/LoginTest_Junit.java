package variousConcept;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// how to use J-UNIT  class without java static/main method..

public class LoginTest_Junit {

	WebDriver driver;

	
	@Before
	public void init() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/blackexcellence/Downloads/chromedriver_mac64/chromedriver");

		// object to execute browser
		driver = new ChromeDriver();

		// to delete cookies

		driver.manage().deleteAllCookies();

		// go to website

		driver.get("https://www.techfios.com/billing/?ng=admin/");

		// to maximize

		driver.manage().window().maximize();

		
		//implicity wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	
	
	@Test
	public void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// insert password

		driver.findElement(By.id("password")).sendKeys("abc123");

		// click sign in button

		driver.findElement(By.name("login")).click();

	}

	        @After
       	public  void teardown() {

		 //close browser
     	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	        }
	

}
