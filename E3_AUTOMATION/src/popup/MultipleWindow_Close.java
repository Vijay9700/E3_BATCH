package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow_Close {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/6");
		Thread.sleep(50000);
		//click on compare button
		driver.findElement(By.xpath
("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj']")).click();
		//fetch pwid
		String pwid = driver.getWindowHandle();
		//fetch all wids
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			driver.switchTo().window(wid);
			String curl = driver.getCurrentUrl();
			System.out.println(curl);
			if(curl.contains("flipkart"))
			{
				driver.close();
			}
		}
	}

}
