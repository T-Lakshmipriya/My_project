package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        Thread.sleep(1000);
        WebElement a = driver.findElement(By.name("q"));
        Point loc = a.getLocation();
        System.out.println(loc.x);
        System.out.println(loc.getX());
        System.out.println(loc.y);
        System.out.println(loc.getY());
        driver.quit();
	}

}
 