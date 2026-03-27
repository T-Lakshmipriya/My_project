package webelementsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
      driver.get("https://demo.automationtesting.in/Register.html");	
      Thread.sleep(1000);
      driver.findElement(By.cssSelector("[value=\"FeMale\"]")).click();

	}

}
