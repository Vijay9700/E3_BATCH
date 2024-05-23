package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//enter email
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("romeo@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Romeo@123");
		//click on login button
		driver.findElement(By.name("login")).click();
	}

}
