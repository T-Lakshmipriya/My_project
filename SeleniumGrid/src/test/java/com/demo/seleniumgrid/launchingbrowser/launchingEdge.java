package com.demo.seleniumgrid.launchingbrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class launchingEdge {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
EdgeOptions options = new EdgeOptions();
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
