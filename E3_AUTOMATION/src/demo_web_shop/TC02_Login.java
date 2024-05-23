package demo_web_shop;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pom_pages.Login_Page;
import pom_pages.Welcome_Page;
import utilities.ExcelUtility;
import utilities.PropertiesUtility;

public class TC02_Login {

	@Test(groups = "endtoend")
	public void register() throws IOException {
		// launch chrome
		WebDriver driver = new ChromeDriver();
		// wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// maximize
		driver.manage().window().maximize();

//		// navigate to DWS-->read data from properties
//		// step 1-->get obj of external file
//		FileInputStream fis = new FileInputStream("./data/dwscommon.properties");
//		// step 2-->create an obj for Properties class
//		Properties prob = new Properties();
//		// step 3-->load the external file
//		prob.load(fis);
//		// step 4-->read data
//		String url = prob.getProperty("url");
		// driver.get("https://demowebshop.tricentis.com");
		PropertiesUtility p=new PropertiesUtility();
		String url = p.readProperty("url");
		driver.get(url);

		// click on login link
		//driver.findElement(By.linkText("Log in")).click();
		Welcome_Page w=new Welcome_Page(driver);
		w.getLogin_link().click();

//		// read data
//		// step 1-->get external file obj
//		FileInputStream fis1 = new FileInputStream("./data/dwslogin.xlsx");
//		// step 2-->open excel in read mode
//		Workbook workbook = WorkbookFactory.create(fis1);
//		// step 3-->get sheet control
//		Sheet sheet = workbook.getSheet("login");
//		// step 4-->get row control
//		Row row = sheet.getRow(1);
//		// step 5-->get cell control
//		Cell cell = row.getCell(0);
//		// step 6-->read data
//		String email = cell.getStringCellValue();
//		//System.out.println(email);
//		// password
//		Cell cell1 = row.getCell(1);
//		String pass = cell1.getStringCellValue();
//		//System.out.println(pass);
		ExcelUtility e=new ExcelUtility();
		String email = e.readExcel("login", 1, 0);
		String pass = e.readExcel("login", 1, 1);
		
//		// enter email
//		driver.findElement(By.id("Email")).sendKeys(email);
//		// enter pwd
//		driver.findElement(By.id("Password")).sendKeys(pass);
//		// click on login
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Login_Page l=new Login_Page(driver);
		l.getEmailTextField().sendKeys(email);
		l.getPasswordTextField().sendKeys(pass);
		l.getLoginButton().click();
		Reporter.log("login successful", true);
		driver.quit();
	}
}
