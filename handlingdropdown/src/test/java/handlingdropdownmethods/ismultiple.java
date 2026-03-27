package handlingdropdownmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/select-menu");
Thread.sleep(2000);
Select old_style= new Select(driver.findElement(By.id("oldSelectMenu")));
System.out.println(old_style.isMultiple());
//Select old = new Select(driver.findElement(By.id("react-select-4-live-region")));
//System.out.println(old.isMultiple());
	}

}
