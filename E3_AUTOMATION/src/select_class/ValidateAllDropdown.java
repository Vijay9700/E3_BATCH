package select_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateAllDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(1000);
		//day dropdown
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sel=new Select(dayDD);
		List<WebElement> dayOptions = sel.getOptions();
		for (int i = 0; i < dayOptions.size(); i++) {
			sel.selectByIndex(i);
		}
		Thread.sleep(1000);
		//month dropdown
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sel1=new Select(monthDD);
		List<WebElement> monthOptions = sel1.getOptions();
		for (int i = 0; i <monthOptions.size() ; i++) {
			sel1.selectByIndex(i);
		}
		Thread.sleep(1000);
		//year dropdown
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sel2=new Select(yearDD);
		List<WebElement> yearOptions = sel2.getOptions();
		for (int i = 0; i < yearOptions.size(); i++) {
			sel2.selectByIndex(i);
		}
	}

}
