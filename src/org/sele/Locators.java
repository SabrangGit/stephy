package org.sele;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Baseclass {
	public Locators() {
PageFactory.initElements(driver, this);
	}
	@FindBy(name="firstname")
	private WebElement fname;

@FindBy(id="lastname")
private WebElement Lname;

@FindBy(xpath="//input[@value='Female']")
private WebElement Bname;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return Lname;
}

public WebElement getBname() {
	return Bname;
}
}


