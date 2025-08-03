package com.ui.pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.constants.Browser;
import static com.constants.Env.*;
import com.utility.BrowserUtility;
import com.utility.JSONUtility;
import com.utility.LoggerUtility;


public final class HomePage extends BrowserUtility {
	Logger logger = LoggerUtility.getLogger(this.getClass());

	private static final By SIGN_IN_BUTTON = By.xpath("//a[@class='login']");

	public HomePage(Browser browserName,boolean isHeadless) {
		super(browserName,isHeadless);
		maximizeWindow();
//		goToWebsite(readProperty(QA, "URL"));
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}
	
	public HomePage(WebDriver driver) {
		super(driver);
		goToWebsite(JSONUtility.readJson(QA).getUrl());
	}
	
	public LoginPage goToLoginPage() { //Page Function --> cannot be void!!
		logger.info("Trying To Performing click to go to Sign in Page");
		clickOn(SIGN_IN_BUTTON);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
	
}
