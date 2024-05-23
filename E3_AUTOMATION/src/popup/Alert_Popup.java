package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get
	("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		//simple
		driver.findElement(By.xpath
		("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//confirmation alert
		driver.findElement(By.xpath
		("//button[text()='Click for JS Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(2000);
		//Prompt
		driver.findElement(By.xpath
		("//button[text()='Click for JS Prompt']")).click();
		driver.switchTo().alert();
		Thread.sleep(1000);
		Alert promt = driver.switchTo().alert();
		System.out.println(promt.getText());
		promt.sendKeys("monster");
		Thread.sleep(1000);
		promt.accept();
	}

}
