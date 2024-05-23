package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Links {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		//click on downloads
		Thread.sleep(2000);
		driver.findElement(By.linkText("Downloads")).click();
		//fetch links-->4.18
//		List<WebElement> allLinks = driver.
//		findElements(By.xpath("//a[contains(text(),'4.18')]"));
		//starts-with
		List<WebElement> allLinks=driver.
   findElements(By.xpath("//a[starts-with(text(),'4.18')]"));
		System.out.println(allLinks.size());
		for (WebElement link : allLinks) {
			System.out.println(link.getText());
		}
		driver.quit();
	}

}
