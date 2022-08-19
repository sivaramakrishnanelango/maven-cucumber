package org.stepdefinition;

import org.pojoclass.snapdealPojo;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class snapdeal extends Baseclass {

	
	@Given("To google chrome driver launch and hit  the snapdeal url launch")
	public void to_google_chrome_driver_launch_and_hit_the_snapdeal_url_launch() {
	    //driverLaunch();
	    urlLaunch("https://www.snapdeal.com/login");
	}

	@When("To give the invalid mobileno")
	public void to_give_the_invalid_mobileno() {
	   snapdealPojo s = new snapdealPojo();
	   sendKeys(s.getUsername(), "9654321890");
	   }

	@When("To click the login btn")
	public void to_click_the_login_btn() {
	   snapdealPojo s = new snapdealPojo();
	   click(s.getLogin());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	   // driverClose();	
		}


}
