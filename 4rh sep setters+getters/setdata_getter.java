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
		
		d1.setday(10);  
		System.out.println(d1.getday());

		d1.setmonth(2);
		System.out.println(d1.getmonth());
		
		d1.setyear(2025);
		System.out.println(d1.getyear());



		d1.display();

	}
		
}