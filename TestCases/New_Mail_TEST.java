package TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Constants.Constant;
import Pages.HomePage;
import Pages.PAGE_LOGIN;
import Pages.Page_NewMessage;

public class New_Mail_TEST extends Baseclass 
{
	public New_Mail_TEST()
	{
		super();
	}
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		initialize();
		PAGE_LOGIN.loginid(property.getProperty("Username"));
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		PAGE_LOGIN.loginpass(property.getProperty("Password"));
		HomePage.navigate_to_newMessage();
	}
	@Test(priority=1)
	public void to_mail()
	{
		Page_NewMessage.to_textbox(property.getProperty("to"));	
	}
	@Test(priority=2)
	public void subject_mail()
	{
		Page_NewMessage.subject(property.getProperty("subject"));
	}
	@Test(priority=3)
	public void body_mail()
	{
		Page_NewMessage.body(property.getProperty("Body"));
	}
	@Test(priority=4)
	public void send_Button_mail()
	{
		Page_NewMessage.SEND_button();
	}
	@AfterTest(alwaysRun=true)
	public void teardown1()
	{
		teardown();
	}
}
