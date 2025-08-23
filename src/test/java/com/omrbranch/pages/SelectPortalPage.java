package com.omrbranch.pages;

import org.openqa.selenium.By;

import com.omrbranch.baseclass.BaseClass;

public class SelectPortalPage extends BaseClass {
	
	By WebtextWelcome = By.xpath("//*[@data-testid='username']");
	By WeblinkHotel = By.xpath("//*[@data-href='https://omrbranch.com/hotel-booking']");
	By WeblnkAccountPage=By.xpath("//a[text()='My Account']");
	
	
	public String getWebWelcomeMessage() {
		String text = elementGetText(findLocatorBy(WebtextWelcome));
		return text;
	}
	
	public void openAccountPage() {
		elementClick(findLocatorBy(WebtextWelcome));
		explicitWait(WeblnkAccountPage);
		elementClick(findLocatorBy(WeblnkAccountPage));
	}
	

}
