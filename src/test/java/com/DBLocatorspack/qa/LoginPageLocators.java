package com.DBLocatorspack.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilitypack.qa.DBBaseClass;

public class LoginPageLocators extends DBBaseClass{
	public LoginPageLocators() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "loginusername")
	public WebElement verifyloginpage;
	
	@FindBy(id = "logInModalLabel")
	public WebElement loginText;
	
	@FindBy(id = "loginusername")
	public WebElement userNamefield;
	
	@FindBy(id = "loginpassword")
	public WebElement verifyPassword;
	
	@FindBy(xpath = "//button[text()='Log in']")
	public WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
	public WebElement closebutton;
	 
	
	
	
	


}
