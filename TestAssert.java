package assertDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAssert
{
@Test
void test1()
{
  Assert.assertEquals(15, 12);	
}
@Test	
void test2()
{
  Assert.assertEquals(14, 12, "DropdownCount not matched");	
}
@Test	
void test3()
{
  Assert.assertEquals(12, 12, "DropdownCount not matched");	
}	
  
}
