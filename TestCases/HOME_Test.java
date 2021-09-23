package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Constants.Constant;
import Pages.HomePage;
import Pages.PAGE_LOGIN;

public class HOME_Test extends HomePage 
{
	
	public HOME_Test()
	{
		super();
	}
	@BeforeTest
	public void setup()
	{
		initialize();
		PAGE_LOGIN.loginid(property.getProperty("Username"));
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		PAGE_LOGIN.loginpass(property.getProperty("Password"));
	}
	@Test
	public void selectproCompose()
	{
		
		HomePage.navigate_to_newMessage();
	}
	
}
