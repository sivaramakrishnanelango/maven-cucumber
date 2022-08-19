package org.stepdefinition;

import org.pojoclass.Pojo1;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class facebookoutline extends Baseclass {

	
	
	@Given("To launch the browser and launch the facebook url")
	public void to_launch_the_browser_and_launch_the_facebook_url() {
	    //driverLaunch();
	   urlLaunch("https://www.facebook.com/");
	}

	@When("To pass the username {string}to username field")
	public void to_pass_the_username_to_username_field(String username) {
	   Pojo1 p = new Pojo1();
	  
	   sendKeys(p.getUsername(), username);
	}

	@When("To pass the password{string} to password field")
	public void to_pass_the_password_to_password_field(String password) {
	   Pojo1 p = new Pojo1();
	   sendKeys(p.getPassword(), password);
	}

	@Then("browser is closed")
	public void browser_is_closed() {
	  // driverClose();
	}


}
