package TestCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.Baseclass;
import Pages.PAGE_LOGIN;

public class LoginTest extends Baseclass
{
	public LoginTest()
	{
		super();
	}

	@BeforeTest(alwaysRun=true)
	public void setUp()
	{
		initialize();
	}
	
	@Test(priority=1)
	public void IDDTest()
	{
		PAGE_LOGIN.loginid(property.getProperty("Username"));
	}
	
	@Test(priority=2)
	public void PATest()
	{
		PAGE_LOGIN.loginpass(property.getProperty("Password"));
	}
	
}
