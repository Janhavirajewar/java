class Bill {
    int id;
    String name;
    double unit;
    static double rateperunit;

    static {
        rateperunit = 10;
    }

    static void setRatePerUnit(double r) {
        rateperunit = r;
    }

    void setId(int a) {
        this.id = a;
    }

    void setName(String a) {
        this.name = a;
    }

    void setUnit(double a) {
        this.unit = a;
    }

    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getUnit() {
        return this.unit;
    }

    Bill() {
        this.id = 101;
        this.name = "janu";
        this.unit = 60;
    }

    Bill(int a, String b, double c) {
        this.id = a;
        this.name = b;
        this.unit = c;
    }

    void cal() {
        System.out.println("bill = " + (this.unit * rateperunit));
	 System.out.println("--------------------------");System.out.println(c);


    }

    void display() {
        System.out.println("id : " + id);
        System.out.println("name : " + name);
        System.out.println("unit : " + unit);
        System.out.println("rateperunit : " + rateperunit);
           }
}

class TestBill {
    public static void main(String[] args) {
        Bill b1 = new Bill(1, "janhavi", 40);
        b1.display();
	b1.cal();
        b1.setId(1);
        b1.setName("pallavi");
        b1.setUnit(70);
        b1.display();
	b1.cal();

        Bill b2 = new Bill();
        b2.display();
	b2.cal();
        b2.setId(2);
        b2.setName("pallavii");
        b2.setUnit(80);
        b2.display();
	b2.cal();

        Bill b3 = new Bill();
        b3.display();
	b3.cal();
        b3.setId(3);
        b3.setName("pallaviii");
        b3.setUnit(90);
        b3.display();
        b3.cal();

        Bill.setRatePerUnit(12); // change rate

        b1.display();
	b1.cal();
        b2.display();
	b2.cal();
        b3.display();
	b3.cal();
    }
}
