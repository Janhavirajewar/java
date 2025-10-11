
// oldest data should be process first

package p1;

import java.util.*;

//---- Superclass ----
class emp1 {
    int id;
    String name;
    double salary;

    emp1() {
        System.out.println("Employee by default");
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    emp1(int id, String name, double salary) {
        System.out.println("Employee parameterized");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID = " + this.id + ", Name = " + this.name + ", Salary = " + this.salary;
    }
}


class Admm1 extends emp1 {
    double allowance;

    Admm1() {
        super();
        this.allowance = 1000;
    }

    Admm1(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString() + ", Allowance = " + this.allowance;
    }
}

class hr1 extends emp1 {
    double commission;

    hr1() {
        super();
        this.commission = 7000;
    }

    hr1(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString() + ", Commission = " + this.commission;
    }
}

class sm1 extends emp1 {
    double target;
    double incentive;

    sm1() {
        super();
        this.target = 1100;
        this.incentive = 500;
    }

    sm1(int id, String name, double salary, double target, double incentive) {
        super(id, name, salary);
        this.target = target;
        this.incentive = incentive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Target = " + this.target + ", Incentive = " + this.incentive;
    }
}

//---- Main Class ----
public class queue {
    public static void main(String[] args) {

        System.out.println("Queue example with Employees\n");

        Queue<emp1>s1 = new LinkedList<emp1>();

        // Add employees (FIFO order)
        
        s1.offer(new sm1(103, "Sakshi", 60000, 700, 8000));
        s1.offer(new sm1(104, "Rohit", 65000, 800, 9000));
        s1.offer(new Admm1(101, "Prashant", 70000, 1000));
        s1.offer(new hr1(102, "Janhavi", 50000, 400));

        // Print all employees
        System.out.println("Queue contents: " + s1 + "\n");

        // Remove one employee (FIFO)
        System.out.println("Removed: " + s1.poll());

        // Show remaining
        System.out.println("\nRemaining queue: " + s1);
    }
}
