package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderHandling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
		("https://demoapps.qspiders.com/ui/slider?sublist=0");
		Thread.sleep(4000);
		//identify slider
		WebElement slider = driver.findElement(By.xpath
				("//input[@class=' rangeInputSlidebar']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(1000);
		act.dragAndDropBy(slider, -70, 0).perform();
	}

}
