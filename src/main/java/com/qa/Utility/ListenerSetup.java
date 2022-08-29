package com.qa.Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test caser execution started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution failed");
		try {
			UtilClass.takesSS(result.getName()+System.currentTimeMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
}
