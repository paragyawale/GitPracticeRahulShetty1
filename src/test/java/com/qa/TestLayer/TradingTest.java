package com.qa.TestLayer;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class TradingTest extends TestBase {

	@Test
	public void verifyBuyShare() throws InterruptedException {
		login.enteerEmailId("amarwaghmare573@gmail.com");
		login.setPassword("Test@1234");
		login.verifyLoginTab();
		//-------------------------------
		Thread.sleep(2000);
		dash.enterInSearchBox("WIPRO");
		Thread.sleep(2000);
		dash.clickOnCompanyName();
		//---------------------------
		Thread.sleep(2000);
		exchange.clickOnBuy();
		exchange.enterQuantity();
		Thread.sleep(1000);
		exchange.finalBuyBtn();
		
		Assert.assertEquals("Order Created successfully", exchange.getStatus());
		
		
	}
	
	
}
