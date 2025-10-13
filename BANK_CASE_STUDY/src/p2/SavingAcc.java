package p2;

import p1.Account;

public class SavingAcc extends Account {
    
  private double interestRate=0.5;
   private  double minBalance=10000;

    // Default constructor
    SavingAcc()
    {
       interestRate = 0;
        minBalance = 0;
    }

    // Parameterized constructor
    public SavingAcc(String acc_no, String holder_name, double balance, String ifsc, double interestRate, double minBalance) 
    {
        super(acc_no, holder_name, balance, ifsc);
        this.interestRate = interestRate;
       this.minBalance = minBalance;
    }

    // Getters and Setters
    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double getMinBalance() {
        return minBalance;
    }

    void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
    
    
    public void deposit(double amount)
    {
    	super.deposit(amount);
    	System.out.println("deposit successfully");
    	
    }
    


    // Withdraw method (override)
    
    @Override
    public void withdraw(double amount) {
        if (amount > 20000) 
        {
            System.out.println("Withdrawal limit exceeded! (Max ₹20000)");
            
        } 
        else if (balance - amount < minBalance) 
        {
            System.out.println("Cannot withdraw. Maintain minimum balance of ₹" + minBalance);
        } 
        else
        {
            balance =balance-amount;
            System.out.println("₹" + amount + " withdrawn successfully from Saving Account.");
            

        }
    }

    // Add interest method
    public void calculateInterest() 
    {
        double interest = balance * interestRate;
        balance =balance+interest;
        System.out.println("Interest of ₹" + interest + " added.");
    }

    // Display account details
    @Override
    public void displayAccount()
    {
        super.displayAccount();
        System.out.println("Interest Rate: " + (interestRate) + "%");
        System.out.println("Minimum Balance: " + minBalance);
    }
}
