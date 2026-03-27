package com.orangehrm.seleniumframework.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.selenium.UIFrameworkOrangeHRM.LoginPage;

public class baseclass {

	 public WebDriver driver;
	 public Properties prop;

	    @BeforeClass
	    public void beforeClass() throws IOException {
	     
	        prop = new Properties();
	    	   FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHrm_commondata/commondata.properties");
	    	   String Browser = prop.getProperty("browser");
				prop.load(fis);
				
				Browser=prop.getProperty("browser");
				
				if(Browser.contains("chrome")) {
					driver=new ChromeDriver();
				}
				else if(Browser.contains("firefox")) {
					driver=new FirefoxDriver();
				}
				else {
					driver=new EdgeDriver();
				}
	       
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    }

	    @BeforeMethod
	    public void beforeMethod() throws IOException {
	        Reporter.log("Executing:beforemethod", true);
	     

			String URL=prop.getProperty("url");

			System.out.println(URL);

			String brow=prop.getProperty("browser");
			String un=prop.getProperty("username");
			String pass=prop.getProperty("password");
			//login
			driver.get(URL);
	        

	        LoginPage lp = new LoginPage(driver);
	        lp.login("Admin", "admin123");
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.quit();
	    }
}