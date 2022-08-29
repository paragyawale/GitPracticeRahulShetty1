package com.qa.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class UtilClass extends TestBase {

	public UtilClass() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void takesSS(String filename) throws IOException {
		
		String path = "D:\\SetUps\\GitHub_Repo\\MavenProject\\FrameworkDemo1\\ScreenShots\\";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desti = new File(path+filename+".png");
		FileHandler.copy(src, desti);
		
	}
	
	
	
}
