package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com");
		//click on reg link
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.partialLinkText("ster")).click();
	}

}
