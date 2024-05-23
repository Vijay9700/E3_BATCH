package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_FetchAllLinks {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//fetch all links
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks=driver.
				findElements(By.tagName("a"));
		System.out.println(allLinks.size());//fetch size
		System.out.println(allLinks);//print obj addresses
		//iteration
		for (WebElement links : allLinks) {
			System.out.println(links.getText());//print links
		}
		driver.quit();
	}

}
