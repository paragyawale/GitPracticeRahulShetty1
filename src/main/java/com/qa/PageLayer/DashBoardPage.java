package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class DashBoardPage extends TestBase {

	public DashBoardPage () {	
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement searchBox;
	
	public void enterInSearchBox(String companyName) {
		searchBox.sendKeys(companyName);
	}
	
	@FindBy (linkText = "WIPRO")
	private WebElement CompanyName;
	
	public void clickOnCompanyName() {
		Actions act = new Actions(driver);
		act.moveToElement(CompanyName).click().perform();
	}
	
}
