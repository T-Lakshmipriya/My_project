package handlingdropdownmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class learningselectionmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(7000);
		WebElement dropdown = driver.findElement(By.id("Skills"));
		Select sel = new Select(dropdown);
          sel.selectByIndex(9);
          Thread.sleep(1000);
          sel.selectByValue("CSS");
          Thread.sleep(1000);
          sel.selectByVisibleText("Engineering");
          sel.selectByContainsVisibleText("script");
//          Thread.sleep(2000);
//        WebElement a=  driver.findElement(By.id("checkbox1"));
//        a.click();
//        WebElement b=driver.findElement(RelativeLocator.with(By.tagName("input")).below(a));
//        b.click();
	}
}
