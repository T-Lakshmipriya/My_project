package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yamaha {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/home/headlines");
		
		driver.findElement(By.xpath("//a[contains(@pg,'NavBar-level0-Briefs#Section_View-2')]")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//a[@title='Go to Home']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'Go to Home')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='close-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@class,'WNm4C')] ")).click();
		driver.findElement(By.xpath("//button[@id='sso-gplus-login']")).click();
		

	}

}
