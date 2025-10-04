class Animal {
    String species;
    int lifespan;
    
    Animal() {
		super();
		this.species="not g";
		this.lifespan=0;
		
	}
   
	Animal(String species, int lifespan) {
		super();
		this.species = species;
		this.lifespan = lifespan;
	}

	String getSpecies() {
		return species;
	}

	void setSpecies(String species) {
		this.species = species;
	}

	int getLifespan() {
		return lifespan;
	}

	void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}

	
	void display() {
	
		System.out.println("species ="+this.species);
		System.out.println("lifespan ="+this.lifespan);
	}
	 void sound1() { System.out.println(species + " makes a sound"); }

}// animal ends hereclass Bird extends Animal 

class bird extends Animal 
{
String canFly;

bird() {
	super();
	this.canFly="no";
}
 

bird(String species,int lifespan,String canFly) {
	super(species,lifespan);
	this.canFly = canFly;
}

void display()
{
	super.display();
	System.out.println("can fly ="+this.canFly);
}

void sound1()
{ 
	System.out.println(species + " (Bird) chirping, can fly: " + canFly); 
	
}

}// bird ends here

class parrot extends bird
{
	String color;

	parrot() {
		super();
		this.color="green";
	}
	

	parrot(String species,int lifespan,String canfly,String color) {
		super(species,lifespan,canfly);
		this.color = color;
	}


	String getColor() {
		return color;
	}
	void display() {
		super.display();
		System.out.println("color ="+this.color);
	}
	
	void sound1() {
        System.out.println(color + " Parrot is mimicking human speech!");
    }
	
}// parrot ends here

 class TestAnimal {
	 public static void main(String[] args)
	 {
//		 Animal a1=new Animal();
//		
//		 System.out.println();
//		 
//		 a1=new bird();
//		
//		 System.out.println();
//		 
//		 a1=new parrot("bird",2, "yes","Green");
//		
		 Animal[] arr = new Animal[3];

	        // Store different objects (runtime polymorphism)
	        arr[0] = new Animal("Generic Animal", 5);
	        arr[1] = new bird("Sparrow", 2, "yes");
	        arr[2] = new parrot("Parrot", 10, "yes", "Green");

	        
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i].sound1();
		 }
				 
	 }

}
