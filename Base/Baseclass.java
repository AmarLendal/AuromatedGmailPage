package Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import Constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public static  WebDriver driver;
	public static WebDriverWait wait;
	public static  Properties property;
	By Gmail = By.xpath("//a[contains(text(),'Gmail')]");
	By Signin= By.xpath("//a[@data-action=\"sign in\"]");
	
	public Baseclass()
	{
		try 
		{
			property = new Properties();
			FileInputStream inputStream = new FileInputStream("C:/Users/Pavilian/eclipse-workspace/SeleniumFramework/src/test/java/Config/config.properties");
			property.load(inputStream);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}	 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
		
	public void initialize()
	{
		String Browsername = property.getProperty("Browser");
		System.out.println(Browsername);
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Path is not set for chrome driver : ");
		}
		driver.get("https:\\google.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(Gmail).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(Signin).click();
		
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	}
	public static void sendKeys(String str)
	{
		
		wait=new WebDriverWait(driver,Constant.EXPLICIT_WAIT);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(str)));
	}
		
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
	
}
