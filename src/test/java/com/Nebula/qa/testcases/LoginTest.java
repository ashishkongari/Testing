package com.Nebula.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Nebula.qa.base.TestBase;
import com.Nebula.qa.pages.LoginPage;

public class LoginTest extends TestBase{
	LoginPage loginpage;
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginpage = new LoginPage();
	}
	
	@Test
	public void LoginDetailstest() {
		loginpage.LoginDetails();
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}
