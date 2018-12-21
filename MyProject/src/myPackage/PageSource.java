package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageSource
{
	@Test
	void verify_title()
	{
		WebDriver d = new FirefoxDriver();
		
		d.get("https://www.google.co.in/");
		
		String title = d.getPageSource();
		
		Assert.assertTrue(title.contains("Google"));
		
		System.out.println("Page Verified");
		
		d.quit();
		
	}

}
