package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public final class LoginPage extends BrowserUtility {
	
	private static final By EMAIL_ID_INPUT_TAP = By.id("email");
	private static final By PASSWORD_INUPUT_TAP = By.xpath("//input[@id='passwd']");
	private static final By SIGN_IN_SUBMIT_BUTTON = By.xpath("//*[@id='SubmitLogin']");
	private static final By ERROR_MESSAGE_CREDENTIAL = By.xpath("//div[contains(@class,\"alert-danger\")]/ol/li");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public MyAccountPage doLoginWith(String emailAddress, String password) {
		enterText(EMAIL_ID_INPUT_TAP,emailAddress);
		enterText(PASSWORD_INUPUT_TAP, password);
		clickOn(SIGN_IN_SUBMIT_BUTTON);
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		return myAccountPage;
	}
	
	public LoginPage doLoginWithInvalidCredentials(String emailAddress, String password) {
		enterText(EMAIL_ID_INPUT_TAP,emailAddress);
		enterText(PASSWORD_INUPUT_TAP, password);
		clickOn(SIGN_IN_SUBMIT_BUTTON);
		LoginPage loginPage = new LoginPage(getDriver());
		return loginPage;
	}
	
	public String getErrorMessage() {
		return getVisibleText(ERROR_MESSAGE_CREDENTIAL);
	}
	
	
}
