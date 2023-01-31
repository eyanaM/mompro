package com.DBActionspack.qa;

import org.testng.Assert;

import com.DBLocatorspack.qa.LoginPageLocators;
import com.Utilitypack.qa.DBBaseClass;
import com.Utilitypack.qa.DBTestData;

public class LoginPageActions extends DBBaseClass{
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	
	public void verifyLoginpageisdisplayed() {
		
		 boolean verifylogin=loginPageLocators.verifyloginpage.isDisplayed();
		 Assert.assertTrue(verifylogin);
	}
	public void verifylogintextisdisplayed() {
		
		boolean verifylogtext=loginPageLocators.loginText.isDisplayed();
		Assert.assertTrue(verifylogtext);
		
	}
	
	public void verifyusernamefieldisdisplayed() {
		boolean verifyuserfield=loginPageLocators.userNamefield.isDisplayed();
		Assert.assertTrue(verifyuserfield);
		
		
	}
	public void verifypasswordfieldisdisplayed() {
		boolean verifypassword=loginPageLocators.verifyPassword.isDisplayed();
		Assert.assertTrue(verifypassword);
	}
	public void verifyloginbuttonisdisplayed() {
		boolean verifyloginbutton=loginPageLocators.loginButton.isDisplayed();
		Assert.assertTrue(verifyloginbutton);
		
	}
	public void verifyclosebuttonisdisplayed() {
		boolean verifyclosebutton=loginPageLocators.closebutton.isDisplayed();
		Assert.assertTrue(verifyclosebutton);
		
	}
	
	
	public void clickClosebutton(){
		loginPageLocators.closebutton.click();
		
		
	}
	public void usercaninputcredentials(String userName, String password) {
		
		loginPageLocators.userNamefield.sendKeys(DBTestData.userName);
		loginPageLocators.verifyPassword.sendKeys(DBTestData.password);
		
	}
	public void clickLoginbutton() {
		loginPageLocators.loginButton.click();
	}
	public void handlePopUp() {
		driver.switchTo().alert().accept();
		
	}
	
	
	public void verifyuserredirectedtologinpage() {
		boolean verifydirected= loginPageLocators.verifyloginpage.isDisplayed()	;
		Assert.assertTrue(verifydirected);
	}
	
	
	public void userinputcredentialsU(String InvaliduserName, String password) {
		loginPageLocators.userNamefield.sendKeys(DBTestData.invalidUsername);
		loginPageLocators.verifyPassword.sendKeys(DBTestData.password);
	}
	
	public void userinputcredentialsp(String Username, String InvalidPassword) {
		
	}
	
}
