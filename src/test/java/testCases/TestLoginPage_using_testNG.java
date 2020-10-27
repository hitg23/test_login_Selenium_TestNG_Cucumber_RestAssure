package testCases;

import org.testng.annotations.Test;

import helper.Browser;
import helper.LoginPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class TestLoginPage_using_testNG {
	WebDriver driver;
	LoginPage loginPage;

	@BeforeClass
	public void beforeTest() {
		new Browser("Firefox");
		driver = Browser.driver;
		loginPage = new LoginPage(driver);

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@AfterMethod
	public void afterTest() {
		System.out.println("### testing has been completed ###");

	}

	@Test(dataProvider = "correctCredentials")
	public void testCorrectCredentials(String name, String password) {
		// login test with correct user name and password
		driver = loginPage.login(name, password);
		Assert.assertTrue(driver.getCurrentUrl().contains("/secure"));
		driver = loginPage.logout();

	}

	// data provider for correct user name and password
	@DataProvider
	public Object[][] correctCredentials() {
		return new Object[][] {
				// add more correct credentials if needed
				new Object[] { "tomsmith", "SuperSecretPassword!" }

		};

	}

//login test with Wrong user name and password	
	@Test(dataProvider = "incorrectCredentials")
	public void testIncorrectCredentials(String name, String password) throws InterruptedException {
		// write your code over here
		driver = loginPage.login(name, password);
		Assert.assertTrue(driver.getCurrentUrl().contains("/login"));

	}

	// data provider for incorrect user name and password
	@DataProvider
	public Object[][] incorrectCredentials() {

		return new Object[][] {
				// add all possible combinations based on the password requirements
				new Object[] { "tomsmith", "SuperSecretPassword!!" }, // incorrect password
				new Object[] { "tomsmithh", "SuperSecretPassword!" }, // incorrect user name
				new Object[] { "tomsmith", "" }, // password empty
				new Object[] { "", "SuperSecretPassword!" }, // name empty
				new Object[] { "tomsmith1", "SuperSecretPassword!!" }, // both incorrect
				new Object[] { "", "" }, // both empty
				new Object[] { "tomsmith ", "SuperSecretPassword!" } // with space

		};

	}

}
