package demo_web_shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC06_DigitalDownloads {

	@Test(groups = "integration")
	public void digitalDownloads() {
		// launch chrome
		WebDriver driver = new ChromeDriver();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		driver.manage().window().maximize();
		// navigate to DWS
		driver.get("https://demowebshop.tricentis.com");
		// click on digital downloads link
		driver.findElement(By.xpath("(//a[contains(text(),'Digital')])[3]")).click();
		//fetch price
		WebElement price = driver.findElement(By.xpath("(//a[text()='3rd Album'])[2]/../../div[3]/div/span"));
		Reporter.log("price--->album--->"+price.getText(),true);
		driver.quit();
	}
}
