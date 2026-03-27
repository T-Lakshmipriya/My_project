package handlingnotificationpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class si {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("Admin");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[placeholder=\"Password\"]")).sendKeys("admin123");
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
Thread.sleep(4000);
//driver.findElement(By.cssSelector("[class=\"oxd-main-menu-search\"]")).click();
driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\" and @href=\"/web/index.php/admin/viewAdminModule\"]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
Thread.sleep(3000);
WebElement user=driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"][1]"));
user.click();
Thread.sleep(4000);
driver.findElement(By.xpath("//span[text()='ESS']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--ghost\"]")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[.='Logout']")).click();
driver.quit();
}
}