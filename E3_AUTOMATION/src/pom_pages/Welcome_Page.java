package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//step 1-->create a class same as webpage name
public class Welcome_Page {
	//step 2-->create a parameterized constructor
	public Welcome_Page(WebDriver driver)
	{
		//step 4-->initialize the webelement
		PageFactory.initElements(driver, this);
	}
	//step 3-->identify webelement by using @FindBy
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login_link;
	//getter
	public WebElement getLogin_link() {
		return login_link;
	}
	
	@FindBy(linkText = "Register")
	private WebElement register_link;

	public WebElement getRegister_link() {
		return register_link;
	}
	
}
