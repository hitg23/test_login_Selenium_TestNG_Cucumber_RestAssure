package helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver driver;

	public Browser(String browserName) {
		boolean found = false;
		if (browserName == "Chrome") {
			System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
			driver = new ChromeDriver();
			found = true;

		} else if (browserName == "Firefox") {
			System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
			driver = new FirefoxDriver();
			found = true;

		} else {
			System.out.println("Chrome| Firefox");
		}

		// open Web site if driver is ready
		if (found) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		}

	}

}
