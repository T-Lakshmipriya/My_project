package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstname {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
//	driver.get("https://demo.automationtesting.in/Register.html");
//	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("LAKSHMI");
//
//    // Last Name
//    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("PRIYA");
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(5000);
    driver.findElement(By.name("username")).sendKeys("Admin");
    driver.findElement(By.name("password")).sendKeys("admin123");
    driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}
