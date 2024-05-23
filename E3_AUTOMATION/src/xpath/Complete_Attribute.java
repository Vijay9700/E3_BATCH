package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Complete_Attribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().
		    to("https://www.facebook.com/signup");
		Thread.sleep(1000);
		//identify fn and pass data
		driver.findElement
(By.xpath("//input[@name='firstname']")).sendKeys("BASHA");
		//surname
		driver.findElement
(By.xpath("//input[@name='lastname']")).sendKeys("BHAI");
		//mobile number
		driver.findElement
(By.xpath("//input[@name='reg_email__']")).sendKeys("9787071222");
	}

}
