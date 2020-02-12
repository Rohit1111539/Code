
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class FacebookLogin {
	
 
  WebDriver driver= new ChromeDriver();
  
	@BeforeMethod
		public void SetUp()
		{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32/chromedriver.exe");
		//  WebDriver driver= new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
		}
	@Test
	public void Facebook()
	{
		driver.findElement(By.xpath("//input [@id='email']")).sendKeys("kumar.arunakar@gmail.com");
		driver.findElement(By.xpath("//input [@id='pass']")).sendKeys("br22ac0102");
		driver.findElement(By.xpath("//input [@aria-label='Log In']")).click();
		driver.findElement(By.xpath("//div[@role='presentation']")).sendKeys("Hello World");
		driver.findElement(By.xpath("//button[@class='_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft']")).clear();
		driver.quit();
	}
	
	

	
	
}
