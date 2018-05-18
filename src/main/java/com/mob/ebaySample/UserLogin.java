package com.mob.ebaySample;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLogin extends CommonFunctions {
	
	@FindBy(xpath="//android.widget.TextView[contains(@text='Email or username')]")
	WebElement txtUserName;
	@FindBy(xpath="android.widget.TextView[contains(@text='Password')]")
	WebElement txtPassword;
	@FindBy(xpath="//android.widget.Button[contains(@text='SIGN IN')]")
	WebElement btnSignIn;
	@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'textview_item_title')and @text='Aqua Ultra Swift RO UV UF Alkaline Water Purifier..']")
	WebElement Waterpurifier;
	@FindBy(xpath="//android.widget.Button[contains(@resource-id,'button_bin')]")
	WebElement btnBuyButton;
	@FindBy(xpath="//android.widget.Button[Contains(@text='REVIEW')]")
	WebElement btnReview;
	@FindBy(xpath="android.widget.Button[contains(@text='Proceed to Pay')]")
	WebElement btnProceedtopay;
	
	public boolean loginasExistingUser()
	{
		try
		{ 
			InputFile ifr = new InputFile();
			Object[][] obj = ifr.readExcel();
			enterTextInTextbox(txtUserName, obj[1][0].toString());
			enterTextInTextbox(txtPassword, obj[1][1].toString());
			clickAtElement(btnSignIn);
			
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
			
		}
	}
	
	public boolean searchProduct()
	{
		try
		{ 
			enterTextInTextbox(Waterpurifier, "Water purifier");
			Waterpurifier.sendKeys(Keys.ENTER);
			clickAtElement(Waterpurifier);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
			
		}
	}
	
	public boolean buyProduct()
	{
		try
		{ 
			clickAtElement(btnBuyButton);//Clicked on BuyButton
			clickAtElement(btnReview);
			clickAtElement(btnProceedtopay);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
