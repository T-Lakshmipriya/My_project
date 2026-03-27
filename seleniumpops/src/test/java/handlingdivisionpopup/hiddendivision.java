package handlingdivisionpopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hiddendivision {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.irctc.co.in/nget/train-search");
         Thread.sleep(2000);
         driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
         Thread.sleep(1000);
         driver.findElement(By.cssSelector("[class=\"ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
         Thread.sleep(2000);
         

         Thread.sleep(1000);
         driver.findElement(By.linkText("11")).click();
//         Thread.sleep(1000);
//         driver.findElement(By.xpath("//div[@class='ui-datepicker-title ng-tns-c69-9']/following::a[.='11']")).click();
//         Thread.sleep(2000);
         
	}

}
