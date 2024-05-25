package miittest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import miit.Calculator;

public class Calculator_test
{

  @Test
  public void testadd() 
  {
	  Calculator calculator=new Calculator();
	 assertEquals(5,calculator.add(2,3));  
  }
  @Test
  public void testsub()
  {
	  Calculator calculator=new Calculator();
	 assertEquals(8,calculator.sub(10,8));
  }
  @Test
  public void testmul()
  {
	  Calculator calculator=new Calculator();
	  assertEquals(48,calculator.mul(6,8));
  }
@Test
  public void testdiv()
{
	 Calculator calculator=new Calculator();
   assertEquals(2,calculator.div(4,2),0.0001);	  
  }
  @Test(expected=IllegalArgumentException.class)
  public void testdivbyzero() {
	  Calculator calculator=new Calculator();
	  calculator.div(3,0);
  }
  
}
	

 

