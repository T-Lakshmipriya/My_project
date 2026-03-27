package recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class rec1 {
	public void m2() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	driver.findElement(By.xpath("//span[.='Recruitment']")).click();
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
	driver.findElement(By.name("firstName")).sendKeys("lakshmi");
	driver.findElement(By.name("middleName")).sendKeys("priya");
	driver.findElement(By.name("lastName")).sendKeys("T");
WebElement vaccancy=driver.findElement(By.cssSelector("[class=\"oxd-select-text-input\"]"));
vaccancy.click();
Thread.sleep(2000);
vaccancy.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
Thread.sleep(1000);
vaccancy.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[5]")).sendKeys("priya@gmail.com");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Contact Number']/..//..//input[@class='oxd-input oxd-input--active']")).sendKeys("638278979");
driver.findElement(By.cssSelector("[class=\"oxd-file-input\"]")).sendKeys("P:\\lakshmipriyaa\\resume.pdf");
//WebElement date=driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[8]"));
//date.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
driver.findElement(By.linkText("Candidates")).click();
WebElement b=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[1]"));
b.click();
Thread.sleep(2000);
b.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
b.sendKeys(Keys.ENTER);
		WebElement c=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[2]"));
		c.click();
		Thread.sleep(2000);
		c.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		c.sendKeys(Keys.ENTER);
		WebElement d=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[3]"));
		d.click();
		Thread.sleep(2000);
		d.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		d.sendKeys(Keys.ENTER);
		WebElement e=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[4]"));
		e.click();
		Thread.sleep(2000);
		e.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		e.sendKeys(Keys.ENTER);
        WebElement name=driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]"));
        name.sendKeys("l");
        Thread.sleep(2000);
        name.sendKeys(Keys.ARROW_DOWN);
        name.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("[placeholder=\"Enter comma seperated words...\"]")).sendKeys("123456");
        WebElement f=driver.findElement(By.xpath("(//div[contains(@class,\"oxd-select-text-input\")])[5]"));
		f.click();
		Thread.sleep(2000);
		f.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		f.sendKeys(Keys.ENTER);
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