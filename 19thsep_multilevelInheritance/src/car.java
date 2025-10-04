
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


class ElectricCar extends car // sub class of car
{
	int batterycapacity;

	ElectricCar() {
		super();
		System.out.println("electric by def");
		this.batterycapacity=80;
	}

	ElectricCar(String model,String brand,String color,int year,int doors,String fuel,int batterycapacity) {
		super(model,brand,color,year,doors,fuel);
		System.out.println("electric para");
		this.batterycapacity = batterycapacity;
	}

	int getBatterycapacity() {
		return batterycapacity;
	}

	void setBatterycapacity(int batterycapacity) {
		this.batterycapacity = batterycapacity;
	}

	void display()
	{
		super.display();
		System.out.println("batterycpacity"+this.batterycapacity);
	}
	
}
 class testvehicle {

	public static void main(String[] args) 
	{
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
			ElectricCar e1=new ElectricCar("model1","tata","cream",2024,6,"desel",90);
			e1.display();
			
			
	}

}
