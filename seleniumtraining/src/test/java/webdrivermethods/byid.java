package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
Thread.sleep(1000);
driver.findElement(By.id("APjFqb")).sendKeys("testing");
//driver.get("https://www.amazon.in/stores/HOME/page/A0167A4E-A0EF-4326-A6C2-3DB00C6B4A85");
//Thread.sleep(2000);
//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sonta");
driver.get("https://www.youtube.com/");
Thread.sleep(1000);
driver.findElement(By.name("search_query")).sendKeys("find");
driver.get("https://www.flipkart.com/");
Thread.sleep(1000);
driver.findElement(By.name("q")).sendKeys("tshirt");
//driver.get("https://www.udemy.com/");
//Thread.sleep(1000);
//driver.findElement(By.id("search-form-autocomplete--2036")).sendKeys("presentation");
driver.get("https://mvnrepository.com/");
Thread.sleep(1000);
driver.findElement(By.id("query")).sendKeys("selenium");
driver.get("https://www.hotstar.com/in/explore");
Thread.sleep(1000);
driver.findElement(By.id("searchBar")).sendKeys("love");
driver.get("https://in.bookmyshow.com/");
Thread.sleep(1000);
driver.findElement(By.id("dummy")).sendKeys("latest");
driver.get("https://www.oracle.com/");
Thread.sleep(1000);
driver.findElement(By.id("u38searchinput")).sendKeys("nextwhat");
driver.get("https://www.mysql.com/");
Thread.sleep(1000);
driver.findElement(By.id("l1-search-input")).sendKeys("latest");

	}

}
