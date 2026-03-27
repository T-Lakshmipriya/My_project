package webdriverinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	}

}
