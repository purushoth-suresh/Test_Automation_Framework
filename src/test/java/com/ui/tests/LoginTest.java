package com.ui.tests;


import static org.testng.Assert.*;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ui.pojo.User;
import com.utility.LoggerUtility;

@Listeners({com.ui.listeners.TestListener.class})
public class LoginTest extends TestBase {
	/*
	 * Test Methods
	 * 1. Test Script Small!! 
	 * 2. You Cannot have conditional statements, loops, try catch in your test method
	 * TestScripts ----> Test Steps
	 * 3. Reduce the use of Local Variable
	 * 4. At least one assertion
	 */
	
	Logger logger = LoggerUtility.getLogger(this.getClass());

	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
			dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestDataProvider")
	public void loginTest(User user) {
		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Purushoth Suresh");
	}
	
//	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
//			dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestCSVDataProvider")
//	public void loginCSVTest(User user) {
//		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Purushoth Suresh");
//	}
//	
//	@Test(description = "Verifies with the valid user is able to login into the application", groups = {"e2e","sanity"},
//			dataProviderClass = com.ui.dataprovider.LoginDataProvider.class, dataProvider = "LoginTestDataProvider / LoginTestExcelDataProvider", 
//			retryAnalyzer = com.ui.listeners.MyRetryAnalyzer.class )
//	public void loginExcelTest(User user) {
//	
//		assertEquals(homePage.goToLoginPage().doLoginWith(user.getEmailAddress(), user.getPassword()).getUserName(),"Purushoth Suresh1");
//		
//	}

}
