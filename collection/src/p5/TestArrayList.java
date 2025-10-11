package p5;

import java.util.ArrayList;
import java.util.Collections;

// Base class
class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee() {
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "ID=" + id + ", Name=" + name + ", Salary=" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee) {
        	
        	System.out.println("equals");
            Employee e = (Employee) obj;
            
            return this.id == e.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
    	System.out.println("hashcode");
        return this.id;
    }

    @Override
    public int compareTo(Employee e) {
    	System.out.println("compare");
        return this.id - e.id; // sort by id
    }
}

// Admin class
class Admin extends Employee {
    double allowance;

    Admin() { super(); this.allowance = 1000; }
    Admin(int id, String name, double salary, double allowance) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return super.toString() + ", Allowance=" + allowance;
    }
}

// HR class
class HR extends Employee {
    double commission;

    HR() { super(); this.commission = 5000; }
    HR(int id, String name, double salary, double commission) {
        super(id, name, salary);
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString() + ", Commission=" + commission;
    }
}

// Sales Manager class
class Manager extends Employee {
    double target;
    double incentive;

    Manager() { super(); this.target = 1000; this.incentive = 500; }
    Manager(int id, String name, double salary, double target, double incentive) {
        super(id, name, salary);
        this.target = target;
        this.incentive = incentive;
    }

    @Override
    public String toString() {
        return super.toString() + ", Target=" + target + ", Incentive=" + incentive;
    }
}

// Test class
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Admin(101, "Prashant", 70000, 1000));
        list.add(new Manager(103, "Sakshi", 60000, 700, 8000));
        list.add(new HR(102, "Janhavi", 50000, 400));
        list.add(new Manager(103, "Sakshi", 60000, 700, 8000));

        System.out.println("Before sorting:");
        for (Employee e : list) {
            System.out.println(e);
        }

        Collections.sort(list); // sort by id

        System.out.println("\nAfter sorting by ID:");
        
        for (Employee e : list) {
            System.out.println(e.getName());
        }
        
        // Check contains
        Manager m = new Manager(103, "Sakshi", 60000, 700, 8000);
        if (list.contains(m)) {
            System.out.println("\nManager found!");
        } else {
            System.out.println("\nManager not found!");
        }
    }
}
