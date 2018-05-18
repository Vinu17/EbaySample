package com.mob.ebaySample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class CommonFunctions {

	public static boolean clickAtElement(WebElement element)
	{
		try
		{
			element.click();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	public static boolean enterTextInTextbox(WebElement element, String text)
	{
		try
		{
			element.sendKeys(text);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
	
	

}
