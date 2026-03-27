package pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pim {
	@Test
	public static void m1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,\"oxd-main-menu-item\")])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.name("firstName")).sendKeys("Lakshmi");
		driver.findElement(By.name("middleName")).sendKeys("priya");
		driver.findElement(By.name("lastName")).sendKeys("T");
		Thread.sleep(9000);
		WebElement a=driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[5]"));
		a.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
		a.sendKeys("20055abc");
		driver.findElement(By.xpath("//p[text()='Create Login Details']/following::label[1]")).click();
//		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[6]")).sendKeys("priyalakshmi");
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"]")).sendKeys("123abc123");
		driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\") ])[7]")).sendKeys("123abc123");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,\"oxd-main-menu-item\")])[1]")).click();
		//driver.findElement(By.cssSelector("[class=\"oxd-main-menu-item active\"]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[2]")).sendKeys("kaviyaaa");
		WebElement role = driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text')])[1]"));
		role.click();
		role.findElement(By.xpath("(//div[contains(@class,\"oxd-select-option\")])[3]")).click();
		WebElement element=driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
		element.sendKeys("l");
		Thread.sleep(5000);
		element.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
		WebElement ele =driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[2]"));
		ele.click();
		ele.findElement(By.xpath("(//div[contains(@class,\"oxd-select-option\")])[2]")).click();
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		WebElement record =driver.findElement(By.xpath("//span[.='No Records Found']"));
		if(record.isDisplayed()) {
			System.out.println("no record found");
		}else {
			System.out.println("record found");
		}
		WebElement logout=driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]"));
		logout.click();
		logout.findElement(By.xpath("//a[.='Logout']")).click();
		
		
		
	}

}
