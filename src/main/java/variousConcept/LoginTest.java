package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {

		init();
		logintest();
		teardown();

		// to do a negative test case just manipulate one of methods with a fake user
		// identity.or password...

	}

	public static void init() {

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

	}

	public static void logintest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");

		// insert password

		driver.findElement(By.id("password")).sendKeys("abc123");

		// click sign in button

		driver.findElement(By.name("login")).click();

	}

	public static void teardown() {

		// close browser
		driver.close();

	}

}
