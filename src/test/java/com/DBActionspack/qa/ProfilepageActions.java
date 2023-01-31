package com.DBActionspack.qa;



import org.testng.Assert;

import com.DBLocatorspack.qa.ProfilepageLocators;
import com.Utilitypack.qa.DBBaseClass;

public class ProfilepageActions extends DBBaseClass{
	ProfilepageLocators profilepageLocators = new ProfilepageLocators();
	
	public void verifyusercanlogin() {
		boolean verifyresult=profilepageLocators.welcometext.isDisplayed();
		Assert.assertTrue(verifyresult);
	}
	public void clickLogout() {
		profilepageLocators.logoutlink.click();
	}
	
	
}
