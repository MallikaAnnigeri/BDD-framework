package com.coach.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescriptionPage {
	
	WebDriver driver;
	@FindBy(xpath="//span[@aria-current='page']")
	private WebElement Pdp_page;// to verfify pdp page is displayed or not
	
	@FindBy(xpath="//div[@data-qa='qv_icon_carousel_img_nav_up_arrow']")
	private WebElement up_pdp;
	
	  @FindBy(xpath="//li[@class='splide__slide is-active is-visible']/div")
	 private WebElement cproduct;//this is used to selecting Carousel product
	
	
		
		@FindBy(xpath="//div[@class='css-14ktbsh']/img")
		private WebElement Dproduct;//this is used to selecting the desktop product
		  
		
		public ProductDescriptionPage (WebDriver driver) {
		        this.driver = driver;
		        PageFactory.initElements(driver, this);
		    }
		
		
	 public WebElement Arrow()
		 
		 {
			 return up_pdp;
		 }
		 
		 public WebElement CarouseProduct()
		 
		 {
			 return cproduct;
		 }
		 
	 public WebElement DesktopProduct()
		 
		 {
			 return Dproduct;
		 }
	 
	 public WebElement pdVerify()
	 
	 {
		 return Pdp_page;
	 }
	
	

}
