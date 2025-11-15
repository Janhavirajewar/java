package p2;

import java.time.LocalDate;

import p1.Account;

public class Current_Acc extends Account {

	double overdraftlimit;

	Current_Acc() {
		super();
		this.overdraftlimit=0;
	}

	public Current_Acc(String acc_no, String holder_name, double balance, String ifsc,double overdraftlimit)
	{
		 super(acc_no, holder_name, balance, ifsc);
		this.overdraftlimit = overdraftlimit;
		 addTransaction(new Transaction(holder_name, "Current Account", balance));
	}

	double getOverdraftlimit() {
		return overdraftlimit;
	}

	void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}

	public void deposit(double amount)
	{
		 super.deposit(amount);
		 addTransaction(new Transaction(acc_no, "Deposit", amount));
		
		
	}
	
	@Override
	public void withdraw(double amount)
	{
		
		// TODO Auto-generated method stub
		        if (balance + overdraftlimit >= amount)
		        {
		            balance=balance-amount;
		            addTransaction(new Transaction(holder_name, "Withdraw (Current)", amount));
		            System.out.println(" withdrawn using overdraft. :"+ amount);
		            
		        } else {
		            System.out.println("Overdraft limit exceeded!");
		            
		        }
		    }
	
	public void displayAccount()
	{
		super.displayAccount();
		System.out.println("overdraftlimit :" +this.overdraftlimit);
		
	}
	
}
	
