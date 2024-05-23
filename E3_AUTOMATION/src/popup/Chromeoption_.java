package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoption_ {
	public static void main(String[] args) {
		//step 1
		ChromeOptions opt=new ChromeOptions();
		//step 2
		opt.addArguments("--disable-notifications");
		//step 3
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
	}

}
