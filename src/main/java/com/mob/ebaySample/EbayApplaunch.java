package com.mob.ebaySample;

import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EbayApplaunch {
	@SuppressWarnings("rawtypes")
	private static AndroidDriver driver;
	
	public boolean launchAap() throws MalformedURLException, InterruptedException {
		try {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/Apps/eBay/");
		File app = new File(appDir, "com.ebay.mobile_v5.20.1.1-126_Android-5.0.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Micromax A311");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.ebay.mobile");
		capabilities.setCapability("appActivity", "com.ebay.mobile.activities.MainActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
		
	}
}
