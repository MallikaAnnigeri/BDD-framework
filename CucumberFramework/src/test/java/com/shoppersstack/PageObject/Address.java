package com.shoppersstack.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	@FindBy(xpath="//*[@href='/selectaddress']")
	public WebElement Adtxt;
	
	
	@FindBy(xpath="//*[@href='/payment-options']")
	public WebElement paymentTxt;

	
	@FindBy(xpath = "//a[@href='/addressform']")
	public WebElement adrs;

	@FindBy(xpath = "//input[@id='Name']")
	public WebElement name;

	@FindBy(xpath = "//input[@id='House/Office Info']")
	public WebElement hminfo;

	@FindBy(xpath = "//input[@id='Street Info']")
	public WebElement street;

	@FindBy(xpath = "//input[@id='Landmark']")
	public WebElement land;

	@FindBy(xpath = "//select[@id='Country']")
	public WebElement ctry;

	@FindBy(xpath = "//select[@id='State']")
	public WebElement state;

	@FindBy(xpath = "//select[@name='City']")
	public WebElement city;

	@FindBy(xpath = "//input[@id='Pincode']")
	public WebElement pin;

	@FindBy(xpath = "//input[@id='Phone Number']")
	public WebElement no;

	@FindBy(xpath = "//button[.='Add Address']")
	public WebElement add;

	@FindBy(xpath = "//input[@type='radio']")
	public WebElement radio;

	@FindBy(xpath = "//button[.='Proceed']")
	public WebElement proceed;

	public Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement addAddress() {
		return  adrs;
	}

	public WebElement nameField() {
		return name;
	}

	public WebElement House() {
		return hminfo;
	}

	public WebElement Street() {
		return street;
	}

	public WebElement landMark() {
		return land;
	}

	public WebElement country() {
		return ctry;
	}

	public WebElement State() {
		return state;
	}

	public WebElement City() {
		return city;
	}

	public WebElement pinCode() {
		return pin;
	}

	public WebElement number() {
		return no;
	}

	public WebElement addDetails() {
		return add;
	}

	public WebElement Radio() {
		return radio;
	}

	public WebElement Proceed() {
		return proceed;
	}
	public WebElement AddressTxt() {
		return Adtxt;
	}
	public WebElement Paymentpage() {
		return paymentTxt;
	}


}
