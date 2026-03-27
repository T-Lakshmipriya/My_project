package webdriverinterrogationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
System.out.println(driver.getWindowHandle());
Thread.sleep(1000);
driver.navigate().to("https://www.linkedin.com/feed/");
System.out.println(driver.getWindowHandle());
	}

}
