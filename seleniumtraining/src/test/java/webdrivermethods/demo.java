package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[.='14.1-inch Laptop']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']")).click();
		//a[.='14.1-inch Laptop']/parent::h2/following-sibling::div[@class='add-info']/child::div[@class='buttons']
	}

}
