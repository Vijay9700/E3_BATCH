package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(1000);
		//click on button
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(1000);
		//driver.close();//will close only parent
		driver.quit();//will close both parent and child
	}

}
