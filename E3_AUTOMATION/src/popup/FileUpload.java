package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		//identify choose file
		Thread.sleep(2000);
		WebElement popup = driver.findElement(By.id("file-upload"));
		popup.sendKeys
("C:\\Users\\qspiders kphb\\m4\\E3_AUTOMATION\\file\\TEST 1.txt");
	}

}
