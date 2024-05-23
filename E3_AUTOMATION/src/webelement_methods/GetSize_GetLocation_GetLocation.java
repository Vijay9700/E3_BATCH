package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_GetLocation_GetLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		//size
		Dimension size = email.getSize();
		System.out.println(size);
		System.out.println(size.height);
		System.out.println(size.width);
		System.out.println("*************");
		//location
		Point loc = email.getLocation();
		System.out.println(loc);
		System.out.println(loc.x);
		System.out.println(loc.y);
		System.out.println("*************");
		//rect
		Rectangle rect = email.getRect();
		System.out.println(rect.x);
	}

}
