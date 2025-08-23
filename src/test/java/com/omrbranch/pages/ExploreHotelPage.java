package com.omrbranch.pages;

import org.openqa.selenium.By;
import com.omrbranch.baseclass.BaseClass;

public class ExploreHotelPage extends BaseClass {
	
	
    By textWelcome = By.xpath("//android.widget.TextView[@resource-id='header_welcome']");
	By textExploreHotels = By.xpath("//android.widget.TextView[@resource-id='search_explore_hotel']");
	By lstState = By.xpath("//android.widget.ScrollView[@content-desc='search_select_state flatlist']//android.widget.TextView");
	By lstCity = By.xpath("//android.widget.ScrollView[@content-desc='search_select_city flatlist']//android.widget.TextView");
	By lstRoomType = By.xpath("//android.widget.ScrollView[@content-desc='search_room_type flatlist']//android.widget.TextView");
	By lstNoOfRoom = By.xpath("//android.widget.ScrollView[@content-desc='search_select_no_of_rooms flatlist']//android.widget.TextView");
	By lstNoOfAdults = By.xpath("//android.widget.ScrollView[@content-desc='search_select_no_of_adults flatlist']//android.widget.TextView");
	By ddnState = By.xpath("//android.widget.TextView[@text='Select State']");
	By ddnSelectState = By.xpath("//android.widget.TextView[@text='Andhra Pradesh']");
	By ddnCity  = By.xpath("//android.widget.TextView[@text='Select City']");
	By ddnSelectCity = By.xpath("//android.widget.TextView[@text='Tirupati']");
	By ddnRoomType = By.xpath("//android.widget.TextView[@text='Select Room Type']");
	By ddnSelectRoomType = By.xpath("//android.widget.TextView[@text='Standard']");
	By dpkCheckIn = By.xpath("//android.view.ViewGroup[@resource-id='search_select_checkin_button']");
	By dpkSelectCheckIn = By.xpath("//android.view.View[@content-desc='25 July 2025']");
	By btnCalendarOk = By.xpath("//android.widget.Button[@text='OK']");
	By dpkCheckOut = By.xpath("//android.view.ViewGroup[@resource-id='search_select_checkout_button']");
	By dpkSelectCheckOut = By.xpath("//android.view.View[@content-desc='16 July 2025']");
	By ddnNoOfRooms = By.xpath("//android.widget.TextView[@text='No. Of Room']");
	By ddnSelectNoOfRooms = By.xpath("//android.widget.TextView[@text='1-One']");
	By ddnNoOfAdults = By.xpath("//android.widget.TextView[@text='No. Of Adults']");
	By ddnSelectNoOfAdults = By.xpath("//android.widget.TextView[@text='2-Two']");
	By txtNoOfChild = By.xpath("//android.widget.EditText[@content-desc='search_no_of_children']");
	By btnSearch = By.xpath("//android.view.ViewGroup[@resource-id='search_button']");
	By textStateErrorMessage = By.xpath("//android.widget.TextView[@text='Please select state']");
	By textCityErrorMessage = By.xpath("//android.widget.TextView[@text='Please select city']");
	By textCheckInErrorMessage = By.xpath("//android.widget.TextView[@text='Please select Check-in date']");
	By textCheckOutErrorMessage = By.xpath("//android.widget.TextView[@text='Please select Check-out date']");
	By textNoOfRoomsErrorMessage = By.xpath("//android.widget.TextView[@text='Please select no. of rooms']");
	By textNoOfAdultsErrorMessage = By.xpath("//android.widget.TextView[@text='Please select no. of adults']");
	
	
	
	
	
	
	public String getSuccessMessage() {
		explicitWait(textWelcome);
		String elementGetText = elementGetText(findLocatorBy(textWelcome));
		return elementGetText;
	}
	
	public void searchHotels(String state, String city,String roomType, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults, String noOfChilds) throws InterruptedException {
		
		elementClick(findLocatorBy(ddnState));
		selectDropdownOption(state, lstState);
		elementClick(findLocatorBy(ddnCity));
		selectDropdownOption(city, lstCity);
		elementClick(findLocatorBy(ddnRoomType));
		selectDropdownOption(roomType, lstRoomType);
		elementClick(findLocatorBy(dpkCheckIn));
		explicitWait(btnCalendarOk);
	//	elementClick(findLocatorBy(dpkSelectCheckIn));
		elementClick(findLocatorBy(btnCalendarOk));
		elementClick(findLocatorBy(dpkCheckOut));
	//	elementClick(findLocatorBy(dpkSelectCheckOut));
		explicitWait(btnCalendarOk);
		elementClick(findLocatorBy(btnCalendarOk));
		elementClick(findLocatorBy(ddnNoOfRooms));
		selectDropdownOption(noOfRooms, lstNoOfRoom);
		elementClick(findLocatorBy(ddnNoOfAdults));
		selectDropdownOption(noOfAdults, lstNoOfAdults);
		elementSendKeys(findLocatorBy(txtNoOfChild), noOfChilds);
		elementClick(findLocatorBy(btnSearch));	
		Thread.sleep(10000);
	}
	public void searchHotels(String stateName, String cityName, String checkInDate, String checkOutDate,
			String noOfRooms, String noOfAdults) {
		
		elementClick(findLocatorBy(ddnState));
		selectDropdownOption(stateName, lstState);
		elementClick(findLocatorBy(ddnCity));
		selectDropdownOption(cityName, lstCity);
		elementClick(findLocatorBy(dpkCheckIn));
		explicitWait(btnCalendarOk);
		elementClick(findLocatorBy(btnCalendarOk));
		elementClick(findLocatorBy(dpkCheckOut));
		explicitWait(btnCalendarOk);
		elementClick(findLocatorBy(btnCalendarOk));
		elementClick(findLocatorBy(ddnNoOfRooms));
		selectDropdownOption(noOfRooms, lstNoOfRoom);
		elementClick(findLocatorBy(ddnNoOfAdults));
		selectDropdownOption(noOfAdults, lstNoOfAdults);
		elementClick(findLocatorBy(btnSearch));		

	}
	public void clickSearchHotel() {

		elementClick(findLocatorBy(btnSearch));
	}
	public String getStateNameErrorMessageText() {

		String text = elementGetText(findLocatorBy(textStateErrorMessage));
		return text;
	}

	public String getCityErrorMessageText() {
		String text = elementGetText(findLocatorBy(textCityErrorMessage));
		return text;
	}

	public String getCheckInDateErrorMessageText() {
		String text = elementGetText(findLocatorBy(textCheckInErrorMessage));
		return text;
	}

	public String getCheckOutDateErrorMessageText() {
		String text = elementGetText(findLocatorBy(textCheckOutErrorMessage));
		return text;
	}

	public String getNoOfRoomsErrorMessageText() {
		String text = elementGetText(findLocatorBy(textNoOfRoomsErrorMessage));
		return text;
	}

	public String getNoOfAdultsErrorMessageText() {
		String text = elementGetText(findLocatorBy(textNoOfAdultsErrorMessage));
		return text;

	}
	 
}
