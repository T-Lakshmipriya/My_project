package windowscrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingbyandto {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollBy(0,1500)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollTo(0,1000)");
	    Thread.sleep(1000);
	    js.executeScript("window.scrollTo(0,1500)");
	}

}
