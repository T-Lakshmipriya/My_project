package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathendswith {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		//ends with not working 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545'and @class='vl-flyout-nav__link-container']")).click();

	}

}
