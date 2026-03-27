package webdriverinterrogationmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleverification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		String ExpectedTitle = "Demo Web Shop";
		String title =driver.getTitle();
		if(title.equals(ExpectedTitle)) {
			System.out.println("The navigation is successfull");
		}else {
			System.out.println("Navigation failed");
		}
		driver.quit();

	}

}
