package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Base.Baseclass;
import Constants.Constant;

public class HomePage extends Baseclass
{ 
	static By ComposeButton=By.xpath("//*[@class=\"T-I T-I-KE L3\"]");
	
	public static void navigate_to_newMessage()
	{
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.findElement(ComposeButton).click();
	}
	
}
