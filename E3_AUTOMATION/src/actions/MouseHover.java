package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify comuters and mousehover
		WebElement computers = driver.findElement(
		By.xpath("(//a[contains(text(),'Computers')])[1]"));
		//step 1
		Actions act=new Actions(driver);
		//step 2
		act.moveToElement(computers).perform();
		//quit
		Thread.sleep(3000);
		driver.quit();
	}

}
