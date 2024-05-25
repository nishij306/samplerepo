package miit;

	public class Balance_account 
	{
	   String owner;
	   int balance;
	   
	   public Balance_account(String ownername,int accountbalance) 
	   {
		owner=ownername;
		balance=accountbalance;
	   }
	   public void deposite(int amount) 
	   {
		balance=balance+amount;
	   }
	   public boolean withdraw(int amount)
	   {
		  if (amount<=balance) 
		  {
			  balance=balance-amount;
			  return true;
		  }
		  else 
		  {
			System.out.println("insufficient fund");
			return false;
		  }
	   }

	    public int getbalance()
	       {
	    	return balance;
	    	}
	}






