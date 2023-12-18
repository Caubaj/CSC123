import java.util.ArrayList;

public class Account 
{
	private String type;
	private String limitOD;
	private String FIRSTNAME;
	private String LASTNAME;
	private String SSN;
	private String day;
	private String month;
	private String year;
	private String counter;
	private String Status;
	
	public Account()
	{
		
	}		
	public Account(String first, String Last, String ssn, 
			String MONTH, String DAY, String YEAR,String Limit, String COUNT, String Type) 
	{
		FIRSTNAME = first;
		LASTNAME = Last;
		SSN = ssn;
		month = MONTH;
		day = DAY;
		year = YEAR;
		counter = COUNT;
		type = Type;
		limitOD = Limit;
	}
	
	public Account(String first, String Last, String ssn, 
			String MONTH, String DAY, String YEAR, String COUNT, String Type) 
	{
		FIRSTNAME = first;
		LASTNAME = Last;
		SSN = ssn;
		month = MONTH;
		day = DAY;
		year = YEAR;
		counter = COUNT;
		type = Type;
	}
	public String toString()
	{
		return "Account Number: " + counter + " (" + type + ") : " + FIRSTNAME + " : " + LASTNAME + " : SSN (" + SSN + ")" ;
	}
}
