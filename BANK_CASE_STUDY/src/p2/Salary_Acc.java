package p2;
import java.time.LocalDate;

import p1.Account;
public class Salary_Acc extends Account{

	LocalDate last_transactiondate;
	
	
	 public Salary_Acc(String accNumber, String holderName, double balance,String ifsc) {
	        super(accNumber, holderName, balance,ifsc);
	        this.last_transactiondate = null;
	   
	    }

	 public void deposit(double amount)
	 {
		 super.deposit(amount);
		 last_transactiondate = LocalDate.now();
	 }
	 
	 @Override
	    public void withdraw(double amount) 
	 {
	        if (balance - amount < 0)
	        {
	            System.out.println("Cannot withdraw — Salary Account cannot go negative.");
	        } 
	        
	        else 
	        {
	            balance -= amount;
	            last_transactiondate= LocalDate.now();
	            System.out.println("₹" + amount + " withdrawn from Salary Account.");
	        }
	        
	    }
	 
	 public void displayAccount() {
	        super.displayAccount();
	        showLastTransactionDate();
	    }

	
	    public void showLastTransactionDate() {
	        if (last_transactiondate == null) {
	            System.out.println("No transactions yet.");
	        } else {
	            System.out.println("Last Transaction Date: " + last_transactiondate);
	        }
	    
		
	}
	


}
