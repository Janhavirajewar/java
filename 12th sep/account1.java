class Acc {
    int accno;
    double balance;
    String holder;
   static double ir;   // each account has its own interest rate
static
{
	ir=8.9;
}


    // ---------- Constructor ----------

    Acc(int a, double b, String h) {
        this.accno = a;
        this.balance = b;
        this.holder = h;       
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
   
    static void setintrest(double d) // static function
    {
	ir=d;
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
	
   static double getintrest()
   {
	return ir;
   }


    // ---------- Display ----------

    void display() {
        System.out.println("Account No : " + accno);
	 System.out.println("Balance    : " + balance);
        System.out.println("Holder     : " + holder);
        System.out.println("Interest   : " +this.ir);
        System.out.println("--------------------------");
    }
}

class TestAcc {
    public static void main(String[] args) {
        // Create accounts
        Acc a1 = new Acc(101, 10000, "Palu");
        Acc a2 = new Acc(102, 20000, "Janhavi");
        Acc a3 = new Acc(103, 30000, "Neha");

        // Display initial details
        a1.display();
        a2.display();
        a3.display();
	System.out.println("intrest"+Acc.getintrest());
	

	a1.setintrest(4.44); // also call with class name
			
	System.out.println("intrest"+Acc.getintrest());

        // Update account details
        a1.setHolder("Ram");
        a1.setBalance(22000.75);
       	

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
