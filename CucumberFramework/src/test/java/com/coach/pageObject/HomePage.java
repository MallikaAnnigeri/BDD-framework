package com.coach.pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	  WebDriver driver;
	 
	 @FindBy(xpath="//input[@id='SearchInput']")
	    private WebElement searchField;
	  
	
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	        

	    }
	    
	    public WebElement Search()
	    {

	    return searchField;
}
	    

}
