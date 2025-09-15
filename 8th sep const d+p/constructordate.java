class DATE
{
	int day,month,year;

	void setday(int a)
	{
		this.day=a;
	}

	void setmonth(int b)
	{
		this.month=b;
	}

	void setyear(int c)
	{
		this.year=c;
	}

	int getday(){
		
		return this.day;
	}

	int getmonth(){
		
		return this.month;
	}


	int getyear(){
		
		return this.year;
	}


	DATE()
	{
		this.day=1;
		this.month=9;
		this.year=2011;
	}


	DATE(int a,int b,int c)
	{
		this.day=a;
		this.month=b;
		this.year=c;
	}

	void display(){
		
			System.out.println("Day :"+this.day+ "month :"+this.month+ "year :"+this.year);
	
}

}
class TEST
{
	public static void main(String[] args)
	{
	
		DATE d1;
		d1=new DATE();
		System.out.println("d1 is called");

		d1.display();
		

		
		d1.setday(10);  
		System.out.println(d1.getday());

		d1.setmonth(2);
		System.out.println(d1.getmonth());
		
		d1.setyear(2025);
		System.out.println(d1.getyear());

		

		DATE d2;
		d2=new DATE(1,2,2022);
		System.out.println("d2 is called");


		d2.display();
		
		
		d2.setday(20);  
		System.out.println(d2.getday());

		d2.setmonth(2);
		System.out.println(d2.getmonth());
		
		d2.setyear(2023);
		System.out.println(d2.getyear());
	

	}
		
}