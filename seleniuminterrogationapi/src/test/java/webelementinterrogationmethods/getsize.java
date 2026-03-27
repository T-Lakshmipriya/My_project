package webelementinterrogationmethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class getsize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement searchbtn = driver.findElement(By.id("nav-search-submit-button"));
		Dimension dim = searchbtn.getSize();
		System.out.println(dim);
		System.out.println(dim.getHeight());
		System.out.println(dim.height);
		System.out.println(dim.getWidth());
		System.out.println(dim.width);
		System.out.println(searchbtn.getCssValue("height"));
	}
}
