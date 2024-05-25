package miit;

public class Calculator
{
	public  int add(int a, int b) 
	{ 
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	public  double div(int a, int b)
	{
		if (b==0) 
		{
			throw new IllegalArgumentException("cannot be diveded by zero");
		}
		return(double)a/b;
	}
	 
}
	  
	  
 
  
  
  
  

}