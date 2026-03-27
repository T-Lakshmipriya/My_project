package seleniumnavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Automation");
		Thread.sleep(1000);
        driver.navigate().to("https://www.amazon.in/");
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @placeholder='Search Amazon.in']")).sendKeys("tools");
        driver.navigate().refresh();
        driver.navigate().back();
        System.out.println(driver.getTitle());
	}

}
