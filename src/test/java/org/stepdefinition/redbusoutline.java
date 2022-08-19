package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Map;

import org.pojoclass.redbuspojo;

import com.Baseclass.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class redbusoutline extends Baseclass {

	
	
	@Given("To launch the Chrome browser and hit the redbus url")
	public void to_launch_the_Chrome_browser_and_hit_the_redbus_url() {
	   //driverLaunch();
	    urlLaunch("https://www.redbus.in/");
	}

	@When("To enter the starting place in from tab")
	public void to_enter_the_starting_place_in_from_tab(DataTable d) throws AWTException {
	    redbuspojo r = new redbuspojo();
	    Map<String, String> mp = d.asMap(String.class, String.class);
	    String value = mp.get("from2");
	    sendKeys(r.getFrom(), value);
	    Robot a = new Robot();
	    a.keyPress(KeyEvent.VK_ENTER);
	    a.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("To enter the destination place in To tab")
	public void to_enter_the_destination_place_in_To_tab(DataTable d) throws AWTException {
	   redbuspojo r = new redbuspojo();
	   List<Map<String, String>> mp1 = d.asMaps();
	   String value = mp1.get(1).get("To");
	   sendKeys(r.getTo(), value);
	   Robot a = new Robot();
	   a.keyPress(KeyEvent.VK_ENTER );
	   a.keyRelease(KeyEvent.VK_ENTER);
	   
	}

	@When("To enter the date in this tab")
	public void to_enter_the_date_in_this_tab() throws InterruptedException {
	    redbuspojo r = new redbuspojo();
	    click(r.getSearchbtn());
	    Thread.sleep(2000);
	}

	@Then("To close thr browser")
	public void to_close_thr_browser() {
	  // driverClose();
	}

}
