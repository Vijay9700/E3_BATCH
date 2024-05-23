package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone_CurrentPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to
	    ("https://www.flipkart.com/apple-iphone-14-blue-128-gb/p/itmdb77f40da6b6d?pid=MOBGHWFHSV7GUFWA&lid=LSTMOBGHWFHSV7GUFWAFEQJQ4&marketplace=FLIPKART&q=iphones&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=5cdfc6c8-d7ec-41f3-a863-a820c1a7c62b.MOBGHWFHSV7GUFWA.SEARCH&ppt=sp&ppn=sp&ssid=x7xa8sp8o00000001711795663758&qH=3e7fa8c51e2e4986");
		Thread.sleep(2000);
		//fetch actual price
		WebElement cPrice = driver.findElement(By.xpath
("//span[text()='Apple iPhone 14 (Blue, 128 GB)']/../../../div[4]/div[1]/div/div[2]"));
		System.out.println(cPrice.getText());
		driver.quit();
	}
}
