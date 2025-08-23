package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.objectmanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.*;

public class TC004_BookHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@When("User scroll down and  add Guest Details {string},{string},{string},{string} and {string}")
	public void user_scroll_down_and_add_guest_details_and(String salutation, String firstName, String lastName,
			String mobileNumber, String email) {

		pom.getBookHotelPage().addGuestDetails(salutation, firstName, lastName, mobileNumber, email);

	}

	@When("User add GST Details {string},{string} and {string}")
	public void user_add_gst_details_and(String registrationNumber, String companyName, String companyAddress) {

		pom.getBookHotelPage().addGstDetails(registrationNumber, companyName, companyAddress);

	}

	@When("User add Special Request {string}")
	public void user_add_special_request(String specialRequest) {

		pom.getBookHotelPage().addSpecialRequest(specialRequest);

	}

	@When("User click credit\\/Debit\\/ATM Card and click card type as debit card and enter the payment details")
	public void user_click_credit_debit_atm_card_and_click_card_type_as_debit_card_and_enter_the_payment_details(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> listOfCards = dataTable.asMaps();
		Map<String, String> cardDetails = listOfCards.get(0);
		pom.getBookHotelPage().addPaymentWithCard("Debit Card", cardDetails.get("Select Card"),
				cardDetails.get("Card No"), cardDetails.get("Card Name"), cardDetails.get("Month"),
				cardDetails.get("Year"), cardDetails.get("CVV"));

	}

	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void user_should_verify_after_hotel_booking_success_message_and_save_the_order_id(String expSuccessMessage) {

		String actSuccessMessage = pom.getBookingConfirmationPage().getBookingComfirmedMessage();
		Assert.assertEquals("Verify the Booking confirmed text", expSuccessMessage, actSuccessMessage);

	}

	@Then("User should verify same selected Hotel is booked or not")
	public void user_should_verify_same_selected_hotel_is_booked_or_not() {

		String actBookedHotelName = pom.getBookingConfirmationPage().getBookedHotelName();
		System.out.println(actBookedHotelName);
		System.out.println(SelectHotelPage.firstHotelName);
		Assert.assertTrue("Verify the hotel name", actBookedHotelName.contains(SelectHotelPage.firstHotelName));

	}

	@When("User scrolls down, save the second hotel name and hotel price")
	public void user_scrolls_down_save_the_second_hotel_name_and_hotel_price() {
	}

	@When("User select the second hotel and click ok to proceed to next page")
	public void user_select_the_second_hotel_and_click_ok_to_proceed_to_next_page() {
	}

	@When("User click credit\\/Debit\\/ATM Card and click card type as credit card and enter the payment details")
	public void user_click_credit_debit_atm_card_and_click_card_type_as_credit_card_and_enter_the_payment_details(
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String, String>> listOfCards = dataTable.asMaps();
		Map<String, String> cardDetails = listOfCards.get(0);
		pom.getBookHotelPage().addPaymentWithCard("Credit Card", cardDetails.get("Select Card"),
				cardDetails.get("Card No"), cardDetails.get("Card Name"), cardDetails.get("Month"),
				cardDetails.get("Year"), cardDetails.get("CVV"));

	}

	@When("User scrolls down, save the last hotel name and hotel price")
	public void user_scrolls_down_save_the_last_hotel_name_and_hotel_price() {
	}

	@When("User select the last hotel and click ok to proceed to next page")
	public void user_select_the_last_hotel_and_click_ok_to_proceed_to_next_page() {
	}

	@When("User clicks on next button without adding special request")
	public void user_clicks_on_next_button_without_adding_special_request() {
		pom.getBookHotelPage().specialRequestNext();

	}

	@When("User continue without entering GST details")
	public void user_continue_without_entering_gst_details() {

		pom.getBookHotelPage().clickGuestDetailsNext();
	}

}
