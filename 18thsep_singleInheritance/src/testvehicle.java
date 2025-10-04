import java.util.Scanner;
class Vehicle
{
	String model;
	String brand;
	String color;
	int year;
	
	
	
	Vehicle() {
		System.out.println("vel def");
		this.model="toyota";
		this.brand="Corolla";
		this.color="white";
		this.year=2024;
		
	}

	Vehicle(String model, String brand, String color, int year) {
		System.out.println("vel para");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.year = year;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}
	
	void display()
	{
		System.out.println("model ="+this.model);
		System.out.println("brand ="+this.brand);
		System.out.println("color ="+this.color);
		System.out.println("year ="+this.year);
	}
	
	
} //vehicle ends here

class car extends Vehicle
{
	int doors;
	String fuel;
	
	
	
	car() {
		super();
		System.out.println("car def");
		this.doors=4;
		this.fuel="Electric";
	}



	car(String model,String brand,String color,int years,int doors, String i) {
		super(model,brand,color,years);
		System.out.println("car para");
		this.doors = doors;
		this.fuel = i;
	}



	int getDoors() {
		return doors;
	}



	void setDoors(int doors) {
		this.doors = doors;
	}



	String getFuel() {
		return fuel;
	}



	void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	void display()
	{
		super.display();
		System.out.println("doors ="+this.doors);
		System.out.println("fuel ="+this.fuel);
	}
	
	
}// car ends  here

class bike extends Vehicle
{
	String type;
	int price;
	
	bike() {
		super();
		System.out.println("bike by def");
		this.type="sports bike";
		this.price=120000;
		
	}

	bike(String model,String brand,String color,int year ,String type, int price) {
		super(model,brand,color,year);
		System.out.println("bike para");
		this.type = type;
		this.price = price;
	}
	
	
	void display() {
		super.display();
		System.out.println("type ="+this.type);
		System.out.println("price ="+this.price);
		
	}
	
	
}

 class testvehicle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("---------------------------------------");
			Vehicle v1=new Vehicle();
			System.out.println(" \tfor vehicle 1 ");
			v1.display();
			
			System.out.println("---------------------------------------");
			car c1=new car("model","tesla","grey",2025,5,"electic");
			
			System.out.println("\tfor car 1 ");
			c1.display();
			
			System.out.println("---------------------------------------");
			car c2=new car();
			System.out.println(" \tfor car 2");
			c2.display();
			
			System.out.println("---------------------------------------");
			System.out.println("enter model");
			String a=sc.next();
			System.out.println("enter brand");
			String b=sc.next();
			System.out.println("enter color");
			String c=sc.next();
			System.out.println("enter year");
			int d=sc.nextInt();
			System.out.println("enter type");
			String e=sc.next();
			System.out.println("enter price ");
			int f=sc.nextInt();
					
			bike bb1=new bike(a,b,c,d,e,f);
			
			bb1.display();
	}

}
