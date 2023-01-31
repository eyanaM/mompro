package com.DBActionspack.qa;

import org.testng.Assert;

import com.DBLocatorspack.qa.HomePageLocators;
import com.Utilitypack.qa.DBBaseClass;

public class HomePageActions extends DBBaseClass {
	HomePageLocators homePageLocators= new HomePageLocators();

	
	public void verifyLoginlinkisdisplayedinhomepage() {
		boolean result=homePageLocators.lohinlink.isDisplayed();
		
		Assert.assertTrue(result);
		
	}
	
	public void clickLoginLink() {
		homePageLocators.lohinlink.click();
	}
	
	
	public void verifyloginpagecloses() {
		
		boolean verifylogin=homePageLocators.lohinlink.isDisplayed();
		Assert.assertTrue(verifylogin);
	}
	public void verifyusercanlogout() {
		boolean verify=homePageLocators.lohinlink.isDisplayed();
		Assert.assertTrue(verify);
		
	}
}
