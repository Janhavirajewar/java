class Acc {
    int accno;
    double balance;
    String holder;
    String branch;

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

        void display() 
{
        System.out.println("Account No: " + this.accno);
        System.out.println("Holder: " + this.holder);
        System.out.println("Balance: " + this.balance);
        System.out.println("Branch: " + this.branch);
    }
}

class TestAcc {
    public static void main(String[] args) {
        Acc a1 = new Acc();  
        
        a1.setAccNo(123456789);
	System.out.println("Acc No: " + a1.getAccNo());
        a1.setHolder("Ramesh Kumar");
	System.out.println("Holder: " + a1.getHolder());
        a1.setBalance(25000.75);
	System.out.println("Balance: " + a1.getBalance());
        a1.setBranch("SBI MG Road Pune");
	System.out.println("Branch: " + a1.getBranch());


               a1.display();
    }
}
