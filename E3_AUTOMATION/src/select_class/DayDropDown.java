package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DayDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		//step 1
		WebElement dayDD = driver.findElement(By.id("day"));
		//step 2
		Select sel=new Select(dayDD);
		//step 3
		List<WebElement> allOptions = sel.getOptions();
//		for (int i = 0; i < allOptions.size(); i++) {
//			sel.selectByIndex(i);
//		}
		for (WebElement option : allOptions) {
//			//text
//			String text = option.getText();
//			sel.selectByVisibleText(text);
			//value
			String att = option.getAttribute("value");
			sel.selectByValue(att);
		}
	}

}
