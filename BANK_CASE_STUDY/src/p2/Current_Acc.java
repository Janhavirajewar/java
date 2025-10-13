package p2;

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
	}

	double getOverdraftlimit() {
		return overdraftlimit;
	}

	void setOverdraftlimit(double overdraftlimit) {
		this.overdraftlimit = overdraftlimit;
	}

	@Override
	public void withdraw(double amount)
	{
		
		// TODO Auto-generated method stub
		        if (balance + overdraftlimit >= amount)
		        {
		            balance=balance-amount;
		            
		            System.out.println("₹" + amount + " withdrawn using overdraft.");
		            
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
	
