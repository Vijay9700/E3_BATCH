package testng_basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Char2 {
	@Test(dependsOnMethods = "login")
	public void logout(){
		//System.out.println("logout completed");
		Reporter.log("logout completed",true);
	}
	@Test()
	public void register(){
		//System.out.println("register completed");
		Reporter.log("register completed",true);
	}
	@Test(dependsOnMethods = "register")
	public void login(){
		//System.out.println("login completed");
		Reporter.log("login completed",true);
	}
}
