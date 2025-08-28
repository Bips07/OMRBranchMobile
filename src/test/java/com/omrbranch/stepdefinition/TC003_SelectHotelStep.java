package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC003_SelectHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	
	@When("User scrolls down, save the first hotel name and hotel price")
	public void user_scrolls_down_save_the_first_hotel_name_and_hotel_price() {
		pom.getSelectHotelPage().getHotelName();
		pom.getSelectHotelPage().getHotelPrice();
		
	}
	@When("User select the first hotel and click ok to proceed to next page")
	public void user_select_the_first_hotel_and_click_ok_to_proceed_to_next_page() {
		pom.getSelectHotelPage().selectFirstHotelName();
	}
	@Then("User should verify after select success message {string}")
	public void user_should_verify_after_select_success_message(String expSuccessMessage) {
		String message = pom.getBookHotelPage().getBookHotelMessageText();
		String actSuccessMessage = message.substring(0, 10);
		Assert.assertEquals("Verify the Book Hotel text", expSuccessMessage, actSuccessMessage);
	}
}
