package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCssSelector {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to fb
		driver.navigate().to("https://www.facebook.com/");
		//identify email and pass data
		driver.findElement
(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("msd@gmail.com");
		//identify password and pass data
		driver.findElement
(By.cssSelector("input[aria-label='Password']")).sendKeys("msd@123");
		//click on login button
		driver.findElement
(By.cssSelector("button[type='submit']")).click();
	}

}
