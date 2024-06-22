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

public class OrangeHRM {
	
	public WebDriver driver;
	public OrangeHrmlogin  ol;
	public OrangeLogout ot;
	@Test
	
	 
	@Given("user should open browser and enter Url")
	public void user_should_open_browser_and_enter_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}

	@When("When user Enter valid usernam    {string} and Password {string} and click on login button")
	public void when_user_enter_valid_usernam_and_password_and_click_on_login_button(String usn, String pass) throws InterruptedException {
		
	  ol=new OrangeHrmlogin(driver);
	  Thread.sleep(2000);
	  ol.enterusn().sendKeys(usn);
	  ol.enterpwd().sendKeys(pass);
	  ol.Click().click();
	}

	@Then("Home Page should be displayed")
	public void home_page_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
	 String curl = driver.getCurrentUrl();
			 
	 Assert.assertEquals(curl,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}

	@Then("User should click on logout button")
	public void user_should_click_on_logout_button() throws InterruptedException {
		ot=new OrangeLogout(driver);
        Thread.sleep(2000);
		ot.logo.click();
        Thread.sleep(1000);

		ot.logout.click();
	   
	}

}
