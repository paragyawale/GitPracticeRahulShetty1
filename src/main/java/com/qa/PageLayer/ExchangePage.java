package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class ExchangePage extends TestBase {

	public ExchangePage() {
		PageFactory.initElements(driver, this);
	}
	
	// click on buy
	@FindBy(xpath = "//a[contains(text(),'Buy')]")
	private WebElement buy;
	
	//enter quantity
	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement quantity;
	
	//click on last buy button
	@FindBy (xpath = "//button[@class='w-md btn btn-success']")
	private WebElement buyBtn;
	
	//check status
	@FindBy(xpath ="//div[contains(text(), 'Order Created successfully')]")
	private WebElement status;
	
	//usage
	public void clickOnBuy() {
		buy.click();	
	}
	public void enterQuantity() {
		quantity.sendKeys("3");
	}
	public void finalBuyBtn() {
		buyBtn.click();
	}
	public String getStatus() {
		String st = status.getText();
		return st;
	}
}
