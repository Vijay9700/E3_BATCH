package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_Login {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		driver.findElement(By.className("email")).sendKeys("romeo@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Romeo@123");
//		driver.findElement(By.className("button-1 login-button")).click();
//		   //InvalidSelectorException 
		driver.findElement
(By.cssSelector("input[class='button-1 login-button']")).click();
	}

}
