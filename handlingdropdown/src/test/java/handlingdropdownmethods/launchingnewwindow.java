package handlingdropdownmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingnewwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
 driver.get("https://www.selenium.dev/");
 Thread.sleep(2000);
 driver.switchTo().newWindow(WindowType.WINDOW);
 driver.get("https://www.oracle.com/java/technologies/downloads/");
 System.out.println(driver.getTitle());
	}

}
