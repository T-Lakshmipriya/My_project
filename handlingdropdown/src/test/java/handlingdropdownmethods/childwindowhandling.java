package handlingdropdownmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowhandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//h2[.='Laptop']/..//button[.='view more']")).click();
        Thread.sleep(1000);
        String parentId = driver.getWindowHandle();
        Set<String> allwindowId = driver.getWindowHandles();
        allwindowId.remove(parentId);
        for(String childId:allwindowId) {
        	driver.switchTo().window(childId);
        }
        WebElement c=driver.findElement(By.xpath("//button[.='Add to Cart']"));
        c.click();
        c.click();
        Thread.sleep(2000);
        WebElement a=driver.findElement(By.xpath("//*[local-name()='svg']"));
        a.click();
        Thread.sleep(2000);
        WebElement shoppingcart = driver.findElement(By.tagName("h2"));
        if(a.isDisplayed()) {
        System.out.println("test case status:pass");
        }
	 else {
		System.out.println("test case status:fail");
	}
driver.close();
}}
