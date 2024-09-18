package com.shoppersstack.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	@FindBy(xpath="//span[.='Cash On Delivery (COD)']")
	public WebElement cod;
	
	@FindBy(xpath="//a[@href='/place-order']")
	public WebElement orderTxt;
	
	public Payment (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public WebElement Pay()
	{
		return cod;
	}
	
	public WebElement OrderTxt()
	{
		return orderTxt;
	}
	

}
