package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_Manage {
	public static void main(String[] args) throws InterruptedException {
		//launch chrome
		WebDriver driver=new ChromeDriver();
		//maximize
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//navigate to fb
		driver.get("https://www.facebook.com/");
//		//minimize
//		Thread.sleep(1000);
//		//driver.manage().window().minimize();
//		//fullscreen
//		Thread.sleep(1000);
		//driver.manage().window().fullscreen();
		//size
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println(size.height);
		System.out.println(size.width);
		//position
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println(position.x);
		System.out.println(position.y);
	}

}
