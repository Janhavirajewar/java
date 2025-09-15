class Sales {
    // -------- Attributes --------
    private int id;
    private String name;
    private double salary;
    private int target;
    private double incentive;

    // -------- Setters --------
    void setId(int a) {
        this.id = a;
    }

    void setName(String a) {
        this.name = a;
    }

    void setSalary(double a) {
        this.salary = a;
    }

    void setTarget(int a) {
        this.target = a;
    }

    // Incentive based on parameter t
    void setIncentive(int t) {
        if (t > 50000) {
            this.incentive = this.salary * 0.20; 
        } else if (t > 30000) {
            this.incentive = this.salary * 0.15;
        } else if (t > 15000) {
            this.incentive = this.salary * 0.10;
        } else {
            this.incentive = 0;
        }
    }

    // -------- Getters --------
    int getId() { return this.id; }
    String getName() { return this.name; }
    double getSalary() { return this.salary; }
    int getTarget() { return this.target; }
    double getIncentive() { return this.incentive; }

    // -------- Display Method --------
    void display() {
        System.out.println("---- Sales Employee Details ----");
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Target: " + this.target);
        System.out.println("Incentive: " + this.incentive);
        System.out.println("Total Salary: " + (this.salary + this.incentive));
        System.out.println("--------------------------------");
    }
}

// -------- Test Class --------
class TestSales {
    public static void main(String[] args) {
        Sales s1 = new Sales();

        s1.setId(10);
        s1.setName("Janhavi");
        s1.setSalary(35000);
        s1.setTarget(50000);

        s1.setIncentive(s1.getTarget()); // pass target explicitly
        s1.display();
    }
}
