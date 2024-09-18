package Utilities;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	
	public static JavascriptExecutor Executor(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
	
	public static Actions MouseAction(WebDriver driver)
	{
		Actions act=new Actions(driver);
		return act;
	}
	
	
	public static Select DropDown(WebElement ele)
	{
		Select s=new Select(ele);
		return s;
	}
	
	public static Robot KeyBoard() throws Exception
	{
		Robot r=new Robot();
		return r;
	}
	
	
	

}
