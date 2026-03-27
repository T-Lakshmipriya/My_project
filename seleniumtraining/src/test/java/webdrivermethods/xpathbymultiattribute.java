package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbymultiattribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Digital downloads') and @class]")).click();
		
	//	driver.findElement(By.xpath("//a[@href='/digital-downloads' and @class ]")).click();
		driver.findElement(
			    By.xpath("//a[@href='/digital-downloads' and text()='Digital downloads']")
			).click();
	}

}
