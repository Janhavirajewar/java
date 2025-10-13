package p2;

import p1.Account;

public class Loan_Acc extends Account {

    private double loanAmount;      // Total loan approved
    private double paidAmount;      // Total amount paid

    private boolean isApproved;     // Loan approval status
    private int paymentsCount;      // Number of payments made

    public  double interestRate; // Static interest rate for all loans

    // Constructor
    public Loan_Acc(String acc_no, String holder_name, double balance, String ifsc,double loanamt,double loanrate) {
        super(acc_no, holder_name, balance, ifsc);
        this.loanAmount = loanamt;  // set loan amount
        this.interestRate = loanrate; // set interest rate
        this.isApproved = true;
        this.paymentsCount = 0;
    }

    
    
    double getLoanAmount() {
		return loanAmount;
	}



	void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}



	double getPaidAmount() {
		return paidAmount;
	}



	void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}



	int getPaymentsCount() {
		return paymentsCount;
	}



	void setPaymentsCount(int paymentsCount) {
		this.paymentsCount = paymentsCount;
	}



	// Withdrawals not allowed
    @Override
    
    public void withdraw(double amount) {
        System.out.println("Cannot withdraw from loan account.");
    }

    // ------------------ Bank approves loan ------------------
    
    public boolean approveLoan(double requestedLoan, double interestRate)
    {
        double maxLoanLimit = 50000;
        double minBalanceRequired = 10000;

        if (balance < minBalanceRequired) {
            System.out.println("Loan cannot be approved. Maintain minimum balance of ₹" + minBalanceRequired);
            return false;
        }

        else if (requestedLoan > maxLoanLimit) {
            System.out.println("Loan cannot be approved. Requested amount exceeds max limit of ₹" + maxLoanLimit);
            return false;
        }

        else 
        {
        	loanAmount =requestedLoan;
	        this.interestRate = interestRate;   // Bank sets interest rate
	        isApproved = true;
	      
        System.out.println("Loan of ₹" + requestedLoan + " approved at " + (interestRate * 100) + "% interest. Total loan: ₹" + loanAmount);
        return true;
        

        }

    }

    // ------------------ Pay loan ------------------
    
    
    public void payLoan(double amount)
    
    {
        if (!isApproved) {
            System.out.println("Loan is not approved yet. Cannot pay.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance to pay loan!");
            return;
        }

        if (amount > loanAmount) {
            System.out.println("Payment exceeds remaining loan amount! Remaining loan: ₹" + loanAmount);
            return;
        }

        balance =balance- amount;
        loanAmount -= amount;
        paidAmount += amount;
        paymentsCount++;
      
        System.out.println("Loan repayment of ₹" + amount + " done. Remaining loan: ₹" + loanAmount);
    }

    // ------------------ Show remaining loan ------------------
    public void showRemainingLoan() {
        if (!isApproved) {
            System.out.println("Loan is not approved yet.");
            return;
        }
        System.out.println("Remaining Loan: ₹" + loanAmount);
    }

    // ------------------ Show paid amount ------------------
    public void showPaidLoan() {
        if (!isApproved) {
            System.out.println("Loan is not approved yet.");
            return;
        }
        System.out.println("Total Paid Loan: ₹" + paidAmount);
    }

    // ------------------ Show interest on remaining loan ------------------
    public void showInterest()
    {
        if (!isApproved) {
            System.out.println("Loan is not approved yet.");
            return;
        }
        double interest = loanAmount * interestRate;
        System.out.println("Interest on remaining loan: ₹" + interest);
    }

    // ------------------ Show number of payments ------------------
    public void showPaymentsCount() {
        System.out.println("Number of payments made: " + paymentsCount);
    }

    // ------------------ Display account details ------------------
    @Override
    public void displayAccount()
    {
        super.displayAccount();
        System.out.println("---- Loan Account Details ----");
        if (isApproved) 
        {
            System.out.println("Remaining Loan Amount: ₹" + loanAmount);
            System.out.println("Total Paid Loan: ₹" + paidAmount);
            System.out.println("Interest Rate: " + (interestRate));
            System.out.println("Payments Made: " + paymentsCount);
        } 
        
        else
        {
            System.out.println("Loan is not approved yet.");
        }
    }
}
