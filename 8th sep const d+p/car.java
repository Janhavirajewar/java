class cars
{
	String model;
	String brand;
	String price;
	int year;

	void setmodel(String a)
	{
		this.model=a;
	}
	
	void setbrand(String a)
	{
		this.brand=a;
	}

	void setprice(String a)
	{
		this.price=a;
	}

	void setyear(int a)
	{
		this.year=a;
	}

	String getmodel()
	{
		return this.model;
	}
	
	String getbrand()
	{
		return this.brand;
	}


	String getprice()
	{
		return this.price;
	}

	int getyear()
	{
		return this.year;
	}
	
	cars()
	{
		this.model="not f";
		this.brand="not f";
		this.price="not f";
		this.year=0;
	}

	cars(String a,String b,String c,int d)
	{
		this.model=a;
		this.brand=b;
		this.price=c;
		this.year=d;
	}


	void display()
	{
	System.out.println("model :"+this.model+ "\t brand :" +this.brand+ "\t price :" +this.price+ "\t year :" +this.year);
	}

}
class testcars
{
	public static void main(String[] args)
	{
		cars c1;	
		c1=new cars("swift","maruti","five l",2022);
		c1.display();
	
	
		c1.setmodel("Swift Dzire");
		
		c1.setbrand("Maruti Suzuki");
		
		c1.setprice("six lakh");
		
		c1.setyear(2024);
		
		c1.display();
		

	}
}