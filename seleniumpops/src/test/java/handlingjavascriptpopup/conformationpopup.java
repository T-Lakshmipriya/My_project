package handlingjavascriptpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='click the button to display a confirm box ']")).click();
        Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();
	}
}
