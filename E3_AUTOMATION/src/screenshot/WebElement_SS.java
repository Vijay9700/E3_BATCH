package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_SS {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//email
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vijay@gmail.com");
		File temp = email.getScreenshotAs(OutputType.FILE);
		File perm=new File("./screenshot/WESS.png");
		FileHandler.copy(temp, perm);
		driver.quit();
	}

}
