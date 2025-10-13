package p1;

 public abstract class Account
{
	
	String acc_no;
	String holder_name;
	protected double balance;
	String ifsc;
	   public String[] transactions;
	    public int transCount;
	
	protected Account() {

		this.acc_no="0";
		this.holder_name="not f";
		this.balance=0;
		this.ifsc="0";

	}

	protected Account(String acc_no, String holder_name, double balance, String ifsc) {
		
		this.acc_no = acc_no;
		this.holder_name = holder_name;
		this.balance = balance;
		this.ifsc = ifsc;
		 this.transactions = new String[100];  // ✅ initialize here too
	        this.transCount = 0;     
	}

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
	
	// add
	public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("added");
		
	}
	
	// withdraw 
	 public abstract void withdraw(double amount);
    
	 

	        
    // Display details
    public void displayAccount()
    {
        System.out.println("\n----------------------------");
        System.out.println("Account Number: " + acc_no);
        System.out.println("Holder Name: " + holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("ifsc"+ifsc);
        System.out.println();
        
    }

	        
}

