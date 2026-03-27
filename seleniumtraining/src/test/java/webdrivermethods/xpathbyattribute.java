package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyattribute {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(" //span[@class ='b3wTlE']")).click();
//	 driver.get("");
	// driver.get("https://www.flipkart.com/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19&ov_redirect=true&pageUID=1772091635840");
	driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/196/196/image/f03c562321e764bb.jpg?q=90']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/aw-men-new-at-store?param=986451&BU=LifeStyle']")).click();
	
		}

}
