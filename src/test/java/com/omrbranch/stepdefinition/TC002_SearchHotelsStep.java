package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.objectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC002_SearchHotelsStep {
	
	PageObjectManager pom = new PageObjectManager();
	public static String roomType;
	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String roomType, String checkIn, String checkOut, String NoOfRooms, String NoOfAdults, String NoOfChildren) throws InterruptedException {
		pom.getExploreHotelPage().searchHotels(state, city, roomType, checkIn, checkOut, NoOfRooms, NoOfAdults, NoOfChildren);
		this.roomType = roomType;
	}
	
	@Then("User should verify after search hotel success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String expTextSelectHotel) {
		String actText=pom.getSelectHotelPage().getSelectHotelMessageText();
		Assert.assertEquals("Verify the select hotel text",expTextSelectHotel, actText);
	}

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String state, String city, String checkIn, String checkOut, String NoOfRooms, String NoOfAdults) {
		pom.getExploreHotelPage().searchHotels(state, city, checkIn, checkOut, NoOfRooms, NoOfAdults);
	}

	@Then("User click Search button")
	public void user_click_search_button() {
		pom.getExploreHotelPage().clickSearchHotel();
	}
	
	@Then("User should verify after search hotel error message {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_verify_after_search_hotel_error_message_and(String expErrorState, String expErrorCity, String expErrorCheckIn, String expErrorCheckOut, String expErrorNoOfRooms, String expErrorNoOfAdults) {
		String actErrorState = pom.getExploreHotelPage().getStateNameErrorMessageText();
		String actErrorCity = pom.getExploreHotelPage().getCityErrorMessageText();
		String actErrorCheckIn = pom.getExploreHotelPage().getCheckInDateErrorMessageText();
		String actErrorCheckOut = pom.getExploreHotelPage().getCheckOutDateErrorMessageText();
		String actErrorNoOfRooms = pom.getExploreHotelPage().getNoOfRoomsErrorMessageText();
		String acterrorNoOfAdults = pom.getExploreHotelPage().getNoOfAdultsErrorMessageText();
		Assert.assertEquals("Verify the error message for state field", expErrorState, actErrorState);
		Assert.assertEquals("Verify the error message for city field", expErrorCity, actErrorCity);
		Assert.assertEquals("Verify the error message for CheckIn field", expErrorCheckIn, actErrorCheckIn);
		Assert.assertEquals("Verify the error message for CheckOut field", expErrorCheckOut, actErrorCheckOut);
		Assert.assertEquals("Verify the error message for No Of Rooms field", expErrorNoOfRooms, actErrorNoOfRooms);
		Assert.assertEquals("Verify the error message for No Of Adults field", expErrorNoOfAdults, acterrorNoOfAdults);
	}
}