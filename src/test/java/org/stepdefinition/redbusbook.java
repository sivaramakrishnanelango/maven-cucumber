package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.pojoclass.redbuspojo;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class redbusbook extends Baseclass{

	
	@Given("To enter from area to reaching area with date")
	public void to_enter_from_area_to_reaching_area_with_date() {
	    //driverLaunch();
	    urlLaunch("https://www.redbus.in/");
	}

	@When("To give the details from and to area")
	public void to_give_the_details_from_and_to_area() throws AWTException, InterruptedException {
	   redbuspojo r = new redbuspojo();
	   sendKeys(r.getFrom(), "chennai");
	   Robot a = new Robot();
	   a.keyPress(KeyEvent.VK_ENTER);
	   a.keyRelease(KeyEvent.VK_ENTER);
	   sendKeys(r.getTo(), "trichy");
	   a.keyPress(KeyEvent.VK_ENTER);
	   a.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
	}

	@When("To enter the date details")
	public void to_enter_the_date_details() {
		 redbuspojo r = new redbuspojo();
		 click(r.getDate());
		 click(r.getFinaldate());
	}

	@When("To enter the search button")
	public void to_enter_the_search_button() {
		 redbuspojo r = new redbuspojo();
		 click(r.getSearchbtn());
	}

	@Then("To select the bus and close the browser")
	public void to_select_the_bus_and_close_the_browser() {
	   // driverClose();
	}


}
