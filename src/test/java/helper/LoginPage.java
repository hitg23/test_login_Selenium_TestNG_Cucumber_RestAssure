package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver ;
	String login_url = "https://the-internet.herokuapp.com/login";

	// constructor that run by the time you call login page class
	public LoginPage(WebDriver driver){
		driver.get(login_url);
		this.driver=driver;
		PageFactory.initElements(driver,  this);
	}
	
	// elements on login page
	@FindBy(id="username") public WebElement uName;
	@FindBy(id="password") public WebElement password;
	@FindBy(xpath="//form/button") public WebElement login_btn;
	@FindBy(partialLinkText="Logout") public WebElement logout_btn;
	
	// takes your driver and returns you the current title of the page
	public String getTitle(WebDriver driver){
		return driver.getTitle();
	}

	public WebDriver login(String usrName, String pass){
		// method to type user name and pass and click to sign
		uName.sendKeys(usrName);
		password.sendKeys(pass);
		login_btn.click();
		return this.driver;
	}
	
	public WebDriver logout() {
		logout_btn.click();
		return this.driver;
		
	}

}
