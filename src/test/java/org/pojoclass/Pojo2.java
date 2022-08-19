package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class Pojo2 extends Baseclass {

	public Pojo2() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}
