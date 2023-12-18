import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Bank {
	
	
	Account account = new Account();
	
	double Balance = 0;
	
	private Scanner scan = new Scanner(System.in);

	private String type;
	private String limitOD;
	private String FIRSTNAME;
	private String LASTNAME;
	private String SSN;
	private String day;
	private String month;
	private String year;
	private String Status;
	
	int counter = 1000;
	
	TreeMap <Object, Double> accounts = new TreeMap <Object, Double>();
	
	TreeMap <Object, String> accountStat = new TreeMap <Object, String>();
	
	
	ArrayList<String> allUser = new ArrayList<String>();
	
	String items;
	
		
	public void openCheckingAccount()
	{	
		System.out.println("Enter first name: ");
		FIRSTNAME = scan.nextLine();
	
		System.out.println("Enter last name: ");
		LASTNAME = scan.nextLine();
	
		System.out.println("Enter social security number\n Example: (999-99-9999)");
		SSN = scan.nextLine();
		
		System.out.println("Enter date of birth: (MM/DD/YYYY");	
		System.out.println("Enter Month: ");
		month = scan.nextLine();

		System.out.println("Enter Day: ");
		day = scan.nextLine();
		
		System.out.println("Enter Year: ");
		year = scan.nextLine();
		
		type = "Checkings";
		
		Status = "Open";
		
		String b = Integer.toString(counter);
		
		int yea = Integer.parseInt(year);
		
		if(yea >= 2005 && yea < 2007)
		{
			Account account = new Account(FIRSTNAME, LASTNAME, SSN, month, day, year, limitOD, b, type);
			
			allUser.add(account.toString());
			
			System.out.println("Thank you your account number is: " + counter);
			System.out.println();
			
			accountStat.put(counter, Status);
			
			accounts.put(counter, Balance);
			
			counter++;		
		}
		if (yea < 2005)
		{
			System.out.println("Enter overdraft limit: ");
			limitOD = scan.nextLine();
		
			Account account = new Account(FIRSTNAME, LASTNAME, SSN, month, day, year, limitOD, b, type);
			
			allUser.add(account.toString());
			
			System.out.println("Thank you your account number is: " + counter);
			System.out.println();
			
			accountStat.put(counter, Status);
			
			accounts.put(counter, Balance);
			counter++;
		}
		else
		{
			System.out.println("You are too young for a Checkings Account");
			System.out.println();
		}
	}
	
	
	public void openSavingsAccount()
	{	
		System.out.println("Enter first name: ");
		FIRSTNAME = scan.nextLine();
	
		System.out.println("Enter last name: ");
		LASTNAME = scan.nextLine();
	
		System.out.println("Enter social security number\n Example: (999-99-9999)");
		SSN = scan.nextLine();
		
		System.out.println("Enter date of birth: (MM/DD/YYYY");	
		System.out.println("Enter Month: ");
		month = scan.nextLine();

		System.out.println("Enter Day: ");
		day = scan.nextLine();
		
		System.out.println("Enter Year: ");
		year = scan.nextLine();
		
		type = "Savings";
		
		Status = "Open";
		
		String b = Integer.toString(counter);
		
		int yea = Integer.parseInt(year);
		
		if(yea < 2019)
		{
			Account account = new Account(FIRSTNAME, LASTNAME, SSN, month, day, year, b, type);
			
			allUser.add(account.toString());
			
			System.out.println("Thank you your account number is: " + counter);
			
			accountStat.put(counter, Status);
			
			accounts.put(counter, Balance);
			
			counter++;	
		}
		else
		{
			System.out.println("Your are too young to have an account.");
			System.out.println();
		}
	}
	
	
	public void viewAccounts()
	{
		for (int y = 0; y < allUser.size(); y++)
		{
		
			System.out.println(allUser.get(y));
			System.out.println();
		}	
	}
	
	public void viewBalanceStats(int accountNumber)
	{
		System.out.println("Your Account Balance: $" + accounts.get(accountNumber) );
		System.out.println("Your Account Status: " + accountStat.get(accountNumber));
		System.out.println();
		
	}
	
	public void deposit(int accountNumber, double amount )
	{
		
		double preBalance = accounts.get(accountNumber); 
		
		double totalBalance = preBalance + amount;
		
		accounts.put(accountNumber, totalBalance);
	
		if(accountStat.get(accountNumber) == "Open")
		{
			System.out.println("Funds added succesfully: +$" + amount);
			System.out.println("New balance is: $" + totalBalance);
			System.out.println();
		
		}
		else
		{
			System.out.println("Deposit fail, the balance is: $" + preBalance);
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
			System.out.println("New balance is: $" + totalBalance);
			System.out.println();
		}
		else
		{
			System.out.println("Withdrawal failed, the balance is: $" + preBalance);
			System.out.println();
		}
	}
	
	public void closeAccount(int number)
	{
		String newStat = "Close";
		
		accountStat.put(number, newStat);
			
	}
	
}
