package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getText());
		Thread.sleep(3000);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement regLink = driver.findElement
				(By.linkText("Register"));
		System.out.println(regLink.getText());
		driver.quit();
	}

}
