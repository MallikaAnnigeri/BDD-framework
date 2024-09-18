package com.shoppersstack.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(xpath = "//span[.='add to cart']")
	public WebElement cart;

	@FindBy(xpath = "//a[@href='/cart']/span")
	public WebElement carticon;
	
	@FindBy(xpath = "//span[.='Buy Now']")
	public WebElement buybtn;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement addToCart() {
		return cart;
	}

	public WebElement cartIcon() {
		return carticon;
	}
	
	public WebElement BuyNow() {
		return buybtn;

}
}
