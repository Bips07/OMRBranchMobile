package com.omrbranch.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	
	@Before
	public void before() {
		
	}
	@After
	public void after(Scenario s) throws InterruptedException {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		byte[] b = ts.getScreenshotAs(OutputType.BYTES);
//		if(s.isFailed())
//		{
//			s.attach(b, "image/png", s.getName());
//		}
//		Thread.sleep(5000);
//	//closeWindow();
	}

}
