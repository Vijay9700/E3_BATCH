package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//JSE
		//step 1-->downcast
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step 2-->use JSE methods and pass JS CODE
		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,200);");
		//js.executeScript("window.scrollTo(0,200);");
		WebElement subscribe = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		js.executeScript("arguments[0].scrollIntoView(false)",subscribe );
	}

}
