package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_GiftCards {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//click on gift cards
		driver.findElement
(By.xpath("(//a[contains(@href,'/gift-cards')])[3]")).click();
		//click on add to cart on 1st product
		Thread.sleep(2000);
		driver.findElement
(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
		//fill details
		Thread.sleep(4000);
		driver.findElement
(By.xpath("//input[contains(@class,'recipient-name')]")).sendKeys("GARUDA");
		driver.findElement
(By.xpath("//input[@id='giftcard_1_RecipientEmail']")).sendKeys("garuda@gmail.com");
		driver.findElement
(By.xpath("//input[@name='giftcard_1.SenderName']")).sendKeys("Vj");
		driver.findElement
(By.xpath("//input[@class='sender-email']")).sendKeys("vj@gmail.com");
		driver.findElement
(By.xpath("//textarea[@class='message']")).sendKeys("An awesome gift for an Awesome personality");
		//click on add to cart
		driver.findElement
(By.xpath("(//input[contains(@value,'Add to cart')])[1]")).click();
		//quit
		Thread.sleep(4000);
		driver.quit();
	}

}
