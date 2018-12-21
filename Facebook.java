package mozilaPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook
{
	FirefoxDriver d = new FirefoxDriver();
	@Test
	void fb()
	{
		
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
	}
	
	@Test
	void firstname()
	{
		
		d.findElementByXPath("//input[@name='firstname']").sendKeys("Shraddha");
		
	}
	
	@Test
	void lastname()
	{
		d.findElementByName("lastname").sendKeys("Tiwari");
	}
	
	@Test
	void mobileno()
	{
		
		d.findElementByXPath("//input[@name='reg_email__']").sendKeys("9790704370");
		
	}
	
	@Test
	void password()
	{
		d.findElementByName("reg_passwd__").sendKeys("123456789");
	}
	
	@Test
		void day()
		{
		WebElement day = d.findElementByName("birthday_day");
		
		Select dayname = new Select(day);
		
		dayname.selectByVisibleText("5");
		}
	@Test
	void month()
	{
		
       WebElement month = d.findElementById("month");
		
		Select monthname = new Select(month);
		
		monthname.selectByVisibleText("Mar");
	}
	@Test
	void year()
	{
		
		WebElement year = d.findElementById("year");
			
			Select yearname = new Select(year);
			
			yearname.selectByVisibleText("1991");
			
	}
		
	//@Test
	//void close()
	//{
		//d.quit();
	//}
	}
	
	

