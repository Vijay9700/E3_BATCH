package demo_web_shop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_Register {
	WebDriver driver;
	@Test(groups = "functionality")
	@Parameters("browser")
	public void register(String browsername) {
		// launch chrome
		//WebDriver driver = new ChromeDriver();
		//browser config
		if(browsername.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		driver.manage().window().maximize();
		// navigate to DWS
		driver.get("https://demowebshop.tricentis.com");
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		// choose male
		driver.findElement(By.id("gender-male")).click();
		// enter fn
		driver.findElement(By.id("FirstName")).sendKeys("MS");
		// enter ln
		driver.findElement(By.id("LastName")).sendKeys("Dhoni");
		// enter email
		driver.findElement(By.id("Email")).sendKeys("msd077@gmail.com");
		// enter pwd
		driver.findElement(By.id("Password")).sendKeys("msd@123");
		// enter cpwd
		driver.findElement(By.id("ConfirmPassword")).sendKeys("msd@123");
		// click on register button
		driver.findElement(By.id("register-button")).click();
		Reporter.log("resister successful",true);
		driver.quit();
	}
}
