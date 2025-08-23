package com.omrbranch.pages;


import org.openqa.selenium.By;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.stepdefinition.TC002_SearchHotelsStep;

public class SelectHotelPage extends BaseClass {
	
	public static String firstHotelName , firstHotelPrice;
	
    By textSelectHotel = By.xpath("//android.widget.TextView[@resource-id='select_hotel_text']");
	By lstSelectHotel = By.xpath("//*[@text='Hyatt Centric Standard']");
	By btnContinue = By.xpath("(//android.view.ViewGroup[@resource-id=\\\"hotel_continue_button\\\"])[2]");
	By alertOk = By.xpath("//android.widget.Button[@resource-id='android:id/button2']");
	By textHotelName = By.xpath("//android.widget.TextView[@resource-id='hotel_name']");
	By textHotelPrice = By.xpath("//android.widget.TextView[@resource-id='hotel_price_with_tax']");
	By textSelectHotelMessage = By.xpath("//android.widget.TextView[@resource-id='select_hotel_text']");
	By btnFirstHotelNameContinue = By.xpath("//android.view.ViewGroup[@resource-id='hotel_continue_button']");
	By btnSecondHotelNameContinue = By.xpath("");

	
	public String getSelectHotelMessageText() {
		explicitWait(textSelectHotelMessage);
		String elementGetText = elementGetText(findLocatorBy(textSelectHotelMessage));
		return elementGetText;
	}

	public void selectFirstHotelName() {
		elementClick(findLocatorBy(btnFirstHotelNameContinue));
		elementClick(findLocatorBy(alertOk));

	}

	public String getHotelName() {
		swipe();
		firstHotelName = elementGetText(findLocatorBy(textHotelName)).replace(TC002_SearchHotelsStep.roomType, "");
		System.out.println(firstHotelName);
		return firstHotelName;

	}

	public String getHotelPrice() {
		firstHotelPrice = elementGetText(findLocatorBy(textHotelPrice));
		return firstHotelPrice;

	}
	
	public void selectSecondHotelName() {
		swipeToElement(btnSecondHotelNameContinue);
		elementClick(findLocatorBy(btnSecondHotelNameContinue));
		elementClick(findLocatorBy(alertOk));
		
	}


}
