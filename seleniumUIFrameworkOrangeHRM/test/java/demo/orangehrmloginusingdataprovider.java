package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.UIFrameworkOrangeHRM.LoginPage;

public class orangehrmloginusingdataprovider {

    WebDriver driver;

    @DataProvider(name = "LoginData")
    public Object[][] getCredential() {
        return new Object[][] {
            {"Admin", "admin123"}
        };
    }

    @Test(dataProvider = "LoginData")
    public void Login(String user, String pass) {

        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        LoginPage lp = new LoginPage(driver);
        lp.login(user, pass); 

        driver.quit(); 
    }
}