class Acc {
    int accno;
    double balance;
    String holder;
   static double ir;   // each account has its own interest rate

    // ---------- Constructor ----------

    Acc(int a, double b, String h,double i) {
        this.accno = a;
        this.balance = b;
        this.holder = h;
	this.ir=i;
       
    }

    // ---------- Setters ----------

    void setAccNo(int a) {
        this.accno = a;
    }

    void setBalance(double b) {
        this.balance = b;
    }

    void setHolder(String h) {
        this.holder = h;
    }

   
    // ---------- Getters ----------

    int getAccNo() {
        return accno;
    }

    double getBalance() {
        return balance;
    }

    String getHolder() {
        return holder;
    }


    // ---------- Display ----------

    void display() {
        System.out.println("Account No : " + accno);
        System.out.println("Holder     : " + holder);
        System.out.println("Balance    : " + balance);
        System.out.println("Interest   : " + Acc.ir);
        System.out.println("--------------------------");
    }
}

class TestAcc {
    public static void main(String[] args) {
        // Create accounts
        Acc a1 = new Acc(101, 10000, "Palu",9.0);
        Acc a2 = new Acc(102, 20000, "Janhavi",9.1);
        Acc a3 = new Acc(103, 30000, "Neha",9.2);

        // Display initial details
        a1.display();
        a2.display();
        a3.display();
	
	
        // Update account details
        a1.setHolder("Ram");
        a1.setBalance(22000.75);
       	a1.set

        a2.setHolder("Kumar");
        a2.setBalance(25000.75);
        
        a3.setHolder("Ramesh");
        a3.setBalance(26000.75);
        

        // Display updated details
        a1.display();
        a2.display();
        a3.display();
    }
}
