
public class SavingAccount extends Bank {
	
	public void deposit(int accountNumber, double amount )
	{
		
		double preBalance = accounts.get(accountNumber); 
		
		double totalBalance = preBalance + amount;
		
		accounts.put(accountNumber, totalBalance);
	
		if(accountStat.get(accountNumber) == "Open")
		{
			System.out.println("Funds added succesfully: +$" + amount);
			System.out.println("New balance is: " + totalBalance);
			System.out.println();
		
		}
		else
		{
			System.out.println("Deposit fail, the balance is: " + preBalance);
			System.out.println();
		}
	}
	
	public void withdraw(int accountNumber, double amount)
	{
			double preBalance = accounts.get(accountNumber);
		
			double totalBalance = preBalance - amount;
		
			accounts.put(accountNumber, totalBalance);
			
		if(accountStat.get(accountNumber) == "Open" || totalBalance < 0)
		{
			System.out.println("Funds withdrawed succesfully: -$" + amount);
			System.out.println("New balance is: " + totalBalance);
			System.out.println();
		}
		else
		{
			System.out.println("Withdrawal failed, the balance is: " + preBalance);
			System.out.println();
		}
	}

}
