
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FacebookLogin {
	
 
         WebDriver driver= new ChromeDriver();
	 String Username="kumar.arunakar@gmail.com";
         String password="br22ac0102";
  
	@BeforeMethod
		public void SetUp()
		{
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32/chromedriver.exe");
	         driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	         driver.get("https://www.facebook.com/");
                 driver.manage().window().maximize();
			
		}
	@Test
	public void Facebook()
	{
		driver.findElement(By.xpath("//input [@id='email']")).sendKeys(Username);
		driver.findElement(By.xpath("//input [@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//input [@aria-label='Log In']")).click();
		driver.findElement(By.xpath("//div[@role='presentation']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).click();
	}
	
       @AfterMethod
	public void CloseWindow()
	{
		driver.quit();
		System.out.println("Window has been closed");
	}
	

}
