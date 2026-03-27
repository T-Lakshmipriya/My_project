package recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class rec {
	public void m2() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		driver.findElement(By.xpath("//a[.='Vacancies']")).click();
		WebElement job=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[1]"));
        job.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        job.sendKeys(Keys.ENTER);
        WebElement vaccancy=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[2]"));
        vaccancy.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        vaccancy.sendKeys(Keys.ENTER);
        WebElement hiring=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[3]"));
        hiring.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        hiring.sendKeys(Keys.ENTER);
        WebElement status=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[4]"));
        status.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
        status.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
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