package org.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.pojoclass.Pojo1;

import com.Baseclass.Baseclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbTest extends Baseclass {
	
	
	
	@Given("To launch the Chrome browser and hit the facebook url")
	public void to_launch_the_Chrome_browser_and_hit_the_facebook_url() {
	   //driverLaunch();
	    urlLaunch("https://www.facebook.com/");
	   
	}

	@When("To pass the invalid userName to userName field")
	public void to_pass_the_invalid_userName_to_userName_field(DataTable d) {
	   Pojo1 p = new Pojo1();
	   Assert.assertTrue(false);
	   List<String> li = d.asList();
	   String value = li.get(3);
	   sendKeys(p.getUsername(), value);
	}

	@When("To pass the invalid password to password field")
	public void to_pass_the_invalid_password_to_password_field(DataTable d) {
	   Pojo1 p = new Pojo1();
	   
	   List<List<String>> lis = d.asLists();
	   String value = lis.get(2).get(1);
	   sendKeys(p.getPassword(), value);
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	   
		Pojo1 p = new Pojo1();
		click(p.getBtnclick());
	}

	@Then("To close the Browser")
	public void to_close_the_Browser() {
	    //driverClose();
	    
	}


}
