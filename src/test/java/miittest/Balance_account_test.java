package miittest;

import miit.Balance_account;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class Balance_account_test
{
  Balance_account account;
  @Before
  public void setup() 
  {
	account=new Balance_account("nishi",2000);  
  }
  @Test
  public void testdeposite() 
  {
	 account.deposite(-500);
	 assertEquals(1500,account.getbalance());
	 
	 
  }
  @Test
  public void testwithdraw() 
  {
	account.withdraw(200);
	assertEquals(1800,account.getbalance());
  }
  
  
}
