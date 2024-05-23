package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBank_Reg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		//click on register
		Thread.sleep(2000);
		driver.findElement(By.linkText("Register")).click();
		//perform register operation
		//fn
		driver.findElement
		(By.xpath("//input[@type='text' and @id='customer.firstName']")).sendKeys("VIJAY");
		//ln
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.lastName']")).sendKeys("GANESAN");
		//address
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.address.street']")).sendKeys("Hyderabad");
		//city
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.address.city']")).sendKeys("Hyderabad");
		//state
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.address.state']")).sendKeys("TG");
		//ZIPCODE
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.address.zipCode']")).sendKeys("123456");
		//phno
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.phoneNumber']")).sendKeys("9787071322");
		//ssn
		driver.findElement(By.xpath("//input[@type='text' and @id='customer.ssn']")).sendKeys("454545");
		//un
		driver.findElement(By.xpath("//input[@id='customer.username' and @type='text']")).sendKeys("Vj");
		//pwd
		driver.findElement(By.xpath("//input[@id='customer.password' and @type='password']")).sendKeys("vj@123");
		//cpwd
		driver.findElement(By.xpath("//input[@id='repeatedPassword' and @type='password']")).sendKeys("vj@123");
		//register
		driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
	}

}
