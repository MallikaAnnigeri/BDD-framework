package stepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orange.pageobject.OrangeHrmlogin;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Orangeloginstepdif {
    public WebDriver driver;
    public OrangeHrmlogin lg;
    public Properties p;
    public WebDriverWait w;
    public SoftAssert a;
	@Test
	@Given("user should open the browser and enter the url")
	public void user_should_open_the_browser_and_enter_the_url() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		p=new Properties();
		FileInputStream fis=new FileInputStream("./TestProperty/Testdata.properties");
		p.load(fis);
		driver.get(p.getProperty("url"));
		
		
		
		
		
	    
	}

	@When("user enters valid use name {string} and password  {string} and click on login button")
	public void user_enters_valid_use_name_and_password_and_click_on_login_button(String usn, String pwd)  {
		lg=new OrangeHrmlogin(driver);
        // 10 seconds

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		lg.enterusn().sendKeys(usn);
		lg.enterpwd().sendKeys(pwd);
		lg.Click();
		
	   
	}

	@Then("homepage should be displayed")
	public void homepage_should_be_displayed() {
		String actual=driver.getCurrentUrl();
	
		
		
		Assert.assertEquals(actual,p.getProperty("expectedurl"));
	   
		
	}
	
	@When("user click on pim and then user should click on Add Emloyee")
	public void user_click_on_pim_and_then_user_should_click_on_add_emloyee() throws InterruptedException {
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("(//a)[3]"));
	
		button.click();
		Thread.sleep(3000);
		
		WebElement tab = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		 
		  tab.click();
	

	}

	@When("user should entire all details")
	public void user_should_entire_all_details(DataTable dataTable) {
           List<String> row1 = dataTable.asList();
		WebElement fn = driver.findElement(By.name("firstName"));
	
		fn.sendKeys(row1.get(0));
		
		
		WebElement mn = driver.findElement(By.name("middleName"));
	
		mn.sendKeys(row1.get(1));

		WebElement ln = driver.findElement(By.name("lastName"));
		
		ln.sendKeys(row1.get(2));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@When("user enters invalid username {string} and invalid password {string} and click on login Button")
	public void user_enters_invalid_username_and_invalid_password_and_click_on_login_button(String username, String password) throws InterruptedException {
		
        w= new WebDriverWait(driver, Duration.ofSeconds(10));

		lg=new OrangeHrmlogin(driver);
		WebElement usn = w.until(ExpectedConditions.visibilityOf(lg.enterusn()));
		usn.sendKeys(username);
	    lg.enterpwd().sendKeys(password);
	    lg.Click();
	}

	@Then("Error message {string} should be displayed")
	public void error_message_should_be_displayed(String expectedError) {
		String errorMsg = lg.alertMsg().getText();
		Assert.assertEquals(errorMsg,expectedError);
	
		
	    
	}





}
