package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("checkbox1"));
		e.click();
		Thread.sleep(2000);
        e.click();

	}
}
