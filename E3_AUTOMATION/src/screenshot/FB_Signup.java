package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FB_Signup {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//SS-->EMPTY WEBPAGE
		TakesScreenshot ts=(TakesScreenshot) driver;
		File emptyTemp = ts.getScreenshotAs(OutputType.FILE);
		File emptyPerm=new File("./screenshot/emptypage.png");
		FileHandler.copy(emptyTemp, emptyPerm);
		//firstname
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("VIJAY");
		File fnTemp = fn.getScreenshotAs(OutputType.FILE);
		File fnPerm=new File("./screenshot/fn.png");
		FileHandler.copy(fnTemp, fnPerm);
		//SS-->Entire webpage
		File lastTemp = ts.getScreenshotAs(OutputType.FILE);
		File lastPerm=new File("./screenshot/last.png");
		FileHandler.copy(lastTemp, lastPerm);
		//quit
		driver.quit();
	}

}
