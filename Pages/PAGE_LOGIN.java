package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.Baseclass;
import Constants.Constant;

public class PAGE_LOGIN extends Baseclass
{
	static By id=By.xpath("//input[@id='identifierId']");
	static By nxt1=By.xpath("//span[contains(text(),'Next')]");
	
	static By pass1=By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	static By loginButton=By.xpath("//span[contains(text(),'Next')]");
	
	
	public static void loginid(String usrname)
	{
		driver.findElement(id).sendKeys(usrname);
		driver.findElement(nxt1).click();
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	public static void loginpass(String passs) 
	{
		// TODO Auto-generated method stub
		driver.findElement(pass1).sendKeys(passs);
		driver.findElement(loginButton).click();
		
	}
	
}
