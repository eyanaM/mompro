package com.StepDeffpack.qa;

import com.DBActionspack.qa.HomePageActions;
import com.DBActionspack.qa.LoginPageActions;
import com.DBActionspack.qa.ProfilepageActions;
import com.Utilitypack.qa.DBBaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DBStefDeffClass extends DBBaseClass {
	
	HomePageActions homePageActions = new HomePageActions();
	LoginPageActions loginPageActions = new LoginPageActions();
	ProfilepageActions profilepageActions = new ProfilepageActions();
	
	@Given("^launch application <\"([^\"]*)\">$")
	public void launch_application(String URL) throws Throwable {
	   launchURL(URL);
	}

	@Then("^Verify Login link is displayed in home page$")
	public void verify_Login_link_is_displayed_in_home_page() throws Throwable {
		homePageActions.verifyLoginlinkisdisplayedinhomepage();
		
	}

	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		homePageActions.clickLoginLink();
		Thread.sleep(3000);
		
		
	}
	

	@Then("^Verify Login page is displayed$")
	public void verify_Login_page_is_displayed() throws Throwable {
		loginPageActions.verifyLoginpageisdisplayed();
	}

	@Then("^Verify login text is displayed$")
	public void verify_login_text_is_displayed() throws Throwable {
		loginPageActions.verifylogintextisdisplayed();
	}

	@Then("^Verify username field is displayed$")
	public void verify_username_field_is_displayed() throws Throwable {
		
		loginPageActions.verifyusernamefieldisdisplayed();
	    
	}

	@Then("^Verify password field is displayed$")
	public void verify_password_field_is_displayed() throws Throwable {
		loginPageActions.verifypasswordfieldisdisplayed();
	  
	}

	@Then("^Verify login button is displayed$")
	public void verify_login_button_is_displayed() throws Throwable {
		loginPageActions.verifyloginbuttonisdisplayed();
	}

	@Then("^Verify close button is displayed$")
	public void verify_close_button_is_displayed() throws Throwable {
		loginPageActions.verifyclosebuttonisdisplayed();
		
	}

	@Then("^Click Close button$")
	public void click_Close_button() throws Throwable {
		loginPageActions.clickClosebutton();
	    
	}

	@Then("^Verify login page closes$")
	public void verify_login_page_closes() throws Throwable {
		homePageActions.clickLoginLink();
		
	    
	}

	@Then("^user can input credentials <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_can_input_credentials(String userName, String password) throws Throwable {
		
		loginPageActions.usercaninputcredentials(userName, password);
	    
	}
	@Then("^Click Login button$")
	public void click_Login_button() throws Throwable {
		loginPageActions.clickLoginbutton();
		Thread.sleep(3000);
	   
	}

	@Then("^Verify user can login$")
	public void verify_user_can_login() throws Throwable {
		profilepageActions.verifyusercanlogin();
	   
	}

	@Then("^Handle PopUp$")
	public void handle_PopUp() throws Throwable {
		loginPageActions.handlePopUp();
		Thread.sleep(3000);
	   
	}

	@Then("^Verify user redirected to login page$")
	public void verify_user_redirected_to_login_page() throws Throwable {
		loginPageActions.verifyuserredirectedtologinpage();
		
	   
	}

	

	@Then("^user input credentialsU <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_input_credentialsU(String InvaliduserName, String password) throws Throwable {
		loginPageActions.userinputcredentialsU(InvaliduserName, password);
	}

	@Then("^user input credentialsp <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_input_credentialsp(String Username, String InvalidPassword) throws Throwable {
		loginPageActions.userinputcredentialsp(Username, InvalidPassword);
	}

	@Then("^Click Logout$")
	public void click_Logout() throws Throwable {
		profilepageActions.clickLogout();
		Thread.sleep(3000);
	}

	@Then("^Verify user can logout$")
	public void verify_user_can_logout() throws Throwable {
		
		homePageActions.verifyLoginlinkisdisplayedinhomepage();
	}
}


