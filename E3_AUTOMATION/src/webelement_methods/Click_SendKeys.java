package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify textfield
		WebElement textField = driver.findElement(By.id("small-searchterms"));
		//textField.click();
		//textField.sendKeys("MS DHONI");
//		//identify link
		WebElement link = driver.findElement(By.linkText("Register"));
		//link.click();
		link.sendKeys("TTTTT");
		Thread.sleep(3000);
		//driver.quit();
	}

}
