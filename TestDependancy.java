package assertDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestDependancy
{
WebDriver d;	
@Test
void Start()
{   
	System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Drivers\\chromedriver.exe");
    d= new ChromeDriver();
    d.get("https://opensource-demo.orangehrmlive.com/");
        
}
@Test
void login()
{
     	System.out.println("Successfully login");
}
	
}
