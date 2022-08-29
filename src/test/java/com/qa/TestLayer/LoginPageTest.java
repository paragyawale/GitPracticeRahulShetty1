package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test()
	public void verifyLoginFunctionality() {
		
		login.enteerEmailId("amarwaghmare573@gmail.com");
		login.setPassword("Test@1234");
		login.verifyLoginTab();
	}
	
	
}
