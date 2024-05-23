package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books_Computers {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//click on books link
		Thread.sleep(2000);
		driver.findElement
		(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		//validate
		Thread.sleep(2000);
		String bookUrl = driver.getCurrentUrl();
		if(bookUrl.contains("books"))
		{
			System.out.println("BOOKS PAGE IS DISPLAYED");
		}
		else
		{
			System.out.println("BOOKS PAGE NOT DISPALYED");
		}
		//COMEBACK
		driver.navigate().back();
		//click on computers link
		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		//validate
		Thread.sleep(2000);
		String computerUrl = driver.getCurrentUrl();
		if(computerUrl.contains("computers"))
		{
			System.out.println("COMPUTERS PAGE IS DISPALYED");
			driver.manage().window().fullscreen();
		}
		else
		{
			System.out.println("COMPUTERS PAGE NOT DISPLAYED");
		}
		//QUIT
		Thread.sleep(4000);
		driver.quit();
	}

}
