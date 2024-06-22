package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.OrangeHrmlogin;
import PageObject.OrangeLogout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrm1 {
	public WebDriver driver;
	public OrangeHrmlogin  ol;
	public OrangeLogout ot;
	
	@Test
	
	@Given("user should open the browser and enter the url  and login page should be displayed")
	public void user_should_open_the_browser_and_enter_the_url_and_login_page_should_be_displayed() {
	 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}

	@When("I user enters valid username {string}")
	public void i_user_enters_valid_username(String usn) throws InterruptedException {
		
		 ol=new OrangeHrmlogin(driver);
		  Thread.sleep(2000);
		  ol.enterusn().sendKeys(usn);
	
		 
	   
	}
	@When("user enters valid Password {string}  click on login button home page should be displayed")
	public void user_enters_valid_password_click_on_login_button_home_page_should_be_displayed(String pass) {
	   ol.enterpwd().sendKeys(pass);
	   String curl = driver.getCurrentUrl();
		 
		 Assert.assertEquals(curl,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}


	@Then("user should click on logout button")
	public void user_should_click_on_logout_button() throws InterruptedException {
		ot=new OrangeLogout(driver);
        Thread.sleep(2000);
		ot.logo.click();
        Thread.sleep(1000);

		ot.logout.click();
	   
		
	    
	}




}
