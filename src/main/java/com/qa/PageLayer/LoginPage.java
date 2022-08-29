package com.qa.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	//Initialization
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Enter Email Id
	@FindBy(xpath = "//input[@placeholder='Enter email']")
	private WebElement emailBox;
	
	public void enteerEmailId(String emailID) {
		emailBox.sendKeys(emailID);
	}
	
	//Enter password
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordBox;
	
	public void setPassword(String pass) {
		passwordBox.sendKeys(pass);
	}
	
	//click on login button
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginTab;
	
	public void verifyLoginTab() {
		loginTab.click();
	}
	
	
}
