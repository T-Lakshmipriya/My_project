package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class github {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class ='mr-2 color-fg-muted']")).click();
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("selenium",Keys.ENTER);
		
	}

}
