package handlingnotificationpopup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMs{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

Thread.sleep(2000);
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//a[.='OrangeHRM, Inc']")).click();
       String parent=driver.getWindowHandle();
       Set<String>childId =driver.getWindowHandles();
       childId.remove(parent);
       for(String p:childId) {
    	   driver.switchTo().window(p);
       }
     if(driver.getCurrentUrl().contains("https://www.orangehrm.com/")) {
    	 System.out.println("validation passed");
     }
     if(driver.getTitle()!=null) {
    	 System.out.println("title is validated");
     }
     driver.close();
     driver.switchTo().window(parent);
     if(driver.getCurrentUrl().contains("login")) {
    	 System.out.println("login page is displayed");
     }
     driver.quit();
    }
}
