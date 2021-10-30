package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookClass  extends BaseClassMain{
	
	public BookClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	public WebElement firstname;
	@FindBy(id="last_name")
	public WebElement lastname;
	@FindBy(id="address")
	public WebElement address;
	@FindBy(id="cc_num")
	public WebElement creditcardno;
	@FindBy(id="cc_type")
	public WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	public WebElement month;
	@FindBy(id="cc_exp_year")
	public WebElement year;
	@FindBy(id="cc_cvv")
	public WebElement ccv;
	@FindBy(id="book_now")
	public WebElement booknow;
	
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreditcardno() {
		return creditcardno;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
