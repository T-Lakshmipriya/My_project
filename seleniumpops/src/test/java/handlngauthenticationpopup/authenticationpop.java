package handlngauthenticationpopup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class authenticationpop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
//		driver.get("https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
	}
}
