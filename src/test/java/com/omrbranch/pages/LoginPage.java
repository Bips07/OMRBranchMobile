package com.omrbranch.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;



public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
		By txtEmail = By.xpath("//android.widget.EditText[@content-desc='Email Address']");
		By txtPass = By.xpath("//android.widget.EditText[@content-desc='Password']");
		By btnLogin = By.xpath("//android.view.ViewGroup[@resource-id='login_button']") ;
		By errorMessage = By.xpath("//android.widget.TextView[@resource-id='login_error_message']");
		
		@FindBy(id="email")
		private WebElement WebtxtUserName;
		
		@FindBy(name = "pass")
		private WebElement WebtxtPassword;
		
		@FindBy(xpath = "//*[@value='login']")
		private WebElement WebbtnLogin;
		
		@FindBy(id = "errorMessage")
		private WebElement textErrorMessage;

		public WebElement getWebTextErrorMessage() {
			return textErrorMessage;
		}

		public WebElement getWebTxtUserName() {
			return WebtxtUserName;
		}

		public WebElement getWebTxtPassword() {
			return WebtxtPassword;
		}

		public WebElement getWebBtnLogin() {
			return WebbtnLogin;
		}
		
		public void loginWeb(String username, String password) {
			
			elementSendKeys(WebtxtUserName, username);
			elementSendKeys(WebtxtPassword, password);
			elementClick(WebbtnLogin);
		}

		
		public void login(String userName, String password) {
			
			elementSendKeys(findLocatorBy(txtEmail), userName);
			elementSendKeys(findLocatorBy(txtPass), password);
			clickButton();
		}
		
		public void clickButton() {
			elementClick(findLocatorBy(btnLogin));
		}
		
		public String getErrorMessage() {
			explicitWait(errorMessage);
			String msg=elementGetText(findLocatorBy(errorMessage));
			return msg;
		}
	}