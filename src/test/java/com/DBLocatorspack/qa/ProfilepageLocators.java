package com.DBLocatorspack.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilitypack.qa.DBBaseClass;

public class ProfilepageLocators extends DBBaseClass {
	public ProfilepageLocators() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "nameofuser")
	public WebElement welcometext;

@FindBy(id = "logout2")
public WebElement logoutlink;
}
