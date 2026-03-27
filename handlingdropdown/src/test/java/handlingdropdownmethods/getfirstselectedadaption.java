package handlingdropdownmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getfirstselectedadaption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		WebElement listbox = driver.findElement(By.id("cars"));
		Select sel = new Select(listbox);
       sel.selectByVisibleText("Audi");
       sel.selectByVisibleText("Saab");
       System.out.println(sel.getFirstSelectedOption().getText());
	}

}
