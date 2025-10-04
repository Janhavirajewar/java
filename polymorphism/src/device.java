class Device
{
	String brand;
	double price;
	String color;
	Device() {
		
		System.out.println("device by def");
		this.brand="not given";
		this.price=0;
		this.brand="not given";
	}
	Device(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	void display()
	{
		System.out.println("brand ="+this.brand);
		System.out.println("price ="+this.price);
		System.out.println("coloe ="+this.color);
	}
	
	void specification() {
		
		System.out.println("specifiction not defined");
		
	}
	
}// device ends here

class computer extends Device
{
	String proccessor;
	String ram;
	computer() {
		super();
		System.out.println("computer by def");
		this.proccessor="notf";
		this.ram="notf";
	}
	computer(String brand,double price,String color,String proccessor, String ram) {
		super(brand,price,color);
		this.proccessor = proccessor;
		this.ram = ram;
	}
	String getProccessor() {
		return proccessor;
	}
	void setProccessor(String proccessor) {
		this.proccessor = proccessor;
	}
	String getRam() {
		return ram;
	}
	void setRam(String ram) {
		this.ram = ram;
	}
	
	void display()
	{
		super.display();
		System.out.println("proccessor ="+this.proccessor);
		System.out.println("rem ="+this.ram);
	}
	
void specification() {
		
		System.out.println("specifiction =" + "processor supports "+this.proccessor+ "ram supports"+this.ram);
		
	}
	
	
	
}// commputer ends here

class Laptop extends computer {
    double weight;
   
    Laptop() {
		super();
		this.weight=0;
	}
	Laptop(String brand,double price,String color,String processor,String ram, double weight) {
        super(brand,price,color,processor,ram);
        this.weight = weight;
    }
    void display() {
        super.display();
        System.out.println("Weight: =" + weight + "kg");
    }
    

void specification() {
		
		System.out.println("specifiction =" + "processor supports "+this.proccessor+ "ram supports"+this.ram+ " light weight"+this.weight);
		  
}

}// laptop ends here


 class testDevice {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Device d1=new Device();
		d1.display();
		d1.specification();
		System.out.println();
		
		 d1=new computer("Dell",70000,"black","i7","16gb");
		d1.display();
		d1.specification();
		System.out.println();
		
		d1 = new Laptop("lenovo",90000,"silver","i10","48gb", 2.5);
	      d1.display();
	      d1.specification();
	      System.out.println();
		
	        d1 = new Laptop("apple",100000,"silver","i10","49gb", 2.9);
	        d1.specification();
	        d1.display();	

	}

}
