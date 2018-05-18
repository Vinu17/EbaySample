package com.mob.ebaySample;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PlaceOrder {
	@Test
	 public void logincheck() {
		try {
		CommonFunctions cf= new CommonFunctions();
		EbayApplaunch eal= new EbayApplaunch();
		UserLogin ul= new UserLogin();
		Assert.assertEquals(eal.launchAap(),true,"Launching ebay Application");
		Assert.assertEquals(ul.loginasExistingUser(),true, "Login");
		Assert.assertEquals(ul.searchProduct(),true);
		Assert.assertEquals(ul.buyProduct(),true, "Placing order");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
	}


}
