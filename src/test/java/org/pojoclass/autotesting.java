package org.pojoclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Baseclass;

public class autotesting extends Baseclass{

	public autotesting() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@type=\'text\'])[1]")
	WebElement firstname;
	
	@FindBy(xpath="(//input[@type=\'text\'])[2]")
	WebElement lastname;
	
	@FindBy(xpath="//textarea[@rows='3']")
	WebElement address;
	
	@FindBy(xpath="//input[@type=\'email\']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobno;
	
	@FindBy(xpath="//input[@value='Male']")
	WebElement gender;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement hobbies;
	
	@FindBy(xpath="//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")
	WebElement language;
	
	@FindBy(xpath="(//select[@type=\'text\'])[1]")
	WebElement skills;
	
	@FindBy(xpath="(//select[@type=\'text\'])[2]")
	WebElement country;
	
	@FindBy(xpath="//span[@tabindex=\"-1\"]")
	WebElement selectcountry;
	
	@FindBy(xpath="(//select[@type=\'text\'])[3]")
	WebElement dobyear;
	
	@FindBy(xpath="//a[text()='English']")
	WebElement english;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getEnglish() {
		return english;
	}

	public WebElement getFistname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMobno() {
		return mobno;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getLanguage() {
		return language;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getSelectcountry() {
		return selectcountry;
	}

	public WebElement getDobyear() {
		return dobyear;
	}

	public WebElement getDobmonth() {
		return dobmonth;
	}

	public WebElement getDobdate() {
		return dobdate;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	@FindBy(xpath="(//select[@type=\'text\'])[4]")
	WebElement dobmonth;
	
	@FindBy(xpath="(//select[@type=\'text\'])[5]")
	WebElement dobdate;
	
	@FindBy(xpath="(//input[@type=\'password\'])[1]")
	WebElement password;
	
	@FindBy(xpath="(//input[@type=\"password\"])[2]")
	WebElement confirmpassword;
}
