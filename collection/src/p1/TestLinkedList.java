package p1;
import java.util.LinkedList;

// ---- Superclass ----

class Employee {
    int id;
    String name;
    double salary;

    // Default constructor
    Employee() {
        System.out.println("Employee by default");
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    // Parameterized constructor
    Employee(int id, String name, double salary) {
        System.out.println("Employee parameterized");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    int getId() { return id; }
    void setId(int id) { this.id = id; }

    String getName() { return name; }
    void setName(String name) { this.name = name; }

    double getSalary() { return salary; }
    void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID = " + this.id + ", Name = " + this.name + ", Salary = " + this.salary;
    }
}

// ---- Subclasses ----
class Admin extends Employee {
    double allowance;

    Admin() {
        super();
        System.out.println("Admin by default");
        this.allowance = 1000;
    }

    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        System.out.println("Admin parameterized");
        this.allowance = allowance;
    }

    double getAllowance() { return allowance; }
    void setAllowance(double allowance) { this.allowance = allowance; }

    @Override
    public String toString() {
        return super.toString() + ", Allowance = " + this.allowance;
    }
}

class Hr extends Employee {
    double commission;

    Hr() {
        super();
        System.out.println("HR by default");
        this.commission = 7000;
    }

    Hr(int id, String name, double salary, double commission) {
        super(id, name, salary);
        System.out.println("HR parameterized");
        this.commission = commission;
    }

    double getCommission() { return commission; }
    void setCommission(double commission) { this.commission = commission; }

    @Override
    public String toString() {
        return super.toString() + ", Commission = " + this.commission;
    }
}

class SalesManager extends Employee {
    double target;
    double incentive;

    SalesManager() {
        super();
        System.out.println("SalesManager by default");
        this.target = 1100;
        this.incentive = 500;
    }

    SalesManager(int id, String name, double salary, double target, double incentive) {
        super(id, name, salary);
        System.out.println("SalesManager parameterized");
        this.target = target;
        this.incentive = incentive;
    }

    double getTarget() { return target; }
    void setTarget(double target) { this.target = target; }

    double getIncentive() { return incentive; }
    void setIncentive(double incentive) { this.incentive = incentive; }

    @Override
    public String toString() {
        return super.toString() + ", Target = " + this.target + ", Incentive = " + this.incentive;
    }
}

// ---- Main class ----
public class TestLinkedList {
    public static void main(String[] args) {
    	
        System.out.println("LinkedList example with Employees");

        LinkedList<Employee> list = new LinkedList<>();

        // Add employees
        list.add(new Admin(101, "Prashant", 70000, 1000));
        list.addFirst(new Hr(102, "Janhavi", 50000, 400));
        list.add(new SalesManager(103, "Sakshi", 60000, 700, 8000));
        list.add(new SalesManager(104, "Rohit", 65000, 800, 9000));

        // Print all employees
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println();
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
        System.out.println();
        
//        list.removeFirst();
//        System.out.println(list);
//        
//        System.out.println();
//        list.removeLast();
//        System.out.println(list);
        
        System.out.println();
        list.remove(0);
        System.out.println(list);
    }
}