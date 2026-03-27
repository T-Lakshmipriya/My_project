package pim;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class pimm2 {
	public static void m1() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,\"oxd-main-menu-item\")])[2]")).click();
		driver.findElement(By.xpath("//span[contains(@class,\"oxd-topbar-body-nav-tab-item\")]")).click();
		driver.findElement(By.linkText("Termination Reasons")).click();
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[2]")).sendKeys("resigneddd");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		WebElement record =driver.findElement(By.cssSelector("[class=\"oxd-text oxd-text--span\"]"));
		if(record.isDisplayed()) {
			System.out.println("record found");
		}else {
			System.out.println("no record found");
		}
		WebElement logout=driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]"));
		logout.click();
		logout.findElement(By.xpath("//a[.='Logout']")).click();

}
}