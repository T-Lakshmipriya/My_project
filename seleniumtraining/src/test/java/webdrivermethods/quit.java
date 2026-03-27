package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {

	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demowebshop.tricentis.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Facebook")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Twitter")).click();
	    Thread.sleep(1000);
	    driver.close();
	    
	    

	}

}
