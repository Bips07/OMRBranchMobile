package com.omrbranch.pages;

import org.openqa.selenium.By;
import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmationPage extends BaseClass {
	
	public static String orderId;
	
	By textBookingId = By.xpath("//android.widget.TextView[contains(@text,'Booking is Confirmed')]");
	By textHotelName = By.xpath("//android.widget.TextView[contains(@text,'is booked!')]");
	
	public String getBookingComfirmedMessage() {
		explicitWait(textBookingId);
		String msg = elementGetText(findLocatorBy(textBookingId));
		String[] split = msg.split(" ");
		orderId = split[0].replace("#", "");
		String bookingIsConfirmed = split[1]+" "+split[2]+" "+split[3];
		return bookingIsConfirmed;
	}
	
	public String getBookedHotelName() {
		explicitWait(textHotelName);
		String msg = elementGetText(findLocatorBy(textHotelName));
		return msg;
	}
	

}
