package com.orangehrm.seleniumframework.recruitment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class createvaccancytest {
WebDriver driver;
@Test
public void addVacancy() throws InterruptedException {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	driver.findElement(By.xpath("//span[.='Recruitment']")).click();
	driver.findElement(By.linkText("Vacancies")).click();
	driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[2]")).sendKeys("..");
WebElement job=driver.findElement(By.cssSelector("[class=\"oxd-select-text-input\"]"));
Thread.sleep(2000);	
job.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
job.sendKeys(Keys.ENTER);
driver.findElement(By.cssSelector("[class=\"oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical\"]")).sendKeys("fjob");
WebElement hiring =driver.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
hiring.sendKeys("l");
Thread.sleep(4000);
hiring.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
hiring.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("(//input[contains(@class,\"oxd-input oxd-input--active\")])[3]")).sendKeys("3");
driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
	
}
}
