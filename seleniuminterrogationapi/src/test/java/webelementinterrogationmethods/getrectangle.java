package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrectangle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(9000);
		WebElement checkbtn = driver.findElement(By.id("Check"));
		System.out.println("is checkbtn enabled: "+checkbtn.isEnabled());

	}

}
