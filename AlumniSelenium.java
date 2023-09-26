import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alumni {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sofiabarbosa/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://alumni.education/");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("login-mail")).sendKeys("barbosasofialuz@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("Sofisofi");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector(".it-button.font-mulish.tw-mx-auto.dark.large")).click();		
		System.out.println(driver.findElement(By.className("text-it-error")).getText());


	}

}
