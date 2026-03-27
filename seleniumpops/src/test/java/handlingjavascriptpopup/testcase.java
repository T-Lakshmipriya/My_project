package handlingjavascriptpopup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.myntra.com/");
	 Thread.sleep(2000);
	WebElement search= driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	 search.sendKeys("dresses");
	 search.sendKeys(Keys.DOWN);
	 search.sendKeys(Keys.ENTER);
	 Thread.sleep(3000);
	 driver.findElement(By.id("36519615")).click();
	// driver.findElement(By.cssSelector("36519615")).click();
	 Thread.sleep(9000);
	// driver.findElement(By.className(" pdp-add-to-wishlist pdp-button pdp-add-to-wishlist pdp-button pdp-flex pdp-center ")).click();
//	 driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
	 String parentId=driver.getWindowHandle();
	 Set<String> childId = driver.getWindowHandles();
	 childId.remove(parentId);
	 for(String str:childId) {
	 driver.switchTo().window(str);
 }
	 Thread.sleep(2000);
 driver.findElement(By.xpath("//span[text()='WISHLIST']")).click();
}
}
