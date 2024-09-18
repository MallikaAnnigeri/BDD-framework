package com.shoppersstack.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriverWait w;

	@FindBy(name= "Email")
	public WebElement email;

	@FindBy(name = "Password")
	public WebElement pass;

	@FindBy(xpath = "//span[.='Login']")
	public WebElement lgn2;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
    this. w=new WebDriverWait(driver,Duration.ofSeconds(25));
	}

	public WebElement Email() {
           w.until(ExpectedConditions.visibilityOf(email));
		return email;
	}

	public WebElement Password() {
        w.until(ExpectedConditions.visibilityOf(pass));

		return pass;
	}

	public WebElement Login1() {

		return lgn2;
	}

}
