package p2;

import java.util.Date;

public class Transaction {
    int id;
    String name;
    String type;     // Deposit / Withdraw / Interest / Loan Payment etc.
    Date date;
    double amount;

    Transaction(int id, String name, String type, double amount) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.date = new Date(); // current date & time
    }

    public void display() {
        System.out.println(id + " ID " + name + " Name " + type + " Name " + date + " Date " + amount+ "Amount");
    }
}
