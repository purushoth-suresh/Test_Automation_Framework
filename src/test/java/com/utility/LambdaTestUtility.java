package com.utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTestUtility {
	public static final String HUB_URL = "https://hub.lambdatest.com/wd/hub";
	private static ThreadLocal<WebDriver> driverLocal = new ThreadLocal<WebDriver>();
	private static ThreadLocal<DesiredCapabilities> capablitiesLocal = new ThreadLocal<DesiredCapabilities>();
	
	public static WebDriver initializeLambdaTestSession(String browser, String testName) {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("browserVersion", "127");
        Map<String, Object> ltOptions = new HashMap<>();
        ltOptions.put("user", "purushothsuresh22");
        ltOptions.put("accessKey", "LT_pxHm63tX1h0nrkcP4MQvI8JW3OGn8sWY7EHyQnpq2rtvuGy");
        ltOptions.put("build", "Selenium 4");
        ltOptions.put("name", testName);
        ltOptions.put("platformName", "Windows 10");
        ltOptions.put("seCdp", true);
        ltOptions.put("selenium_version", "4.23.0");
        capabilities.setCapability("LT:Options", ltOptions);
        capablitiesLocal.set(capabilities);
        WebDriver driver = null;
        try {
        	driver = new RemoteWebDriver(new URL(HUB_URL), capablitiesLocal.get());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
        driverLocal.set(driver);
        return driverLocal.get();
	}
	
	public static void quitSession() {
		if(driverLocal != null) {
			driverLocal.get().quit();
		}
	}
}
