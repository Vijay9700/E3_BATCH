package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		//click on button
		driver.findElement(By.id("timerAlertButton")).click();
		//step 1
		WebDriverWait wait=new WebDriverWait
				(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		//handle alert
		driver.switchTo().alert().accept();

	}

}
