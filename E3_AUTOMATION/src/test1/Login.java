package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(5000);
		//choose webelement
		//driver.findElement(By.cssSelector("li[class='relative flex items-center justify-between  ps-5 pe-2 text-[15px] bg-gradient-to-r from-orange-400 to-orange-600 text-white rounded-e-sm py-1 mt-1 cursor-pointer']")).click();
		//choose textbox
		driver.findElement(By.linkText("Text Box")).click();
		//enter name
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys("MSD");
		//enter email
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("msd@gmail.com");
		//enter password
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Msd@123");
		//click on reg
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
		String curl = driver.getCurrentUrl();
		if(curl.contains("login"))
		{
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("msd@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Msd@123");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		}
		else
		{
			System.out.println("login page not displayed");
		}
	}

}
