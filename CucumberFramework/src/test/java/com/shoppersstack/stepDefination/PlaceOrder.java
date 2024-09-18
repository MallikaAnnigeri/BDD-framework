package com.shoppersstack.stepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



import com.shoppersstack.PageObject.Address;
import com.shoppersstack.PageObject.CartPage;
import com.shoppersstack.PageObject.HomePage;
import com.shoppersstack.PageObject.LoginPage;
import com.shoppersstack.PageObject.Payment;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PlaceOrder  {
    Properties p1;
	LoginPage l;
	HomePage hm;
	Actions act;
	CartPage cp;
	Address ad;
	WebDriver driver;
	Select s1;
	Select s2;
	Select s3;
	Payment p;


	

@Test
@Given("user should open the browser and enter the shopersstack url")
public void user_should_open_the_browser_and_enter_the_shopersstack_url() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	p1 = new Properties();
	FileInputStream fis = new FileInputStream("./TestProperty/Testdata.properties");
	p1.load(fis);
	
	driver.get(p1.getProperty("Surl"));
	
	
	
	
   
}

@When("user enter all details and click on login button")
public void user_enter_all_details_and_click_on_login_button() {
	l=new LoginPage(driver);
	l.Email().sendKeys(p1.getProperty("usn"));
	l.Password().sendKeys(p1.getProperty("pwd"));
	l.Login1().click();
}

@When("user  mouse hover to the mens tab and select tshirt option")
public void user_mouse_hover_to_the_mens_tab_and_select_tshirt_option() throws InterruptedException {
	hm=new HomePage(driver);
	act=new Actions(driver);
	act.moveToElement(hm.mensTab()).perform();
	
	hm.tshirtOpt().click();
	
	act.moveToElement(hm.chatBox()).perform();


}

@Then("verify Mens Tshirt page should be displayed")
public void verify_mens_tshirt_page_should_be_displayed(DataTable msg) {
	List<String> data= msg.row(0);
	Assert.assertEquals(driver.getCurrentUrl(),data.get(0));
	
   }

@When("select the product and click on Add to cart button")
public void select_the_product_and_click_on_add_to_cart_button() {
	hm.Product().click();
   cp=new CartPage(driver);
   cp.addToCart().click();
   

}
   
@When("click on cart icon and click on buy now button")
public void click_on_cart_icon_and_click_on_buy_now_button() {
	cp.cartIcon().click();
	cp.BuyNow().click();

}


@Then("Adress page should be displayed")
public void adress_page_should_be_displayed() {
	ad=new Address(driver);
	Assert.assertEquals(ad.AddressTxt().getText(),"Address");
	
   }

@Then("usershould  click on Add Adress button")
public void usershould_click_on_add_adress_button() {
	ad.addAddress().click();
}

@Then("user should enter all the valid  details into Add Adrees page")
public void user_should_enter_all_the_valid_details_into_add_adrees_page(DataTable details) {
	     List<String> data = details.row(0);
	ad.nameField().sendKeys(data.get(0));
	ad.House().sendKeys(data.get(1));
	ad.Street().sendKeys(data.get(2));
	ad.landMark().sendKeys(data.get(3));
	s1 = new Select(ad.country());
	s1.selectByVisibleText(data.get(4));
	s2 = new Select(ad.State());

	s2.selectByVisibleText(data.get(5));
	s3 = new Select(ad.City());

	s3.selectByVisibleText(data.get(5));
	ad.pinCode().sendKeys(data.get(6));
	ad.number().sendKeys(data.get(7));
	
   
}

@Then("click on Add Adress button")
public void click_on_add_adress_button() {
  ad.addAddress().click();
}

@When("user select the radio option and click on proceed button")
public void user_select_the_radio_option_and_click_on_proceed_button() {
   ad.Radio().click();
   ad.Proceed().click();
}

@Then("verify Payment Method Page should be displayed")
public void verify_payment_method_page_should_be_displayed() {
	
	Assert.assertEquals(ad.Paymentpage().getText(),"Payment Method");

  }

@When("User select cash on delivery radio button and click on proceed")
public void user_select_cash_on_delivery_radio_button_and_click_on_proceed() {
	p=new Payment(driver);
	p.Pay();
	ad.Proceed();
	
   }

@Then("Verfigy Order confimation page should be displayed")
public void verfigy_order_confimation_page_should_be_displayed() {
	Assert.assertEquals(p.OrderTxt().getText(),"Order Confirmation");
  }

@Then("close the Browser")
public void close_the_browser() {
	driver.quit();
	
   }



}
