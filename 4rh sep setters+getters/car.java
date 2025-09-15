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


	void display()
	{
	System.out.println("model"+this.model+ "brand" +this.brand+ "price" +this.price+ "year" +this.price);
	}

}
class testcars
{
	public static void main(String[] args)
	{
		cars c1;	
		c1=new cars();
		

		c1.setmodel("Swift Dzire");
		System.out.println(c1.getmodel());
		c1.setbrand("Maruti Suzuki");
		System.out.println(c1.getbrand());
		c1.setprice("six lakh");
		System.out.println(c1.getprice());
		c1.setyear(2024);
		System.out.println(c1.getyear());

		c1.display();
		

	}
}