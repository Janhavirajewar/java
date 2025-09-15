class Acc {
    int accno;
    double balance;
    String holder;
    String branch;

    // ✅ Default constructor
    Acc() {
        this.accno = 0;
        this.balance = 0.0;
        this.holder = "Unknown";
        this.branch = "Not Assigned";
    }

    // ✅ Parameterized constructor
    Acc(int accno, double balance, String holder, String branch) {
        this.accno = accno;
        this.balance = balance;
        this.holder = holder;
        this.branch = branch;
    }

    void setAccNo(int a) {
        this.accno = a;
    }

    void setBalance(double b) {
        this.balance = b;
    }

    void setHolder(String h) {
        this.holder = h;
    }

    void setBranch(String br) {
        this.branch = br;
    }

    int getAccNo() {
        return this.accno;
    }

    double getBalance() {
        return this.balance;
    }

    String getHolder() {
        return this.holder;
    }

    String getBranch() {
        return this.branch;
    }

    void display() {
        System.out.println("Account No: " + this.accno);
        System.out.println("Holder: " + this.holder);
        System.out.println("Balance: " + this.balance);
        System.out.println("Branch: " + this.branch);
    }
}

class TestAcc {
    public static void main(String[] args) {
       
        Acc a1 = new Acc();
        System.out.println("----- Default Constructor -----");
        a1.display();


        Acc a2 = new Acc(123456789, 25000.75, "Ramesh Kumar", "SBI MG Road Pune");
        System.out.println("\n----- Parameterized Constructor -----");
        a2.display();
    }
}
