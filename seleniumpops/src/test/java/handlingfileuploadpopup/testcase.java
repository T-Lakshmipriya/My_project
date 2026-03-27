package handlingfileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
        driver.findElement(By.cssSelector("[data-val=\"exp\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[id=\"resumeUpload\"]")).sendKeys("C:\\Users\\senth\\OneDrive\\Videos\\MyReport 31-Jan-2026-2.pdf");
	}

}
