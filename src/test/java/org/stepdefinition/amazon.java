package org.stepdefinition;

import org.pojoclass.amazonpojo;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class amazon extends Baseclass {

	
	
	
	@Given("To launch google driver and hit the amazon url")
	public void to_launch_google_driver_and_hit_the_amazon_url() {
	   // driverLaunch();
	    urlLaunch("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}

	@When("To pass the valid username in email field")
	public void to_pass_the_valid_username_in_email_field() {
	   amazonpojo a = new amazonpojo();
	   sendKeys(a.getEmail(), "7598461411");
	   
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
	   amazonpojo a = new amazonpojo();
	   click(a.getContibutton());
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() throws InterruptedException {
	   amazonpojo a = new amazonpojo();
	   sendKeys(a.getPassword(),"Sivaram@123");
	   Thread.sleep(2000);
	   click(a.getSignin());
	   Thread.sleep(5000);
	   
	}


}
