package seleniumpops;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
         Thread.sleep(2000);
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
         driver.findElement(By.id("nav-search-submit-button")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("data-index=\"3\"")).click();
         Thread.sleep(2000);
         Set<String>allwindowId = driver.getWindowHandles();
         String parentId = driver.getWindowHandle();
		allwindowId.remove(parentId);
		for(String childId:allwindowId) {
			driver.switchTo().window(childId);
		}
		Actions act = new Actions(driver);
		act.scrollToElement(null).click();
		Thread.sleep(4000);
		driver.close();    
	}
}
