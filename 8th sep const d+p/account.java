class Acc {
    int accno;
    double balance;
    String holder;
    double ir;

       void setAccNo(int a) {
        this.accno = a;
    }

    void setBalance(double b) {
        this.balance = b;
    }

    void setHolder(String h) {
        this.holder = h;
    }

    void setintrestrate(double br) {
        this.ir= br;
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

    double getintrestrate() {
        return this.ir;
    }

	Acc()
	{
		this.accno=12121212;
		this.balance=300000;
		this.holder="janhavi";
		this.ir=8.1;
	}

	Acc(int a, double b,String c,double d)
	{
		this.accno=a;
		this.balance=b;
		this.holder=c;
		this.ir=d;
	}


        void display() 
{
        System.out.println("Account No: " + this.accno);
        System.out.println("Holder: " + this.holder);
        System.out.println("Balance: " + this.balance);
        System.out.println("intrestr: " + this.ir);
    }
}

class TestAcc {
    public static void main(String[] args) {
      Acc a1 = new Acc(111111111, 1000000, "neha", 9.0);
 
          a1.display();

        a1.setAccNo(123456789);
	
        a1.setHolder("Ramesh Kumar");
	
        a1.setBalance(25000.75);
	
        a1.setintrestrate(9.3);
	
        a1.display();
    }
}
