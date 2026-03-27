package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class learningbelow {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
//		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		//typing computers in the search text field
//		WebElement search=driver.findElement(By.id("small-searchterms"));
//		search.sendKeys("Computer");
//		Thread.sleep(2000);
//		WebElement searchbtn=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(search));
//		driver.findElement(RelativeLocator.with(By.tagName("a")).above(searchbtn)).click();
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement a =driver.findElement(By.id("name"));
		a.sendKeys("Lakshmipriya");
		Thread.sleep(2000);
		WebElement b= driver.findElement(RelativeLocator.with(By.tagName("input")).below(a));
		b.sendKeys("priya@gmail.com");
		WebElement c = driver.findElement(RelativeLocator.with(By.tagName("input")).below(b));
		c.sendKeys("1234567");
		Thread.sleep(2000);
		 driver.findElement(RelativeLocator.with(By.tagName("button")).below(c)).click();
	
		}
}
