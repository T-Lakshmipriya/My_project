package webdrivermethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// by linktext---------------------------------------------------------
//		driver.get(" https://demowebshop.tricentis.com/login");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Facebook")).click();
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Gmail")).click();
	//-----------------------partiallink-------------------------
//		driver.get("https://demowebshop.tricentis.com/login");
//		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Computers")).click();
//		driver.get("https://www.flipkart.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
//      // 	driver.findElement(By.linkText("Login")).click();
//		
//		driver.get("https://demowebshop.tricentis.com/login");
//		Thread.sleep(2000);
//		driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		driver.findElement(By.className("cart-label")).click();
		
		// tagname
//	driver.get("https://www.google.com/");
//		Thread.sleep(2000);
//		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
//		for(WebElement link:alllinks) {
//			System.out.println(link.getText());
		
		//--------------------------------------------------------------------------------
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		

List<WebElement> links = driver.findElements(By.tagName("a"));

for(WebElement link:links) {
System.out.println(link.getText());
}
		for (WebElement lin : links) {
		    if (lin.getText().contains("Store")) {
		        lin.click();
		        break;   // stop after clicking
		    }
		}
			}
		
		

	}


