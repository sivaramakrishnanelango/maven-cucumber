package org.stepdefinition;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class jvmreport {

	
	public static void reportGeneration(String jsonpath) {
	
		
		//1.mention the target folder location-File
		File f = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\MavenCucumber\\jvm");
		
		//2.Add details to the report using configuration class
		Configuration c = new Configuration(f, "Amazon,Flipkart,Redbus,Snapdeal,policybazzar");
		c.addClassifications("platform", "Windows");
		c.addClassifications("version", "9");
		c.addClassifications("Browsername", "Google chrome");
		c.addClassifications("version", "100");
		
		//3.Add jsn file paths into List<string>
		java.util.List<String> li = new ArrayList<String>();
		li.add(jsonpath);
		
		//4.Create object for ReportBuilder class
		ReportBuilder rb = new ReportBuilder(li, c);
		
		
		//using the created object call generateReports() method.
		rb.generateReports();

	}
}
