package popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//click on new window button
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		String pwid = driver.getWindowHandle();
		Set<String> allWids = driver.getWindowHandles();
		for (String wid : allWids) {
			if(wid.equals(pwid)){
				}
			else {
				driver.switchTo().window(wid);
			}
		}
	}

}
