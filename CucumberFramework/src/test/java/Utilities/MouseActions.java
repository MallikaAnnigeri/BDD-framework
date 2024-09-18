package Utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseActions {
	 public static void RigthClick(WebDriver driver, WebElement ele) {
		 
		 Utility.MouseAction(driver).contextClick(ele).perform();
		 
	 }
public static void DragandDrop(WebDriver driver, WebElement ele1,WebElement ele2) {
		 
		 Utility.MouseAction(driver).dragAndDrop(ele1,ele2).perform();
		 
	 }

public static void MouseHover(WebDriver driver, WebElement ele) {
	 
	 Utility.MouseAction(driver).moveToElement(ele).perform();
	 
}

public static void DoubleClick(WebDriver driver,WebElement ele) {
	
	Utility.MouseAction(driver).doubleClick(ele).perform();
}


public static void clickandHold(WebDriver driver,WebElement ele)
{
	Utility.MouseAction(driver).clickAndHold(ele).perform();
}

	 
	 

}
