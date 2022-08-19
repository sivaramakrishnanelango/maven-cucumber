package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class snapdealPojo extends Baseclass{

	
	public snapdealPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement username;

	@FindBy(id="checkUser")
	WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}
}
