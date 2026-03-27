package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattributevalues {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement search = driver.findElement(By.id("small-searchterms"));
		System.out.println(search.getAttribute("id"));
		System.out.println(search.getDomAttribute("id"));
		System.out.println(search.getDomProperty("id"));
		Thread.sleep(1000);
		search.sendKeys("mobile");
		System.out.println(search.getAttribute("value"));
		System.out.println(search.getDomAttribute("value"));//default value
		System.out.println(search.getDomProperty("value"));
	
	}

}
