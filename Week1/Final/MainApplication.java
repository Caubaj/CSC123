import java.util.Scanner;

public class MainApplication {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		int x = 0;
		Bank bank = new Bank();	
		
		while(x != -1)
		{	
			int y;
			System.out.println("1 - Open a Checking account");
			System.out.println("2 - Open Savings Account");
			System.out.println("3 - List Accounts");
			System.out.println("4 - View Account Balance and Status");
			System.out.println("5 - Deposit funds");
			System.out.println("6 - Withdraw funds");
			System.out.println("7 - Close an account");
			System.out.println("8 - Exit");
			y = scan.nextInt();
			while (y < 1 || y > 9)
			{
				System.out.println("1 - Open a Checking account");
				System.out.println("2 - Open Savings Account");
				System.out.println("3 - List Accounts");
				System.out.println("4 - View Account Balance and Status");
				System.out.println("5 - Deposit funds");
				System.out.println("6 - Withdraw funds");
				System.out.println("7 - Close an account");
				System.out.println("8 - Exit");
				y = scan.nextInt();	
			}
			if (y == 1)
			{
				bank.openCheckingAccount();
			}
			
			if (y == 2)
			{
				bank.openSavingsAccount();		
				
			}
			if (y == 3)
			{
				bank.viewAccounts();
				
			}
			if(y == 4)
			{
					System.out.println("Enter account number: ");
					int number = scan.nextInt();
					bank.viewBalanceStats(number);
					
			}
			if (y == 5)
			{
				try
				{
					System.out.println("Enter account number: ");
					int number = scan.nextInt();
					
					System.out.println("Enter the amount to deposit: ");
					int amount = scan.nextInt();
					bank.deposit(number, amount);	
				}
				catch(Exception e)
				{
					System.out.println("Error!! Acount does not Exist");
					System.out.println();	
				}
			}
			if (y == 6)
			{	
				try
				{
					System.out.println("Enter account number: ");
					int number = scan.nextInt();
				
					System.out.println("Enter the withdrawal amount: ");
					int amount = scan.nextInt();
					
					bank.withdraw(number, amount);
					
				}
				catch(Exception e)
				{
					System.out.println("Error!! Acount does not Exist");
					System.out.println();
				}		
			}
			
			if (y == 7)
				{
					System.out.println("Enter account number to close: ");
					int number = scan.nextInt();
					
					bank.closeAccount(number);
				}
			if(y == 8)
			{
				x = -1;	
			}
	}
}
}
