package handlingjavascriptpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Alert with Textbox ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[class=\"btn btn-info\"]")).click();
        Thread.sleep(2000);
        Alert popup = driver.switchTo().alert();
        popup.sendKeys("lakshmipriya");
        Thread.sleep(2000);
        popup.accept();
	}
}
