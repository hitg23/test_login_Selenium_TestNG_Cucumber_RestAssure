package CucumberTestRunner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features/",
		glue = {"stepDefinitions"}
		//dryRun =true
		)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {
	 private static boolean initialized = false;
	    private static WebDriver driver;
	@Before
	public void initialize(){ if (!initialized){
         initialized = true;
 		
 		//driver.get("https://the-internet.herokuapp.com/login");
 		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);// wait will be applied for any element not available for the first try
 		System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
 		Scanner sc = new Scanner(System.in);
 		int browser;
 		System.out.print("Type 1 to select chrome or 2 to select firefox Browser: ");
 		browser = sc.nextInt();
 		if(browser ==1){
             System.setProperty("webdriver.chrome.driver", utility.PathList.chromeDriver);
         	driver = new ChromeDriver();
     	}else if(browser ==2){
             System.setProperty("webdriver.gecko.driver", utility.PathList.firefoxDriver);
         	driver = new FirefoxDriver();
     	}else{
     		System.out.println("chrome|firfox drivers are only available");
     		System.exit(0);
     	}
 		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	// wait will be applied for any element not available for the first try

     }
 }
 public static WebDriver getDriver(){
     return driver;
 }  
 

}
