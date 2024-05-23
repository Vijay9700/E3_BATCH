package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_AllRadioButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//identify all radiobutton
		List<WebElement> allRadiobutton = driver.
		findElements(By.xpath("//input[@type='radio']"));
		//validate
		//iterate
		for (WebElement radiobutton : allRadiobutton) {
			radiobutton.click();
			//Thread.sleep(1000);
		}
		Thread.sleep(4000);
		driver.quit();
	}

}
