import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public abstract class BankAccount {
	
	private double  balance ;
	private double interestRate;
	private long accountNumber;
	private double futureValue;
	private Date date;
	private int term;
	List<Transaction> transactions;
	
	
	
	
	 BankAccount(double balance, double interestRate){
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	 BankAccount(long accountNumber, double balance, double interestRate){
		 this.accountNumber = accountNumber;
		 this.balance = balance;
		 this.interestRate = interestRate;
	 }
	BankAccount(long accountNumber, double balance, double interestRate, Date date){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.date= date;
	}
	

	public long getAccountNumber() 
	{
		return this.accountNumber;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	public double getInterestRate() 
	{
		return this.interestRate;
	}
	
	public boolean withdraw(double amount)
	{
		if((this.balance - amount) >= 0) 
		{
			this.balance = this.balance - amount;
			return true;
		} else
			{
			
			return false;
			}	
	}
	
	public boolean deposit(double amount) 
	{
		if( amount > 0)
		{
			this.balance = this.balance + amount;
			return true;
		} else 
			return false;	
	}
	
	
	public double futureValue(int term) 
	{
		double iR = (interestRate + 1);
		for (int i = 0; (i < term - 1); i++) {
			iR = iR * (interestRate + 1 );
		}
		this.futureValue  = balance * iR;
		return this.futureValue;
	}

	
	public  Date dateAccountOpened(String string)
	{
			try 
			{
				DateFormat startDate = new SimpleDateFormat("dd/MM/yyyy"); 
				Date date = (Date)startDate.parse(string);
	        	this.date = date;
	        	return this.date;		
			} catch(ParseException e)
			{
				
			}
			return this.date;
	}
	
	public  Date getOpenedOn()
	{
		return this.date;
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
		
	}
	
	public List<Transaction> getTransactions(){
		return transactions;
	}
	
	public static BankAccount readFromString()
	{
		return null;
	}
	
	public String writeToString()
	{
		return"";
	}
	public String toString() 
	{
		return "";
	}
}