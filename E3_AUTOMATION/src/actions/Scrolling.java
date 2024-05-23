package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//scrolling
		//identify subscribe
		WebElement subscribe = driver.findElement(By.xpath
				("//button[text()='Subscribe']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.scrollToElement(subscribe).perform();
	}

}
