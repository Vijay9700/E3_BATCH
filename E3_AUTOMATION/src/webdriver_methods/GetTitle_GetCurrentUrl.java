package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//title
		String title = driver.getTitle();
		System.out.println(title);
		//url
		String cUrl = driver.getCurrentUrl();
		System.out.println(cUrl);
		if(title.contains("Facebook")&& cUrl.contains("facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
	}

}
