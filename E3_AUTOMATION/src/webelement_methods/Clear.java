package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vj@gmail.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("msd@gmail.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("leo@gmail.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("aliabhatt@gamil.com");
		Thread.sleep(1000);
		email.clear();
		email.sendKeys("abc@gmail.com");
		Thread.sleep(1000);
	}

}
