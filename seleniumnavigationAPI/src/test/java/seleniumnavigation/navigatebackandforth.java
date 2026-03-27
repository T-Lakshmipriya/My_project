package seleniumnavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatebackandforth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.navigate().to("https://www.bigbasket.com/");
	    Thread.sleep(1000);
	    driver.navigate().to("https://www.youtube.com/");
	    Thread.sleep(1000);
	    driver.navigate().back();
	    System.out.println(driver.getTitle());
	    driver.navigate().forward();
	    System.out.println(driver.getTitle());
	    driver.quit();

	}

}
