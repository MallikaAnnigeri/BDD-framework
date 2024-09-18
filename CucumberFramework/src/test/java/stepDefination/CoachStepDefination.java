package stepDefination;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.coach.pageObject.HomePage;
import com.coach.pageObject.ProductDescriptionPage;
import com.coach.pageObject.ProductListPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CoachStepDefination {
	WebDriver driver;
	HomePage hp;
	ProductListPage plp;
	ProductDescriptionPage pdp;
	WebDriverWait w;
	
	@Test
	@Given("open the browser enter the url")
	public void open_the_browser_enter_the_url() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.coach.com/");
		
	   	}

	@When("user should enter {string} into search field")
	public void user_should_enter_into_search_field(String data) {
		hp=new HomePage(driver);
	     w=new WebDriverWait(driver,Duration.ofSeconds(5));

	w.until(ExpectedConditions.visibilityOf(hp.Search())).sendKeys(data,Keys.ENTER);
		
	   	}

	@Then("gifts product list page should be displayed")
	public void gifts_product_list_page_should_be_displayed() {
		plp =new ProductListPage(driver);
		w.until(ExpectedConditions.visibilityOf(plp.GiftsPage()));

		Assert.assertEquals(plp.GiftsPage().getText(),"GIFTS");
	    
		
		
	   	}

	@Then("user should select any one the product")
	public void user_should_select_any_one_the_product() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String productNeeded = "Bear Collectible In Signature Shearling";
		boolean keepScrolling = true;
        //lazy loading products
			outerloop: 
				while (keepScrolling) {
				js.executeScript("window.scrollBy(0,500)");

				
				for (int i = 0; i <plp.getAllProductnames().size(); i++) {
					String productName = plp.getAllProductnames().get(i).getText();
					if (productNeeded.contains(productName)) {
	                plp.getAllProductlinks().get(i).click();
						break outerloop;
					}
				}
			}
	   
	}

	@Then("product descrition page should be displayed")
	public void product_descrition_page_should_be_displayed() {
		pdp = new ProductDescriptionPage(driver);
		w.until(ExpectedConditions.visibilityOf(pdp.pdVerify()));
		Assert.assertEquals(pdp.pdVerify().getText(), "Bear Collectible In Signature Shearling");
	}

	@Then("click on up arrow button and check for {int} carousel images of the product")
	public void click_on_up_arrow_button_and_check_for_carousel_images_of_the_product(Integer num) {
		
		int j=0;
        loop:
        while(j>=0) {
			w.until(ExpectedConditions.visibilityOf(pdp.Arrow())).click();
		    w.until(ExpectedConditions.visibilityOf(pdp.CarouseProduct()));

				String curl=pdp.CarouseProduct().getAttribute("src").split("\\?")[0];
			    
	            w.until(ExpectedConditions.visibilityOf(pdp.DesktopProduct()));
				
				String Dpurl = pdp.DesktopProduct().getAttribute("src").split("\\?")[0];
				if (curl.equals(Dpurl)) {
					System.out.println("Carousel Url:"+curl+" ------>Desktop url:"+Dpurl);
				   j++;
					if(j==num)
					{
						break loop;
					}
				}
        
        }
	}
		
		
		
		
		
		
	   
	

	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	
	}



}
