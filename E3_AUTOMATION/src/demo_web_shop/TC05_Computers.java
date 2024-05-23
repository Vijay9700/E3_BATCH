package demo_web_shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC05_Computers {
	@Test(groups = "integration")
	public void computers() throws InterruptedException {
		// launch chrome
		WebDriver driver = new ChromeDriver();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		driver.manage().window().maximize();
		// navigate to DWS
		driver.get("https://demowebshop.tricentis.com");
		// click on computers link
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		// click on product
		driver.findElement(By.xpath("(//a[@title='Show products in category Desktops'])[1]")).click();
		// click on add to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		// add to cart
		driver.findElement(By.id("add-to-cart-button-72")).click();
		// click on shopping cart
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("computers-->product added successfully",true);
		driver.quit();
	}

}
