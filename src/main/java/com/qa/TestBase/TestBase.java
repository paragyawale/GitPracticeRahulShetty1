package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.PageLayer.DashBoardPage;
import com.qa.PageLayer.ExchangePage;
import com.qa.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public LoginPage login;
	public DashBoardPage dash;
	public ExchangePage exchange;
	
	@Parameters("browser")		//key = browser, value = chrome, opera etc  ,, to select browser from regression suite
	@BeforeMethod
	public void setUp(String br) { 		// br =chrome 
		
		                                                    // String br = "chrome";    ...... old way
		
		if(br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}
		else if(br.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		}
		else if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	
		}
		else {
			System.out.println("Enter correct browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://apps.dalalstreet.ai/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		//object creation of required classes
		
		login = new LoginPage();
		dash = new DashBoardPage();
		exchange = new ExchangePage();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
	}
	
}
