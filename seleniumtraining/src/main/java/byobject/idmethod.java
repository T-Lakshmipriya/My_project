package byobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/?zx=1772006282392&no_sw_cr=1");
//		Thread.sleep(2000);
//		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
//	
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(1000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
	   
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    driver.findElement(By.name("username")).sendKeys("hey");

	    driver.findElement(By.name("password")).sendKeys("hey");
	    
	}

}
