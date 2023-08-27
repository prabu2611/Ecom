package com.testngfeatures;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Count implements IRetryAnalyzer {
	
	int count =0;
	
	int limit =4;
	
	
	

	@Override
	public boolean retry(ITestResult result) {
		
		if (count<limit) { //0<4,1<4
			
			
			count++;
			
			return true;
			
		}
		
		return false;
	}

	
	//IRetryAnalyzer - interface
}
