package p3;

import p1.Account;
import p2.Current_Acc;
import p2.Loan_Acc;
import p2.Salary_Acc;
import p2.SavingAcc;

public class Bank {

    static Account[] accounts;
    static int count;

    static {
    	
    	accounts = new Account[100];
        count = 0;
        // example — can call this if you want to preload
        System.out.println("🏦 Loading existing bank accounts...\n");

        // ---------- 3 Saving Accounts ----------
        accounts[count++]=(new SavingAcc("101", "Rohit Sharma", 8000, "IFSC100", 4.5, 1000));
        accounts[count++]=(new SavingAcc("102", "Virat Kohli", 10000, "IFSC100", 4.5, 1000));
        accounts[count++]=(new SavingAcc("103", "Shubman Gill", 6000, "IFSC100", 4.5, 1000));

        // ---------- 3 Current Accounts ----------
        accounts[count++]=(new Current_Acc("201", "Tata Industries", 25000, "IFSC200", 10000));
        accounts[count++]=(new Current_Acc("202", "Reliance Ltd", 40000, "IFSC200", 15000));
        accounts[count++]=(new Current_Acc("203", "Infosys Pvt", 35000, "IFSC200", 12000));

        // ---------- 3 Salary Accounts ----------
        accounts[count++]=(new Salary_Acc("301", "Amit Kumar", 15000, "IFSC300"));
        accounts[count++]=(new Salary_Acc("302", "Neha Sharma", 18000, "IFSC300"));
        accounts[count++]=(new Salary_Acc("303", "Karan Patel", 22000, "IFSC300"));

        // ---------- 3 Loan Accounts ----------
        accounts[count++]=(new Loan_Acc("401", "Rajesh Verma", 0, "IFSC400", 50000, 8.5));
        accounts[count++]=(new Loan_Acc("402", "Priya Nair", 0, "IFSC400", 75000, 9.0));
        accounts[count++]=(new Loan_Acc("403", "Anil Mehta", 0, "IFSC400", 100000, 8.0));

        System.out.println("✅ 12 existing accounts loaded successfully!\n");
    }
    

	// ✅ Add account
    public void add(Account acc) 
    {
        if (count < accounts.length) 
        {
            accounts[count] = acc;
            count++;
            System.out.println("Account added successfully for " + acc.getHolder_name());
        } else {
            System.out.println("Cannot add more accounts. Storage full!");
        }
    }

    // ✅ Display all accounts
    public void displayAll()
    {
    	if(count==0)
    	{
    		System.out.println(" \n no account is add pls add an account");
    	}
        System.out.println("\n--- All Accounts ---");
        for (int i = 0; i < count; i++) {
            accounts[i].displayAccount();
        }
    }

    // ✅ Search by account number
    public Account searchByAccNo(String accNo)
    {
        for (int i = 0; i < count; i++) 
        {
            if (accounts[i].getAcc_no().equals(accNo)) 
            {
                return accounts[i];
            }
        }
        return null;
    }

//    // ✅ Search by holder name
//    public Account searchByName(String name) {
//        for (int i = 0; i < count; i++) {
//            if (accounts[i].getHolder_name().equalsIgnoreCase(name)) {
//                return accounts[i];
//            }
//        }
//        return null;
//    }

    // ✅ Deposit  
    public void deposit(String accNo , double amount) {
        Account acc = searchByAccNo(accNo);
        
        if (acc != null)
        {
            acc.deposit(amount);
            System.out.println("\nTotalAmount : " +(acc.getBalance()));
           // System.out.println(acc.getBalance());
        } 
        
        else 
        {
            System.out.println("Account not found!");
        }
    }

    // ✅ Withdraw
    public void withdraw(String accNo, double amount) {
        Account acc = searchByAccNo(accNo);
        if (acc != null) {
            acc.withdraw(amount);
            System.out.println("\nTotalAmount : " + (acc.getBalance()-amount));

        }
        else {
            System.out.println("Account not found!");
        }
    }

    // ✅ Update Account Balance (for example)
    public void updateAccount(String accNo, double newBalance)
    {
    	System.out.println("Account Found");
        Account acc = searchByAccNo(accNo);
        if (acc != null)
        {
        	
            acc.setBalance(newBalance);
            System.out.println("Account balance updated successfully.");
        } 
        else 
        {
            System.out.println("Account not found!");
        }
    
    
    }
    
    public void generateDailyReport() {
        if (count == 0) {
            System.out.println("No accounts to report.");
            return;
        }

        System.out.println("\n===== DAILY REPORT =====");
        for (int i = 0; i < count; i++) {
            accounts[i].displayAccount();
            accounts[i].displayAllTransactions();
            System.out.println();
        }
    }
    public void remove(String closeNo) {
        boolean found = false;

        // loop through all accounts
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAcc_no().equalsIgnoreCase(closeNo)) {
                // shift elements left to fill gap
                for (int j = i; j < count - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }

                // set last element to null
                accounts[count - 1] = null;

                // decrease count
                count--;

                System.out.println("✅ Account " + closeNo + " removed successfully.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Account " + closeNo + " not found.");
        }
    }

    
}













