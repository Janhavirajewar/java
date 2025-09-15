// -------- Bank Class --------
class Bank {

    // Overloaded method for Student

    void approveLoan(Student s) {
        double loanAmount = 0;

        if (s.getPercentage() > 80) {
            loanAmount = 200000;
        } else if (s.getPercentage() >= 60) {
            loanAmount = 100000;
        } else if (s.getPercentage() >= 40) {
            loanAmount = 50000;
        } else {
            loanAmount = 0;
        }

        if (loanAmount > 0)
            System.out.println("Loan approved for Student " + s.getName() + ": ₹" + loanAmount);
        else
            System.out.println("Loan not approved for Student " + s.getName());
    }

    // Overloaded method for Employee
    void approveLoan(Employee e) {
        double loanAmount = 0;
        double salary = e.getSalary();

        if (salary > 1200000) {            // > 12 LPA
            loanAmount = 700000;
        } else if (salary >= 1000000) {    // 10-12 LPA
            loanAmount = 600000;
        } else if (salary >= 600000) {     // 6-10 LPA
            loanAmount = 500000;
        } else if (salary >= 400000) {     // 4-6 LPA
            loanAmount = 400000;
        } else {
            loanAmount = 0;
        }

        if (loanAmount > 0)
            System.out.println("Loan approved for Employee " + e.getName() + ": ₹" + loanAmount);
        else
            System.out.println("Loan not approved for Employee " + e.getName());
    }
}

// -------- Student Class --------
class Student {
    int rollno;
    String name;
    double percentage;

    Student() {
        this.rollno = 0;
        this.name = "none";
        this.percentage = 0;
    }

    Student(int a, String b, double c) {
        this.rollno = a;
        this.name = b;
        this.percentage = c;
    }

    // getters
    int getRollno() {
        return this.rollno;
    }

    String getName() {
        return this.name;
    }

    double getPercentage() {
        return this.percentage;
    }

    // setters
    void setRollno(int r) {
        this.rollno = r;
    }

    void setName(String n) {
        this.name = n;
    }

    void setPercentage(double p) {
        this.percentage = p;
    }

    void display() {
        System.out.println("Student Roll No: " + this.rollno);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Percentage: " + this.percentage);
    }
}

// -------- Employee Class --------
class Employee {
    int id;
    String name;
    double salary; // annual salary in INR

    Employee() {
        this.id = 0;
        this.name = "none";
        this.salary = 0;
    }

    Employee(int a, String b, double c) {
        this.id = a;
        this.name = b;
        this.salary = c;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    // setters
    void setId(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }
}

// -------- Test Class --------
class Test {
    public static void main(String[] args) {
        Bank b1 = new Bank();

        Student s1 = new Student(101, "Rahul", 85.6);
        Employee e1 = new Employee(201, "Anita", 450000); // annual salary (e.g., 4.5 LPA)

        // Display and loan approval
        s1.display();
        b1.approveLoan(s1);

        System.out.println("-----------------");

        e1.display();
        b1.approveLoan(e1);
    }
}
