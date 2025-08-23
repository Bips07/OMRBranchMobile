package com.omrbranch.pages;

import org.openqa.selenium.By;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass{
	
	
	By textBookings = By.xpath("//h4[contains(text(),'Bookings')]");
	By txtSearch = By.name("search");
	By textPriceAmount = By.xpath("//strong[@class='total-prize']");
	By btnEdit = By.xpath("//button[text()='Edit']");
	By txtCheckIn = By.name("check_in");
	By btnNextMonth = By.xpath("//a[@title='Next']");
	By btnDateOne = By.xpath("//a[text()='1']");
	By btnConfirm = By.xpath("//button[text()='Confirm']");
	By txtAlertMessage = By.xpath("//li[@class='alertMsg']");
	By btnCancel = By.xpath("//a[text()='Cancel']");
	By textCancelled = By.xpath("//button[text()='Cancelled']");
	By textOrderId = By.xpath("//div[@class='room-code']");
	By textHotelName = By.xpath("//*[@class='col-md-7 mobile-space-none']/a/h5");
	By textHotelPrice = By.xpath("//strong[@class='total-prize']");
	
		
	public void closeApp() {
		closeWindow();
	}
	
	
	public void search(String orderId) {
		elementSendKeys(findLocatorBy(txtSearch), orderId);
	}
	
	public void changeDate(String date) {
		elementClick(findLocatorBy(btnEdit));
		elementSendKeys(findLocatorBy(txtCheckIn), date);
		elementClick(findLocatorBy(btnConfirm));
	}
	
	public String getMessage() {
		String text = elementGetText(findLocatorBy(txtAlertMessage));
		return text;
	}
	
	public void cancelBooking() {
		elementClick(findLocatorBy(btnCancel));
		acceptAlert();
		
	}
	public String getOrderId() {
		String orderId = elementGetText(findLocatorBy(textOrderId));
		return orderId;
	}
	
	public String getHotelName() {
		String hotelName = elementGetText(findLocatorBy(textHotelName));
		return hotelName;
	}
	
	public String getHotelPrice() {
		String hotelPrice = elementGetText(findLocatorBy(textHotelPrice));
		return hotelPrice;
	}
	
	public void clickCancelBtn() {
		elementClick(findLocatorBy(btnCancel));
	}
	

}
