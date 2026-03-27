package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcss {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.selenium.dev/");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//*[name()='svg' and @id='Layer_1']"));
	System.out.println(ele.getCssValue("font"));
	System.out.println(ele.getCssValue("font-family"));
	System.out.println(ele.getCssValue("color"));
	
	
	}

}
