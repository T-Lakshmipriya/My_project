package com.demo.seleniumgrid.launchingbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingFirefox {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--start-maximized");
		 WebDriver driver = new RemoteWebDriver(
	                new URL("http://localhost:4444"),
	                options
	        );
	        
	        // Open application
	        driver.get("https://www.selenium.dev/documentation/grid/");
	        Thread.sleep(5000);
	        
	        // Close browser
	        driver.quit();

	}

}
