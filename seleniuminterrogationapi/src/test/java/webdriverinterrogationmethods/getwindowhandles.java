package webdriverinterrogationmethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
         driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
         Thread.sleep(1000);
        String parentId=driver.getWindowHandle();
         System.out.println(parentId);
         driver.findElement(By.xpath("//h2[.='Watches']/..//button[.='view more']")).click();
         Thread.sleep(2000);
                Set<String>allwindowid=driver.getWindowHandles();
                System.out.println(allwindowid);
                allwindowid.remove(parentId);
                for(String string:allwindowid) {
                	System.out.println(string);
                }
                driver.quit();
	}
}
