package windowscrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnHiddenElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php/");
		//select your gender
		driver.findElement(By.cssSelector("[id=\"_R_mad6p4jikacppb6amH3_\"]")).click();
		Thread.sleep(2000);
		//custom      
		driver.findElement(By.xpath("//div[contains(@id,'R_mad6p4jikacppb6am__2')]")).click();
		WebElement hiddenele=driver.findElement(By.xpath("//input[contains(@id,'r_q')]"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Sceret'",hiddenele);
	}
}
