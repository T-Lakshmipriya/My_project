package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativetorightof {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("WebTable"))).click();
//		WebElement firstname =driver.findElement(By.cssSelector("[placeholder='First Name']"));
//		driver.findElement(RelativeLocator.with(By.tagName("input")).near(firstname,100)).sendKeys("check");
//		
		

	}

}
