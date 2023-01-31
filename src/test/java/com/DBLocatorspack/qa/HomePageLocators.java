package com.DBLocatorspack.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilitypack.qa.DBBaseClass;

public class HomePageLocators extends DBBaseClass {
	
	public HomePageLocators() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(linkText = "Log in")
	public WebElement lohinlink;

}
