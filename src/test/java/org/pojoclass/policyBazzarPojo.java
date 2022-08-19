package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class policyBazzarPojo extends Baseclass {

	
	public policyBazzarPojo() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//p[text()='2 Wheeler']")
WebElement  twowheeler;

@FindBy(id="rto")
WebElement bikeno;

@FindBy(xpath="//button[@type='button']")
WebElement pricebutton;

@FindBy(xpath="(//button[@class='buy-now-btn'])[1]")
WebElement amountchoose;

public WebElement getAmountchoose() {
	return amountchoose;
}

public WebElement getTwowheeler() {
	return twowheeler;
}

public WebElement getBikeno() {
	return bikeno;
}

public WebElement getPricebutton() {
	return pricebutton;
}



}