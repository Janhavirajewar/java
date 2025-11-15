package p1;

import p2.Transaction;

public abstract class Account {

    protected String acc_no;
    protected String holder_name;
    protected double balance;
    String ifsc;
    public int transCount;
    private Transaction[] transactions;

    // Default constructor
    protected Account() {
        this.acc_no = "0";
        this.holder_name = "Not Found";
        this.balance = 0;
        this.ifsc = "0";
        this.transCount = 0;
        this.transactions = new Transaction[100];
    }

    // Parameterized constructor
    protected Account(String acc_no, String holder_name, double balance, String ifsc) {
        this.acc_no = acc_no;
        this.holder_name = holder_name;
        this.balance = balance;
        this.ifsc = ifsc;
        this.transCount = 0;
        this.transactions = new Transaction[100];
    }

    // Getters and Setters
    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    // Deposit
    public void deposit(double amount) {
        this.balance += amount;
        addTransaction(new Transaction(acc_no, "Deposit", amount));
       // System.out.println("Deposited: " + amount);
    }

    // Abstract withdraw method (must be implemented by subclasses)
    public abstract void withdraw(double amount);

    // Add transaction
    public void addTransaction(Transaction t) {
        if (transCount < transactions.length)
        {
            transactions[transCount++] = t;
        }
    }

    // Display account details
    public void displayAccount() {
        System.out.println("\n----------------------------");
        System.out.println("Account Number: " + acc_no);
        System.out.println("Holder Name   : " + holder_name);
        System.out.println("Balance       : " + balance);
        System.out.println("IFSC Code     : " + ifsc);
        System.out.println("----------------------------");
    }

    // Display all transactions
    public void displayAllTransactions() {
        System.out.println("\n---- Transactions for Account " + acc_no + " ----");
        if (transCount == 0) {
            System.out.println("No transactions yet.");
            return;	
        }
        
        else
        {	
	        for (int i = 0; i < transCount; i++) {
	            transactions[i].displayTransacctions();
	        }
        }
    }
}
