class product
{
	int id;
	String name;
	double price;
	int quantity;
	static double discount;

static
{
	discount=0.0;
}

	
product()
	{
		this.id=1;
		this.name="soap";
		this.price=5;
		this.quantity=5;
	}

product(int a,String b,double c,int d)
	{
		this.id=a;
		this.name=b;
		this.price=c;
		this.quantity=d;
	}

   // -------- Setters --------
    void setId(int a) {
        this.id = a;
    }

    void setName(String b) {
        this.name = b;
    }

    void setPrice(double c) {
        this.price = c;
    }

    void setQuantity(int d) {
        this.quantity = d;
    }

    // -------- Getters --------
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    int getQuantity() {
        return this.quantity;
    }

double discount() 
{
	double p;
	return p =this.price-(this.price * product.discount);

}	

double sellingprice()
{
	return discount() * quantity;
}



   static void setDiscount(double d) {
        discount = d;
    }
    static double getDiscount() { return discount; }


void display() {
        	System.out.println("Product ID      : " + id);
        	System.out.println("Product Name    : " + name);
         	System.out.println("Total Price     : " + (price * quantity));
       		System.out.println("Product Quantity: " + quantity);
	    	System.out.println("Discount        : " + discount + "%");
		System.out.println("Discounted Price: " + discount());
       		System.out.println("Selling Price   : " + sellingprice());		
        	System.out.println("------------------------------");
    }

}

class testproduct
{
	public static void main(String[] args)
	{

	product p1=new product(101,"nirma",20,2);

	product p2=new product();
	
	product p3=new product();

	 product.setDiscount(0.10); 

	// Display products
        p1.display();
        p2.display();
        p3.display();

        // Updating values using setters

	p1.setId(101);
        p1.setName("conditioner");
        p1.setPrice(60);
        p1.setQuantity(3);

        p2.setId(102);
        p2.setName("Shampoo");
        p2.setPrice(50);
        p2.setQuantity(3);

        p3.setId(103);
        p3.setName("Toothpaste");
        p3.setPrice(30);
        p3.setQuantity(4);

        // Display again
	p1.display();
        p2.display();
        p3.display();
	
}

}