package webelementinterrogationmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettextandtag {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement aboutLint = driver.findElement(By.id("navbarDropdown"));
		System.out.println(aboutLint.getText());
		System.out.println(aboutLint.getTagName());

	}
}
