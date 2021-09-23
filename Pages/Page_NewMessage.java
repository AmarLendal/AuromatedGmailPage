package Pages;

import org.openqa.selenium.By;
import org.testng.ReporterConfig.Property;

import Base.Baseclass;

public class Page_NewMessage extends Baseclass
{
	
		static By to_id=By.xpath("//textarea[@id=':qo']");
		static By to_sub=By.xpath("/html[1]/body[1]/div[19]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[2]");
		static By to_body=By.xpath("/html[1]/body[1]/div[19]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]");
		
		static By Button_send=By.xpath("//div[@id=':pw']");
		
		public static void to_textbox(String str)
		{
			Baseclass.sendKeys("//textarea[@id=':qo']");
			driver.findElement(to_id).sendKeys(str);
		}
		
		public static void subject(String str)
		{
			Baseclass.sendKeys("/html[1]/body[1]/div[19]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[2]");
			driver.findElement(to_sub).sendKeys(str);
		}
		
		public static void body(String str)
		{
			Baseclass.sendKeys("/html[1]/body[1]/div[19]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]");
			driver.findElement(to_body).sendKeys(str);
		}
		
		public static void SEND_button()
		{
			Baseclass.sendKeys("//div[@id=':pw']");
			driver.findElement(Button_send).click();
		}
}
