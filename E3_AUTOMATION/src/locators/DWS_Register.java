package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Register {
	public static void main(String[] args) {
		//launch chrome
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to DWS
		driver.get("https://demowebshop.tricentis.com/register");
		//choose male
		driver.findElement(By.id("gender-male")).click();
		//enter fn
		driver.findElement(By.id("FirstName")).sendKeys("MS");
		//enter ln
		driver.findElement(By.id("LastName")).sendKeys("Dhoni");
		//enter email
		driver.findElement(By.id("Email")).sendKeys("msd077@gmail.com");
		//enter pwd
		driver.findElement(By.id("Password")).sendKeys("msd@123");
		//enter cpwd
		driver.findElement(By.id("ConfirmPassword")).sendKeys("msd@123");
		//click on register button
		driver.findElement(By.id("register-button")).click();
	}

}
