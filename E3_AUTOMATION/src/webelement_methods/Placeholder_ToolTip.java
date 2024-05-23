package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Placeholder_ToolTip {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(4000);
		//click on with place holder
		driver.findElement(By.xpath
		  ("//li[text()='With placeholder']")).click();
		Thread.sleep(2000);
		//fetch placeholder-->emailid
		WebElement emailid = driver.findElement(By.id("email"));
		String placeholder = emailid.getAttribute("placeholder");
		System.out.println("place holder-->"+placeholder);
		//choose with tool tip
		driver.findElement(By.xpath
				("//li[text()='With ToolTip']")).click();
		Thread.sleep(2000);
		//fetch tool tip msg-->name
		WebElement name = driver.findElement(By.id("name"));
		String toolTip = name.getAttribute("title");
		System.out.println("Tool tip--->"+toolTip);
		//quit
		driver.quit();
	}

}
