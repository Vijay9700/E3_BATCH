package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		//step 1-->identify the dd
		WebElement dayDD = driver.findElement(By.id("day"));
		//step 2-->create an obj for Select and pass dd ref
		Select sel=new Select(dayDD);
		//step 3-->use select class methods
		System.out.println(sel.isMultiple());
		Thread.sleep(1000);
		sel.selectByIndex(6);
		Thread.sleep(1000);
		sel.selectByValue("31");
		Thread.sleep(1000);
		sel.selectByVisibleText("18");
		sel.deselectByVisibleText("18");
		              //UnsupportedOperationException
		}

}
