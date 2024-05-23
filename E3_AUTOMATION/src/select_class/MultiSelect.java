package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//step 1-->identify multi dd
		WebElement multi = driver.findElement(By.id("cars"));
		//step 2
		Select sel=new Select(multi);
		//step 3
		System.out.println(sel.isMultiple());
		Thread.sleep(1000);
		sel.selectByIndex(0);
		Thread.sleep(1000);
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByIndex(2);
		Thread.sleep(1000);
		sel.deselectByIndex(3);
		
	}

}
