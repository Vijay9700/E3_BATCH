package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfTo {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//to(String url)
		driver.navigate().to("https://www.amazon.in/");
		//to(URL url)
		Thread.sleep(1000);
		URL url=new URL("https://www.facebook.com/");
		driver.navigate().to(url);
	}

}
