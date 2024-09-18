package com.shoppersstack.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {
	
	
	   WebDriverWait w;

	@FindBy(xpath = "//a[@href='/men']")
	public WebElement men;

	@FindBy(xpath = "//a[@href='/sub-category/men-tshirt']")
	public WebElement shirt;

	@FindBy(xpath = "//span[.='Yamaha FX280 Tobacco Brown Sunburst...']")
	public WebElement product;

	@FindBy(xpath = "//div[@class='chatbot-items']")
	public WebElement cht;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    this. w=new WebDriverWait(driver,Duration.ofSeconds(15));

	}

	public WebElement mensTab() {
		w.until(ExpectedConditions.visibilityOf(men));
		return men;
	}

	public WebElement tshirtOpt() {
		w.until(ExpectedConditions.visibilityOf(shirt));

		return shirt;
	}

	public WebElement Product() {
		return product;
	}

	public WebElement chatBox() {
		return cht;
	}

}
