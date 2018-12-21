package assertDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest 
{
@Test
void testsoft()
{
   SoftAssert a = new SoftAssert();
   System.out.println("Test Started");
   a.assertTrue(false);
   System.out.println("Test Completed");
   a.assertAll();
	
	
}

}
