package mar15th;

public class Bank {
	
	private double balance = 10000;
	
	//getters
	
	public void getBalance(int pin)
	{
		//validation
		if(pin==3214)
		{
			System.out.println("Balance is "+balance);
		}
		else
		{
			System.out.println("Invalid Pin Entered ...");
		}
	}
	
	//setters
	
	public void setBalance(double deposit)
	{
		balance=balance+deposit;
	}

}
