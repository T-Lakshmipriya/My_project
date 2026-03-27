package demo;



import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import com.orangehrm.seleniumframework.genericutility.ScreenshotUtility;
import com.orangehrm.seleniumframework.genericutility.WebDriverUtility;
import com.selenium.UIFrameworkOrangeHRM.DashboardPage;
import com.selenium.UIFrameworkOrangeHRM.LoginPage;


public class capturescreenshot {
	@Test(invocationCount=2)
public void screenshot() throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	WebDriverUtility wu = new WebDriverUtility(driver);
	LoginPage lp = new LoginPage(driver);
	DashboardPage dsp = new DashboardPage(driver);
		ScreenshotUtility ss = new ScreenshotUtility();
	String timestamp =new SimpleDateFormat("yyy-mm-dd[hh-mm-ss]").format(new Date());
	wu.configMaximizedBrowser();
	wu.waitForElementsToLoad(20);
	wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	lp.login("Admin", "admin123");
	Thread.sleep(3000);
//	TakesScreenshot ts =(TakesScreenshot)driver;
//	ts.getScreenshotAs(OutputType.FILE);
//	File temp =ts.getScreenshotAs(OutputType.FILE);
//	File perm = new File("./reports/dashboard"+timestamp+".png");
	ss.captureScreenShot(driver, "DashboardPage");
	ss.captureScreenshot(dsp.clickRecruitment(),"recruitmentLink");
//	FileHandler.copy(temp, perm);
//	WebElement recruitmentLink = dsp.clickRecruitment();
//	File tempsrc =recruitmentLink.getScreenshotAs(OutputType.FILE);
//	File PermTrg = new File("./reports/recruitment"+timestamp+".png");
//	FileHandler.copy(tempsrc, PermTrg);
	
}
}
