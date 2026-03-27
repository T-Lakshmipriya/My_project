package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoapps.qspiders.com/");
//		Thread.sleep(2000);
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//section[.='X Path']")).click();
//Thread.sleep(2000);
//driver.findElement(By.xpath("//section[.='Login 3.0']")).click();
		
		
		
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ico-cart')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Shopping cart')]")).click();
	//
	}

}
