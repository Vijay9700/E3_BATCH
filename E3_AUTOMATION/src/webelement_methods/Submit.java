package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
//		//identify login
//		driver.findElement(By.xpath("//input[@value='Log in']"))
//		                .submit();will work perfectly
		driver.findElement(By.linkText("Register"))
		  .submit();//UnsupportedOperationException
		Thread.sleep(2000);
		driver.quit();
	}

}
