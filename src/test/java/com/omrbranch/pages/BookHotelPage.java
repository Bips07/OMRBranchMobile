package com.omrbranch.pages;

import org.openqa.selenium.By;
import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass{
	
	By textBookHotel = By.xpath("//android.widget.TextView[@resource-id='book_hotel_text']");
	By rdoBookingFor = By.xpath("(//android.view.ViewGroup[@resource-id='book_hotel_booking_for'])[1]/android.widget.ImageView");
	By ddnSalutation = By.xpath("//android.widget.TextView[@text='Select Salutation']");
	By ddnSalutationList = By.xpath("//android.widget.TextView");
	By txtFirstName = By.xpath("//android.widget.EditText[@content-desc='book_hotel_first_name']");
	By txtLastName = By.xpath("//android.widget.EditText[@content-desc='book_hotel_last_name']");
	By txtPhone = By.xpath("//android.widget.EditText[@content-desc='book_hotel_mobile_no']");
	By txtEmail = By.xpath("//android.widget.EditText[@content-desc='book_hotel_email']");
	By chkGst = By.xpath("//android.view.ViewGroup[@resource-id='book_hotel_enter_gst']/android.widget.ImageView");
	By txtGstReg = By.xpath("//android.widget.EditText[@content-desc='book_hotel_registration']");
	By txtCompName = By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_name']");
	By txtCompAddress = By.xpath("//android.widget.EditText[@content-desc='book_hotel_company_address']");
	By btnNext = By.xpath("//android.view.ViewGroup[@resource-id='book_hotel_next_button']");
	By btnSmoking = By.xpath("//android.widget.TextView[@resource-id='filter_option_smoking']");
	By txtOtherRequest = By.xpath("//android.widget.EditText[@content-desc='TextInput']");
	By btnNext2 = By.xpath("//android.view.ViewGroup[@resource-id='book_hotel_next_button']");
	By btnPaymentType = By.xpath("//android.widget.TextView[@text='Credit/Debit/ATM Card']");
	By ddnCardType = By.xpath("//android.view.View[@resource-id='payment_type']");
	By ddnCardTypeList = By.xpath("//android.widget.CheckedTextView");
	By ddnCard = By.xpath("//android.view.View[@resource-id='card_type']");
	By ddnCardList = By.xpath("//android.widget.CheckedTextView");
	By txtCardNumber = By.xpath("//android.widget.EditText[@resource-id='card_no']");
	By txtCardName = By.xpath("//android.widget.EditText[@resource-id='card_name']");
	By ddnCardMonth = By.xpath("//android.view.View[@resource-id='card_month']");
	By ddnCardMonthList = By.xpath("//android.widget.CheckedTextView");
	By ddnCardYear = By.xpath("//android.view.View[@resource-id='card_year']");
	By ddnCardYearList = By.xpath("//android.widget.CheckedTextView");
	By txtCvv = By.xpath("//android.widget.EditText[@resource-id='cvv']");
	By btnSubmit = By.xpath("//android.widget.Button[@resource-id='submitBtn']");
	
	public String getBookHotelMessageText() {
		explicitWait(textBookHotel);
		String text=elementGetText(findLocatorBy(textBookHotel));
		return text;
	}
	
	public void addGuestDetails(String salutation, String firstName, String lastName, String mobileNo, String email) {
		swipeToElement(btnNext);
		elementClick(findLocatorBy(rdoBookingFor));
		elementClick(findLocatorBy(ddnSalutation));
		selectDropdownOption(salutation, ddnSalutationList);
		elementSendKeys(findLocatorBy(txtFirstName), firstName);
		elementSendKeys(findLocatorBy(txtLastName), lastName);
		elementSendKeys(findLocatorBy(txtPhone), mobileNo);
		elementSendKeys(findLocatorBy(txtEmail), email);		
	}
	public void clickGuestDetailsNext() {
		elementClick(findLocatorBy(btnNext));
	}
	
	public void addGstDetails(String registrationNumber, String companyName, String companyAddress) {
		
		elementClick(findLocatorBy(chkGst));
		explicitWait(txtGstReg);
		swipeToElement(btnNext);
		elementSendKeys(findLocatorBy(txtGstReg),registrationNumber);
		elementSendKeys(findLocatorBy(txtCompName),companyName);
		elementSendKeys(findLocatorBy(txtCompAddress),companyAddress);
		clickGuestDetailsNext();
	}
	public void specialRequestNext() {
		elementClick(findLocatorBy(btnNext2));
	}
	public void addSpecialRequest(String request) {
		elementSendKeys(findLocatorBy(txtOtherRequest), request);
		specialRequestNext();
	}
	
	public void addPaymentWithCard(String cardType,String card, String cardNumber, String cardName, String month, String year, String cvv) throws InterruptedException {
		
		explicitWait(btnPaymentType);
		Thread.sleep(5000);
		elementClick(findLocatorBy(btnPaymentType));
		swipeToElement(btnSubmit);
		elementClick(findLocatorBy(ddnCardType));
		explicitWait(ddnCardTypeList);
		selectDropdownOption(cardType, ddnCardTypeList);
		elementClick(findLocatorBy(ddnCard));
		selectDropdownOption(card, ddnCardList);
		elementSendKeys(findLocatorBy(txtCardNumber), cardNumber);
		elementSendKeys(findLocatorBy(txtCardName), cardName);
		elementClick(findLocatorBy(ddnCardMonth));
		selectDropdownOption(month, ddnCardMonthList);
		elementClick(findLocatorBy(ddnCardYear));
		selectDropdownOption(year, ddnCardYearList);
		elementSendKeys(findLocatorBy(txtCvv), cvv);	
		clickSubmit();
	}
	public void clickSubmit() {
		elementClick(findLocatorBy(btnSubmit));
	}

}
