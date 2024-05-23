package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_Tag {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com");
		Thread.sleep(40000);
		//click on first product
		driver.findElement
	(By.xpath("//span[text()='SAMSUNG Galaxy Z Flip4 ']")).click();
		//click on compare-->svg
		Thread.sleep(2000);
		driver.findElement
		(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		//fetch all wids
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		driver.quit();
	}

}
