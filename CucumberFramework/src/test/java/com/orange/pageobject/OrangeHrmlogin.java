package com.orange.pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmlogin {
	
	private WebDriverWait w;
	
	@FindBy(name = "username")
	private WebElement usn1;

	@FindBy(name = "password")
	private WebElement pwd1;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement lgn;
	
	@FindBy(css="div.oxd-alert")
	private WebElement errormsg;

	public OrangeHrmlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
        this.w =new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public WebElement enterusn() {

		return usn1;
	}

	public WebElement enterpwd() {

		return pwd1;
	}

	public void Click() {
       
		

       w.until(ExpectedConditions.elementToBeClickable(lgn)).click();
      
		
	}
	public WebElement alertMsg()
	{
		return errormsg;
	}

}



