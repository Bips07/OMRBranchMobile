package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC006_CancelBookingStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();
	
	@When("User click on Cancel the order ID")
	public void user_click_on_cancel_the_order_id() {
		pom.getMyBookingPage().clickCancelBtn();
		
	}
	
	@Then("User should verify after cancel booking success message {string}")
	public void user_should_verify_after_cancel_booking_success_message(String expMessage) {
		
		String actSuccessMessage = pom.getMyBookingPage().getMessage();
		Assert.assertEquals("Verify the update message", expMessage, actSuccessMessage);
		
	}




}
