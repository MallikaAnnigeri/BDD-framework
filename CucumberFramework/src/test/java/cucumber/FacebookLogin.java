package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	
public WebDriver driver;
	
	@Test
	@Given("user open browser and enter url facebook login page should be displayed")
	public void user_open_browser_and_enter_url_facebook_login_page_should_be_displayed() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
		
	

	@When("user enters valid username and password and click on login button")
	public void user_enters_valid_username_and_password_and_click_on_login_button() {
	   driver.findElement(By.id("email")).sendKeys("Mallika");
	   driver.findElement(By.name("pass")).sendKeys("mallika@123");
	   driver.findElement(By.xpath("//button[.='Log in']")).click();
	}

	@Then("Home page should be dispalyed")
	public void home_page_should_be_dispalyed() {
	   
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://www.facebook.com/");
	}




}
