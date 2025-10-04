class Appliance
{
	String model;
	String brand;
	int powerconsupction;
	
	Appliance() {
		System.out.println("Appliance by def");
		this.model="not defined";
		this.brand="not defiend";
		this.powerconsupction=0;
	}

	Appliance(String model, String brand, int powerconsupction) {
		
		this.model = model;
		this.brand = brand;
		this.powerconsupction = powerconsupction;
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

	int getPowerconsupction() {
		return powerconsupction;
	}

	void setPowerconsupction(int powerconsupction) {
		this.powerconsupction = powerconsupction;
	}
	void display()
	{
		System.out.println("model"+this.model);
		System.out.println("brand"+this.brand);
		System.out.println("powerconsupction"+this.powerconsupction);
	}
}// Applicnce ends here 

class fan extends Appliance
{
	int blades;
	String color;
	fan() {
		
		System.out.println("fan by def");
		this.blades=0;
		this.color="notf";
	}
	fan(String model,String brand,int powercon,int blades, String color) {
		super(model,brand,powercon);
		System.out.println("fan para");
		this.blades = blades;
		this.color = color;
	}
	int getBandes() {
		return blades;
	}
	void setBandes(int blades) {
		this.blades = blades;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	void display()
	{
		super.display();
		System.out.println("");
	}
	
}// fan ends here

class Light extends Appliance {
    String type;
    int wattage;
    String color;

    Light() {
        super();
        this.type = "LED";
        this.wattage = 15;
        this.color = "Warm White";
    }
    

    Light(String model,String brand,int powercapacity,String type, int wattage, String color) {
		super(model,brand,powercapacity);
		this.type = type;
		this.wattage = wattage;
		this.color = color;
	}



	void display() {
        super.display();
        System.out.println("Type =: " + type);
        System.out.println("Wattage =: " + wattage);
        System.out.println("Color =: " + color);
    }
}// fan ends here 


 class testappliance {
	 
	public static void main(String[] args)
	{
		Appliance a1=new Appliance("A100","samgsung",1200);
		a1.display();
		System.out.println();
		
		fan f1=new fan("102e","bajaj",900,4,"red");
		f1.display();
		System.out.println();
		
		Light l = new Light();
        l.display();

		
	}
	 
}
