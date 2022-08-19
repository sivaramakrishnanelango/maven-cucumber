package org.stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import com.Baseclass.Baseclass;

import cucumber.api.java.Before;
import cucumber.api.Scenario;
import cucumber.api.java.After;







public class Hooks extends Baseclass {
	
	
	@io.cucumber.java.Before(order=2)
	public void browserstart() {
		driverLaunch();
		System.out.println("browser start");

	}
	//@io.cucumber.java.After(order=5)
	//public void browserclose() {
		//driverClose();
		//System.out.println("browser close");

	//}
	
	@io.cucumber.java.Before(order=4)
	public void beforescreenShot() {
		System.out.println("before screenshot");

	}
	
	@io.cucumber.java.After(order=8)
	public void afterscreenShot(Scenario s) {
		
		if (s.isFailed()) {
			
			TakesScreenshot ts =  (TakesScreenshot)driver; 
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			//to merge into html report
			
			s.embed(screenshotAs, "image/png");
				
				
				}
			}
		
		

	}
	
	
	
	


	
	
	