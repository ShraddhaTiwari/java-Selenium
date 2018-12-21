package testNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Title
{
	@Test
	void check_title()
	{
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		
		
		
		String actual_title = d.getTitle();
		
		String Excepeted_title = "doogle";
		
		Assert.assertEquals(Excepeted_title, actual_title );
        
		d.quit();
}
}