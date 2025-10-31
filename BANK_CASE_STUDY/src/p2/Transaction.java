package p2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private String accountHolderName;
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    // Constructor
    public Transaction(String accountHolderName, String type, double amount) {
        this.accountHolderName = accountHolderName;
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now(); // capture current time
    }

    // ✅ Single display method
    public void displayTransacctions() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("--------------------------------------");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Transaction Type : " + type);
        System.out.println("Amount : Rs. " + amount);
        System.out.println("Date & Time : " + dateTime.format(format));
        System.out.println("--------------------------------------");
    }
}
