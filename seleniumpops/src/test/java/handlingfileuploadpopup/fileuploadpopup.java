package handlingfileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\senth\\OneDrive\\Videos\\MyReport 31-Jan-2026-2.pdf");
		Thread.sleep(2000);
	}

}
