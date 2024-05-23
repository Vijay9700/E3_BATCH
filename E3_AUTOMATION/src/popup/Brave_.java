package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Brave_ {
	public static void main(String[] args) {
		// step 1
		ChromeOptions opt = new ChromeOptions();
		opt.setBinary
("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.redbus.in/");
	}

}
