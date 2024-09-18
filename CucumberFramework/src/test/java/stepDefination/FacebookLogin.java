package stepDefination;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	
	WebDriver driver;
	@Test
       @Given("when user enter url login page should be displayed")
	public void when_user_enter_url_login_page_should_be_displayed() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}

	@When("user enter all the details")
	public void user_enter_all_the_details(DataTable dataTable) {
        
                 
		
		List<String> data = dataTable.row(0);
		 driver.findElement(By.name("email")).sendKeys(data.get(0));
	        driver.findElement(By.name("pass")).sendKeys(data.get(1));

		       
	        }
	        
	  
	

	@When("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.name("login")).click();
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	   System.out.println("displayed");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		
	}

