import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Constants.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{
	WebDriver driver;
	By id=By.xpath("//input[@id='identifierId']");
	By nxt1=By.xpath("//span[contains(text(),'Next')]");
	
	
	
	@BeforeTest
	public void intialization()
	{
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://google.com");
		
	}
	
	@Test(priority=1)
	public void GooglePage()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@data-action=\"sign in\"]")).click();
	}
	@Test(priority=2)
	public void login()
	{
		driver.findElement(id).sendKeys("amarlendal96@gmail.com");
		driver.findElement(nxt1).click();
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Amar@12345");
		driver.findElement(nxt1).click();
	}


	@Test(priority=3)
	public void Compose() 
	{  
		
		WebDriverWait wait=new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"T-I T-I-KE L3\"]"))).click();
		driver.findElement(By.xpath("//*[@class=\"T-I T-I-KE L3\"]")).click();
		
	}
	
	    
	
	@Test(priority=5)
	public void subject()
	{
		WebDriverWait wait=new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class=\"T-I T-I-KE L3\"]"))).click();
		try{Thread.sleep(3000);}catch(Exception e) {System.out.println("Exception");}
;		driver.findElement(By.id(":qp")).sendKeys("amarlendal130@gmail.com");
		driver.findElement(By.xpath("//span[text()=\"To\"]/following::div/input[@aria-label=\"Subject\"]")).sendKeys("Greetings");
	}
	@Test(priority=6)
	public void summary()
	{
	
		driver.findElement(By.xpath("//div[@id=\":fv\"]/div/table[@class=\"cf An\"]/tbody/tr/td[@class=\"Ap\"]/div[@id=\":dw\"]/div[@id=\":e0\"]")).sendKeys("Good Evening");
	}
	
	
	@Test()
	public void send()
	{
		
	driver.findElement(By.xpath("//div[@id=':pt']"));
	}
	
}














