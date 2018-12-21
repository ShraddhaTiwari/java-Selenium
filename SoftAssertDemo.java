package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
@Test	
void soft()
{
	SoftAssert a = new SoftAssert();
	System.out.println("Test Started");
	a.assertEquals(14, 12);
	System.out.println("Test completed");
	a.assertAll();
	
}

@Test
void hard()
{
	System.out.println("Test Started");
    Assert.assertEquals(14, 12);
    System.out.println("Test completed");
}
	

}
