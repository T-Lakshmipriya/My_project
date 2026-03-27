package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class learningmanager {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		Options ref = driver.manage();
//		Window w = ref.window();
//		w.maximize();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
	}

}
