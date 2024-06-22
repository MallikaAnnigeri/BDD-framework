package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmlogin {
	
	
	
	@FindBy(name = "username")
	private WebElement usn1;

	@FindBy(name = "password")
	private WebElement pwd1;

	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement lgn;

	public OrangeHrmlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement enterusn() {

		return usn1;
	}

	public WebElement enterpwd() {

		return pwd1;
	}

	public WebElement Click() {

		return lgn;
	}

}



