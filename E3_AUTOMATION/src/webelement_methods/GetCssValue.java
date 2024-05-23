package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify login
		WebElement login = driver.findElement(By.name("login"));
		String color = login.getCssValue("color");
		String font = login.getCssValue("font");
		String family = login.getCssValue("font-family");
		System.out.println(color);
		System.out.println(font);
		System.out.println(family);
		driver.quit();
	}

}
