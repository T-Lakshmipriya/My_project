package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class site {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 //driver.manage().timeouts();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		 Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active' and @href='/web/index.php/recruitment/viewRecruitmentModule']")).click();
		 driver.findElement(By.xpath("//span[.='Recruitment' and @class='oxd-text oxd-text--span oxd-main-menu-item--name']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		 Thread.sleep(2000);
		//driver.findElement(By.name("//input[@class='oxd-input oxd-input--active orangehrm-firstname' and @name='firstName']")).click();
		 driver.findElement(By.name("firstName")).sendKeys("Lakshmi");
		 Thread.sleep(1000);
		 driver.findElement(By.name("lastName")).sendKeys("Priya");
		 driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("priya@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates");
		 Thread.sleep(4000);
			WebElement a=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
			a.click();
			Thread.sleep(7000);
			a.sendKeys("Lakshmi");
			a.sendKeys(Keys.DOWN);
			a.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	}

}
