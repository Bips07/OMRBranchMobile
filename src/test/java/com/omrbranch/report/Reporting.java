package com.omrbranch.report;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.baseclass.BaseClass;

import net.masterthought.cucumber.*;


public class Reporting extends BaseClass {

		public static void generateJvmReports(String jsonFile) throws FileNotFoundException, IOException {
			// 1. Mention the path JVM reports where to store
			File file = new File (getProjectPath() + getPropertyFileValue("jvmPath"));
			
			// 2 . Create the object for the configuration class
			Configuration configuration = new Configuration(file, "OMR Branch Project");
			
			//3 . key value pairs--> Design purpose
			configuration.addClassifications("OS", "WIN 11");
			configuration.addClassifications("Browser Version", "132");
			configuration.addClassifications("Testing", "Reg");
			
			//4. Create the Object for ReportBuilder class
			List<String> jsonFiles = new ArrayList<>();
			jsonFiles.add(jsonFile);
			ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
			
			//5. Build JVM Reports
			builder.generateReports();

		}

}
