package RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class executingrelativelocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
firstname.sendKeys("lakshmi");
WebElement lastname=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstname));
lastname.sendKeys("priya");
WebElement address =driver.findElement(RelativeLocator.with(By.cssSelector("[ng-model='Adress']")).below(lastname));
address.click();
//RelativeLocator.with(By.tagName("a")).near(By.id(""),10);
	}

}
