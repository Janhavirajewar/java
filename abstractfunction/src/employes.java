
abstract class Staff {

    int sid;
    String sname;
    double baseSalary;

    void setSid(int a)
    { 
    	this.sid = a;
    }
    
    void setSname(String a) 
    { 
    	this.sname = a;
    }
    void setBaseSalary(double a) 
    { 
    	this.baseSalary = a; 
    }

    int getSid() { return this.sid; }
    String getSname() { return this.sname; }
    double getBaseSalary() { return this.baseSalary; }

    Staff() {
        System.out.println("Staff default");
        this.sid = 101;
        this.sname = "DefaultStaff";
        this.baseSalary = 30000;
    }

    Staff(int a, String b, double c) {
        System.out.println("Staff parameterized");
        this.sid = a;
        this.sname = b;
        this.baseSalary = c;
    }

    void show() {
        System.out.println("ID: " + this.sid + "\tName: " + this.sname + "\tSalary: " + this.baseSalary);
    }

    abstract double calcSalary(); 
} // Staff ends here


class Manager extends Staff {
    double allowance;

    Manager() {
        super();
        System.out.println("Manager default");
        this.allowance = 2000;
    }

    Manager(int sid, String sname, double baseSalary, double allowance) {
        super(sid, sname, baseSalary);
        System.out.println("Manager parameterized");
        this.allowance = allowance;
    }

    void show() {
        super.show();
        System.out.println("Allowance = " + this.allowance);
    }

    double calcSalary() {
        return baseSalary + allowance;
    }
} // Manager ends here

class Recruiter extends Staff {
    double commission;

    Recruiter() {
        super();
        System.out.println("Recruiter default");
        this.commission = 5000;
    }

    Recruiter(int sid, String sname, double baseSalary, double commission) {
        super(sid, sname, baseSalary);
        System.out.println("Recruiter parameterized");
        this.commission = commission;
    }

    void show() {
        super.show();
        System.out.println("Commission = " + this.commission);
    }

    double calcSalary() {
        return baseSalary + commission;
    }
} // Recruiter ends here

class SalesHead extends Staff {
    double target;
    double incentive;

    SalesHead() {
        super();
        System.out.println("SalesHead default");
        this.target = 1000;
        this.incentive = 500;
    }

    SalesHead(int sid, String sname, double baseSalary, double target, double incentive) {
        super(sid, sname, baseSalary);
        System.out.println("SalesHead parameterized");
        this.target = target;
        this.incentive = incentive;
    }

    void show() {
        super.show();
        System.out.println("Target = " + this.target);
        System.out.println("Incentive = " + this.incentive);
    }

    double calcSalary() {
        return baseSalary + incentive;
    }
} // SalesHead ends here

class TestStaff {
    public static void main(String[] args) {
        Staff s1;

//        s1 = new Staff(1, "Janhavi", 30000);
//        System.out.println(s1.calcSalary());

        s1 = new Manager(2, "Shruti", 50000, 4000);
        System.out.println(s1.calcSalary());

        s1 = new Recruiter(3, "Pallavi", 40000, 7000);
        System.out.println(s1.calcSalary());

        s1 = new SalesHead(4, "Eshan", 60000, 80000, 2000);
        System.out.println(s1.calcSalary());
    }
}
