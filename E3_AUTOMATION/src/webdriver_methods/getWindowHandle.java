package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		//click on button
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		//fetch pwid
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		//fetch all wids
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		driver.quit();
	}

}
