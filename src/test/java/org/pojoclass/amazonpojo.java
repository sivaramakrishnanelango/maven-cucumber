package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class amazonpojo extends Baseclass {
	
	
	public amazonpojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement contibutton;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement signin;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContibutton() {
		return contibutton;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}
	

}
