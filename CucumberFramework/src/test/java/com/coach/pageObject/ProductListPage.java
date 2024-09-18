package com.coach.pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListPage {

	WebDriver driver;

	@FindBy(xpath = "//h1[.='Gifts']")
	private WebElement giftsplp_page; // this is xpath to verify plp page is displayed or not

	public By productsText = By.xpath("//div[@class='product-name css-ucxxdf']/a/p");// this is for selecting the
																						// product based on product text

	public By productslist = By.xpath("//div[@class='product-name css-ucxxdf']//a");// this is used to clicking on
																						// product image

	public ProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	

	}

	public WebElement GiftsPage()

	{

		return giftsplp_page;
		
	}

	public List<WebElement> getAllProductnames()

	{

		return driver.findElements(productsText);
	}

	public List<WebElement> getAllProductlinks()

	{
		return driver.findElements(productslist);
	}
}
