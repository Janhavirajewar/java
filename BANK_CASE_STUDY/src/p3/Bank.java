package p3;

import p1.Account;

public class Bank {

    Account[] accounts;
    int count;

    // Constructor
    public Bank() {
        accounts = new Account[100];
        count = 0;
        // example — can call this if you want to preload
    }

  

	// ✅ Add account
    public void addAccount(Account acc) 
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
    public void displayAll() {
        System.out.println("\n--- All Accounts ---");
        for (int i = 0; i < count; i++) {
            accounts[i].displayAccount();
        }
    }

    // ✅ Search by account number
    public Account searchByAccNo(String accNo) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getAcc_no().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    // ✅ Search by holder name
    public Account searchByName(String name) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].getHolder_name().equalsIgnoreCase(name)) {
                return accounts[i];
            }
        }
        return null;
    }

    // ✅ Deposit
    public void deposit(String accNo, double amount) {
        Account acc = searchByAccNo(accNo);
        if (acc != null) {
            acc.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    // ✅ Withdraw
    public void withdraw(String accNo, double amount) {
        Account acc = searchByAccNo(accNo);
        if (acc != null) {
            acc.withdraw(amount);
        }
        else {
            System.out.println("Account not found!");
        }
    }

    // ✅ Update Account Balance (for example)
    public void updateAccount(String accNo, double newBalance)
    {
        Account acc = searchByAccNo(accNo);
        if (acc != null)
        {
            acc.setBalance(newBalance);
            System.out.println("Account balance updated successfully.");
        } else 
        {
            System.out.println("Account not found!");
        }
    
    
    }
}
