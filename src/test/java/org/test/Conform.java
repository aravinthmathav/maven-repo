package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conform extends BaseClassMain{

	public Conform() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	public WebElement radioButton;
	@FindBy(id="continue")
	public WebElement conform;
	
	
	public WebElement getRadioButton() {
		return radioButton;
	}
	public WebElement getConform() {
		return conform;
	}
	
	
}
