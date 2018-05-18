package com.mob.ebaySample;

import org.testng.Assert;
import org.testng.annotations.Test;


/*I have used excel to get the data for multiple registered user login, it is coded in "loginasExistingUser" 
*/
public class ValidateLogin {
	
	@Test
	 public void logincheck() {
		try {
		CommonFunctions cf= new CommonFunctions();
		EbayApplaunch eal= new EbayApplaunch();
		UserLogin ul= new UserLogin();
		Assert.assertEquals(eal.launchAap(),true,"Launching ebay Application");
		Assert.assertEquals(ul.loginasExistingUser(),true, "Login");
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}

}
