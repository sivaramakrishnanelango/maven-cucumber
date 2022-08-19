package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class redbuspojo extends Baseclass {

	public redbuspojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="src")
	WebElement from;
	@FindBy(id="dest")
	WebElement to;
	@FindBy(id="onward_cal")
	WebElement date;
	@FindBy(id="search_btn")
	WebElement searchbtn;
	
	@FindBy(xpath="//td[text()='30']")
	WebElement finaldate;
	
	public WebElement getFinaldate() {
		return finaldate;
	}
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
}
