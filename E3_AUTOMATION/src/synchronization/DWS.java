package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait
		        (Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on jewelry
		driver.findElement(By.xpath("(//a[contains(text(),'Jewelry')])[3]")).click();
		//Thread.sleep(3000);
		//click on add to cart
		
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		//Thread.sleep(5000);
		//pass data on length
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
		//click on add to cart
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-71']")).click();
		Thread.sleep(7000);
		//click on shoppingcart
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		//Thread.sleep(2000);
		//product
		WebElement product = driver.findElement(By.xpath("(//a[text()='Create Your Own Jewelry'])[2]"));
		if(product.isDisplayed())
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
