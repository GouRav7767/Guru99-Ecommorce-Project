package com.Guru99.Listner;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_Ex implements ITestListener {

	Logger log = Logger.getLogger(Listner_Ex.class);
	
	public void onFinish(ITestContext Result) {
		log.info("Test Case is Finished"+ Result.getName());
		
	}

	public void onStart(ITestContext Result) {
		log.info("Test Case is started "+ Result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		
		
	}

	public void onTestFailure(ITestResult Result) {
		log.info("Test Case is Failed"+ Result.getName());
		
	}

	public void onTestSkipped(ITestResult Result) {
		log.info("Test Case is Skipped"+ Result.getName());
		
	}

	public void onTestStart(ITestResult Result) {
		log.info("Test is executed"+ Result.getName());
		
	}

	public void onTestSuccess(ITestResult Result) {
		log.info("Test Case is successed "+ Result.getName());
		
	}

}
