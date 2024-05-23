package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		//fetch tag name
		String tag = email.getTagName();
		System.out.println(tag);
		driver.quit();
	}

}
