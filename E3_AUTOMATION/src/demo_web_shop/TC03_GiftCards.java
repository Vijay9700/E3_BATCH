package demo_web_shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC03_GiftCards {
	@Test(groups = "endtoend")
	public void giftcards() throws InterruptedException {
		// launch chrome
		WebDriver driver = new ChromeDriver();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		driver.manage().window().maximize();
		// navigate to DWS
		driver.get("https://demowebshop.tricentis.com");
		//click on giftcards
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[3]")).click();
		//click on add to cart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//name
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("LAILA");
		//email
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("laila@gmail.com");
		//your name
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys("MAJNU");
		//your email
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("majnu@gmail.com");
		//message
		driver.findElement(By.id("giftcard_1_Message")).sendKeys("GIFT FOR A PRECIOUS GIFT");
		//add to cart
		driver.findElement(By.id("add-to-cart-button-1")).click();
		//click on shopping cart
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Reporter.log("gift cards-->product added successfully",true);
		driver.quit();
	}

}
