package org.stepdefinition;

import org.pojoclass.policyBazzarPojo;

import com.Baseclass.Baseclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class policybazzartwo extends Baseclass {

	
	@Given("To launch the chrome browser and hit the url")
	public void to_launch_the_chrome_browser_and_hit_the_url() {
	   //driverLaunch();
	    urlLaunch("https://www.policybazaar.com/");
	}

	@When("To enter  the twowheeler insurance page")
	public void to_enter_the_twowheeler_insurance_page() throws InterruptedException {
		policyBazzarPojo b = new policyBazzarPojo();
	    click(b.getTwowheeler());
	    Thread.sleep(3000);
	}

	@When("To enter the vehicle number")
	public void to_enter_the_vehicle_number() throws InterruptedException {
		policyBazzarPojo b = new policyBazzarPojo();
	    sendKeys(b.getBikeno(), "TN61L9229");
	    click(b.getPricebutton());
	    Thread.sleep(2000);
	    
	}

	//@When("then view prices of insurance")
	//public void then_view_prices_of_insurance() {
	//   driverClose();
	//}


}
