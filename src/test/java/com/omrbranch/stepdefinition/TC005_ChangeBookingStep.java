package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;
import com.omrbranch.pages.*;

import io.cucumber.java.en.*;

public class TC005_ChangeBookingStep extends BaseClass {

PageObjectManager pom = new PageObjectManager();
	
	@Given("User quit native app")
	public void user_quit_native_app() {
		
		closeWindow();
		
	}
	@Given("User is on the OMR Branch hotel web application")
	public void user_is_on_the_omr_branch_hotel_web_application() throws FileNotFoundException, IOException {
		
		appLaunch(getPropertyFileValue("launchWeb"), getPropertyFileValue("browserName"), getPropertyFileValue("deviceName"), getPropertyFileValue("platformName"), getPropertyFileValue("platformVersion"), getPropertyFileValue("appPackage"), getPropertyFileValue("appActivity"), getPropertyFileValue("automationName"));
		implicitWait();
		
	}
	@When("User enter {string} and {string} in chrome page")
	public void user_enter_and_in_chrome_page(String userName, String password) {
		
		pom.getLoginPage().loginWeb(userName, password);
	}
	@Then("User should verify success message after login {string} in chrome page")
	public void user_should_verify_success_message_after_login_in_chrome_page(String expSuccessMessage) {
		String acctSuccessMessage = pom.getSelectHotelPage().getSelectHotelMessageText();
		Assert.assertEquals("Verify the welcome text in web", expSuccessMessage,acctSuccessMessage);
		
	}
	@When("User go to my account page")
	public void user_go_to_my_account_page() {
		
		pom.getSelectPortalPage().openAccountPage();
	}
	@When("User search the Order ID")
	public void user_search_the_order_id() {
		
		pom.getMyBookingPage().search(BookingConfirmationPage.orderId);
		
	}
	@Then("User should verify same booked Order ID is present or not")
	public void user_should_verify_same_booked_order_id_is_present_or_not() {
		
		String actOrderId = pom.getMyBookingPage().getOrderId();
		Assert.assertEquals("Verify the order id in Accounts page", BookingConfirmationPage.orderId, actOrderId);
		
	}
	@Then("User should verify same booked Hotel Name is present or not")
	public void user_should_verify_same_booked_hotel_name_is_present_or_not() {
		
		String actHotelName = pom.getMyBookingPage().getHotelName();
		Assert.assertTrue("Verify the hotel name", SelectHotelPage.firstHotelName.contains(actHotelName));
	}
	@Then("User should verify same booked Hotel Price is present or not")
	public void user_should_verify_same_booked_hotel_price_is_present_or_not() {
		
		String actHotelPrice = pom.getMyBookingPage().getHotelPrice();
		Assert.assertTrue("Verify the hotel price",SelectHotelPage.firstHotelPrice.contains(actHotelPrice));
		
	}
	
	@When("User edit the Check-in Date {string}")
	public void user_edit_the_check_in_date(String modifyDate) {
		
		pom.getMyBookingPage().changeDate(modifyDate);
		
	}
	@Then("User should verify after modify check-in date success message {string}")
	public void user_should_verify_after_modify_check_in_date_success_message(String expSuccessMessage) {

		String actSuccessMessage = pom.getMyBookingPage().getMessage();
		Assert.assertEquals("Verify the update message", expSuccessMessage, actSuccessMessage);
		
	}


}
