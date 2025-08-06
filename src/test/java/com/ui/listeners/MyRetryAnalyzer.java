package com.ui.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.constants.Env;
import com.utility.JSONUtility;
import com.utility.PropertiesUtil;

public class MyRetryAnalyzer implements IRetryAnalyzer {
	//For Properties
	//private static final int MAXIMUM_NUMBER_OF_ATTEMPT = Integer.parseInt(PropertiesUtil.readProperty(Env.DEV, "MAXIMUM_NUMBER_OF_ATTEMPT"));
	
	//For JSON
	private static final int MAXIMUM_NUMBER_OF_ATTEMPT = JSONUtility.readJSON(Env.QA).getMAXIMUM_NUMBER_OF_ATTEMPT();
	
	private static int currentAttempt = 1;

	@Override
	public boolean retry(ITestResult result) {
		if(currentAttempt <= MAXIMUM_NUMBER_OF_ATTEMPT) {
			currentAttempt++;
			return true;
		}
		return false;
	}

}
