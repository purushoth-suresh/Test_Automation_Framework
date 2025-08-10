package com.ui.tests;

import static org.testng.Assert.*;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.utility.LoggerUtility;

@Listeners({ com.ui.listeners.TestListener.class })
public class InvalidCredLoginTest extends TestBase {
	/*
	 * Test Methods 1. Test Script Small!! 2. You Cannot have conditional
	 * statements, loops, try catch in your test method TestScripts ----> Test Steps
	 * 3. Reduce the use of Local Variable 4. At least one assertion
	 */

	Logger logger = LoggerUtility.getLogger(this.getClass());
	private static final String INVALID_EMAIL_ID = "purushoths@gmail.com";
	private static final String INVALID_PASSWORD = "Purushoth";

	@Test(description = "Verifies if the propper error messqge popup when user try to login with Invalid Cred", groups = {
			"e2e",
			"sanity", "smoke" })
	public void loginTest() {
		
		assertEquals(homePage.goToLoginPage().doLoginWithInvalidCredentials(INVALID_EMAIL_ID, INVALID_PASSWORD)
				.getErrorMessage(), "Authentication failed.");
		
	}
}
