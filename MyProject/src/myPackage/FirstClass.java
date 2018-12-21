package testNG;

import org.testng.annotations.Test;


public class FirstClass
{
	@Test (priority=1, description="This case check login")
	public void login()
	{
		System.out.println("log in successful");
		
	}
	@Test (priority=3, description="This case in process")
	public void process()
	{
		System.out.println("In Process");
		
	}
	@Test (priority=2, description="This case check logout")
	public void logout()
	{
		System.out.println("log out successful");		
	}
}
