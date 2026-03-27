package handlingjavascriptpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		   driver.switchTo().alert().accept();
        driver.findElement(By.id("small-searchterms")).sendKeys("Computer");
        Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
	}

}
