package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllOfferPercentage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		//search for iphone
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.xpath
				("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//fetch percentage of all
		List<WebElement> allOffers = driver.findElements(By.xpath
("//div[@class='_4rR01T']/../../div[2]/div[1]/div[1]/div[3]/span"));
		for (WebElement offer : allOffers) {
			System.out.println(offer.getText());
		}
		driver.quit();
	}

}
