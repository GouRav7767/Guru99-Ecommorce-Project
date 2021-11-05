package com.Guru99.Listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListner implements IRetryAnalyzer {

	int count = 1;
	int maxlimit = 3;

	public boolean retry(ITestResult result) {

		if (count < maxlimit) {
			count++;
			return true;
		}
		return false;
	}
}
