package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSE {
	public static void scroll(WebDriver driver,WebElement  ele)
	{
		Utility.Executor(driver).executeScript("argument[0].scrollIntoView(true);",ele);
		
	}


}
