package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import CucumberTestRunner.TestRunnerTestNG;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest {
	WebDriver driver = TestRunnerTestNG.getDriver();
	
	@Given("^I am in internet\\.herokuapp login page \"(.*?)\"$")
	public void i_am_in_internet_herokuapp_login_page(String url) throws Throwable {
		driver.get(url);
	}

	@When("^I type user name=\"(.*?)\" and password=\"(.*?)\"$")
	public void i_type_user_name_and_password(String name, String password) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		driver.findElement(By.xpath("//form/button")).click();
	}

	@Then("^\"(.*?)\" should open$")
	public void should_open(String endpoint) throws Throwable {
		String actual_url = driver.getCurrentUrl();
		Assert.assertTrue(actual_url.contains(endpoint));
	}


}