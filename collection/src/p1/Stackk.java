package p1;

import java.util.Stack;

// Superclass
class Emp11 {
    int id;
    String name;
    double salary;

    Emp11() {
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    Emp11(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Salary=" + salary;
    }
}

// Subclasses
class Admin1 extends Emp11 {
    double allowance;
    Admin1(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }
    @Override
    public String toString() {
        return super.toString() + ", Allowance=" + allowance;
    }
}

class HR1 extends Emp11 {
    double commission;
    HR1(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }
    @Override
    public String toString() {
        return super.toString() + ", Commission=" + commission;
    }
}

class SalesMng1 extends Emp11 {
    double target, incentive;
    SalesMng1(int id, String name, double salary, double target, double incentive) {
        super(id, name, salary);
        this.target = target;
        this.incentive = incentive;
    }
    @Override
    public String toString() {
        return super.toString() + ", Target=" + target + ", Incentive=" + incentive;
    }
}

// Main class
public class Stackk {
    public static void main(String[] args) {
        Stack<Emp11> stack = new Stack<>();

        stack.push(new SalesMng1(10, "Sakshi", 60000, 700, 8000));
        stack.push(new SalesMng1(20, "Rohit", 65000, 800, 9000));
        stack.push(new Admin1(30, "Prashant", 70000, 1000));
        stack.push(new HR1(40, "Janhavi", 50000, 400));

        System.out.println("Stack contents:");
        System.out.println(stack);

        System.out.println("\nPopped element:");
        System.out.println(stack.pop());

        System.out.println("\nRemaining stack:");
        System.out.println(stack);
    }
}
