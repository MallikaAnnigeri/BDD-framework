package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeLogout {
	
	
	@FindBy(xpath = "//img[@src='/web/index.php/pim/viewPhoto/empNumber/7']")
	public WebElement logo;

	@FindBy(xpath = "//a[.='Logout']")
	public WebElement logout;

	public OrangeLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement log() {
		return logo;
	}

	public WebElement logt() {
		return logout;
	}

}
