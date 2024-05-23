package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(5000);
		//transfer control to frame
		driver.switchTo().frame(0);
		//username
		driver.findElement(By.id("username")).sendKeys("wertyui");
	}

}
