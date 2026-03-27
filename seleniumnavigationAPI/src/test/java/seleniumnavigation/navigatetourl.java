package seleniumnavigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatetourl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		//navigate to flipkart
		URL url = new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
		Thread.sleep(2000);
		//navigate to ubereats
		driver.navigate().to(new URL("https://www.ubereats.com/in"));
	}
}
