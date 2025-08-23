package com.omrbranch.runner;

import java.io.IOException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.report.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags=("@cancel"),dryRun = false, plugin ={"pretty","json:target\\Output.json"} ,glue ="com.omrbranch.stepdefinition" , features ="src\\test\\resources")
public class TestRunner extends BaseClass {

	
	@AfterClass
	public static void afterClass() throws IOException{
		
		Reporting.generateJvmReports(System.getProperty("user.dir")+getPropertyFileValue("jsonPath"));
		
	}
}
