package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relataivepathhw {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dominos.co.in/");
		//driver.findElement(By.xpath("//input[@class='sc-dOfePm kBqyGz sc-fowSIr cdkOTJ search-input-elm']")).sendKeys("tshirt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='Find a Domino’s Pizza restaurant near you']")).click();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//span[@class='arrow-right']")).click();
       Thread.sleep(2000);
//       driver.findElement(By.xpath("//button[@id='moe-dontallow_button']")).click();
       driver.findElement(By.xpath("//span[.='Skip']")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("optInText")).click(); 
     //  driver.findElement(By.xpath("//button[contains(@id,'optInText')]")).click();
       //driver.findElement(By.xpath("//button[contains(@style,'overflow: hidden; word-spacing: normal !important; letter-spacing: normal !important; width: 100px !important; height: 26px !important;')]")).click();
	}

}
//button[contains(@id,'optInText')]