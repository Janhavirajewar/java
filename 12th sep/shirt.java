class Shirt {
    // -------- Attributes --------
    int sid;
    String brand;
    String type;     // e.g., formal, casual
    double price;
    String size;     // small, medium, large, x-large

    // -------- Default Constructor --------
    Shirt() {
        this.sid = 0;
        this.brand = "Unknown";
        this.type = "Casual";
        this.price = 0.0;
        this.size = "Medium";
    }

    // -------- Parameterized Constructor --------
    Shirt(int sid, String brand, String type, double price, String size) {
        this.sid = sid;
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    // -------- Setters --------
    void setSid(int sid) {
        this.sid = sid;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setType(String type) {
        this.type = type;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setSize(String size) {
        this.size = size;
    }

    // -------- Getters --------
    int getSid() {
        return this.sid;
    }

    String getBrand() {
        return this.brand;
    }

    String getType() {
        return this.type;
    }

    double getPrice() {
        return this.price;
    }

    String getSize() {
        return this.size;
    }

   static double calculateprice(double basePrice, String size) {
        if (size.equals("Small")) {
            return basePrice;
        } else if (size.equals("Medium")) {
            return basePrice * 1.10;
        } else if (size.equals("Large")) {
            return basePrice * 1.20;
        } else if (size.equals("X-Large")) {
            return basePrice * 1.30;
        } else {
            return basePrice; // Default
        }
    }

    // -------- Display Method --------
    void display() {
        Shirt.calculateprice(price, size);
        System.out.println("Shirt ID: " + sid);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
	System.out.println("price"+price);
        System.out.println("Final Price: " + finalprice);
        System.out.println("----------------------------");
    }

}
// -------- Test Class --------
class TestShirt {
    public static void main(String[] args) {

        // Using default constructor + setters
        Shirt s1 = new Shirt();

        s1.setSid(101);
        s1.setBrand("Arrow");
        s1.setType("Formal");
        s1.setPrice(1100);
        s1.setSize("Large");
	 
        // Using parameterized constructor + setters
        Shirt s2 = new Shirt(102, "Peter England", "Formal", 1200, "Medium");
	 s2.display();
        // update values using setters
        s2.setSid(202);
        s2.setBrand("Zara");
        s2.setType("Casual");
        s2.setPrice(2500);
        s2.setSize("X-Large");
	 
        // Using setters directly (after default constructor)
        Shirt s3 = new Shirt();
	
        s3.setSid(103);
        s3.setBrand("Levis");
        s3.setType("Casual");
        s3.setPrice(1500);
        s3.setSize("Small");
	
        // Display all shirts
        s1.display();
        s2.display();
        s3.display();
    }
}
