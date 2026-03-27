package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbystartswith {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Digital')]")).click();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//span[starts-with(text(),'Toys')]")).click();

	}

}
