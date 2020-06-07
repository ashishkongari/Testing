package com.Nebula.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nebula.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Page Factor
	@FindBy(id = "email")
	WebElement Username;
	
	@FindBy(id = "pass")
	WebElement Password;
	
	@FindBy(id = "u_0_b")
	WebElement LoginBtn;
	
	@FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")
	WebElement Logo;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginDetails() {
		Username.sendKeys(prop.getProperty("username"));
		Password.sendKeys(prop.getProperty("password"));
		LoginBtn.click();
	}
	
	public boolean LogoTest() {
		Logo.isDisplayed();
		return true;
		
	}


}
