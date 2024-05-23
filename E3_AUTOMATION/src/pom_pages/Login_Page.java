package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//step 1
public class Login_Page {
	//step 2
	public Login_Page(WebDriver driver)
	{
		//step 4
		PageFactory.initElements(driver, this);
	}
	//step 3
	@FindBy(id = "Email")
	private WebElement emailTextField;
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement loginButton;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	

}
