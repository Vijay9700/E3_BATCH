package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Special {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//identify firstname
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("VIJAY");
		Thread.sleep(1000);
		//fn.clear();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("history.go()");
	}

}
