package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Assert;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC001_LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		appLaunch(getPropertyFileValue("launch"), getPropertyFileValue("browserName"), getPropertyFileValue("deviceName"), getPropertyFileValue("platformName"), getPropertyFileValue("platformVersion"), getPropertyFileValue("appPackage"), getPropertyFileValue("appActivity"), getPropertyFileValue("automationName"));
		implicitWait();
	}
	
	@When("User enter {string} and {string} and click login")
	public void user_enter_and_and_click_login(String userName, String password) 	{
		pom.getLoginPage().login(userName, password);
	}
	
	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expLoginSuccessMessage) 	{
		String acctLoginSuccessMessage = pom.getExploreHotelPage().getSuccessMessage();
		String[] split = expLoginSuccessMessage.split(" ");
		if(acctLoginSuccessMessage.contains(split[0])&&acctLoginSuccessMessage.contains(split[1]))
		{
			Assert.assertTrue("Verify the welcome message", true);	
		}else
		{
			Assert.assertTrue("Verify the welcome message", false);
		}	
	}
	
	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrorMessage) {
		String actLoginErrorMessage = pom.getLoginPage().getErrorMessage();
		Assert.assertEquals("Verify the error message", expLoginErrorMessage,actLoginErrorMessage);
		
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		pom.getLoginPage().clickButton();
		
	}
}
