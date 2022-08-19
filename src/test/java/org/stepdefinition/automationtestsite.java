package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.pojoclass.autotesting;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class automationtestsite extends Baseclass{

	  autotesting a;
	@Given("To launch the browser and launch the url")
	public void to_launch_the_browser_and_launch_the_url() {
	  // driverLaunch();
	   urlLaunch("http://demo.automationtesting.in/Register.html");
	}

	@Given("To enter the first name and last name")
	public void to_enter_the_first_name_and_last_name() {
	    a = new autotesting();
	    sendKeys(a.getFistname(), "sivarama");
	    sendKeys(a.getLastname(), "krishnan");
	}

	@When("To enter the adddress")
	public void to_enter_the_adddress() {
	    a = new autotesting();
	    sendKeys(a.getAddress(), "varasithi vinayakar koil street");
	}

	@When("To enter the email address and mob no")
	public void to_enter_the_email_address_and_mob_no() {
	  a = new autotesting();
	  sendKeys(a.getEmail(), "sivaram.e98@gmail.com");
	  sendKeys(a.getMobno(), "7598461411");
	}

	@When("To enter the all the valid data")
	public void to_enter_the_all_the_valid_data() throws AWTException, InterruptedException {
		 a = new autotesting();
		 click(a.getGender());
		 Thread.sleep(2000);
		 click(a.getHobbies());
		 Thread.sleep(2000);
		
		 
		 Robot r = new Robot();
			 
		 Thread.sleep(2000);
		//WebElement language = a.getLanguage();		
		//language.click();
		
		//WebElement english = a.getEnglish();
		//english.click();
		
		 WebElement skills = a.getSkills();
		 skills.click();
		 selectbyIndex(skills, 5);
		 Thread.sleep(2000);
		 
		 click(a.getSelectcountry());
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		WebElement dob = a.getDobyear();
		 selectbyValue(dob, "1996");
		 
		
		 
		 WebElement month = a.getDobmonth();
		 selectbyValue(month, "February");
		 
		 WebElement date = a.getDobdate();
		 selectbyValue(date, "10");
		 
		 
		 
		 click(a.getPassword());
		 sendKeys(a.getPassword(), "sivaram123");
		 
		 click(a.getConfirmpassword());
		 sendKeys(a.getConfirmpassword(), "sivaram123");
		 
	}

	@Then("To press the submit button")
	public void to_press_the_submit_button() {
	   
	}


}
