package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinktext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		//fetch current url
		String rUrl = driver.getCurrentUrl();
		if(rUrl.contains("register"))
		{
			System.out.println("navigated to reg page");
		}
		else
		{
			System.out.println("register--unsuccessful");
		}
		//come back
		Thread.sleep(2000);
		driver.navigate().back();
		//click on login link
		driver.findElement(By.linkText("Log in")).click();
		String lUrl = driver.getCurrentUrl();
		Thread.sleep(3000);
		if(lUrl.contains("login")){
			System.out.println("navigated to login page");
		}
		else{
			System.out.println("login--unsuccessful");
		}
		Thread.sleep(2000);
		driver.quit();
	}

}
