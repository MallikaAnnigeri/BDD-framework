package Utilities;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Select {

	public static void getAllSelectedOption(WebElement ele)
	{
		Utility.DropDown(ele).getAllSelectedOptions();
	}
}                                                                                                              
