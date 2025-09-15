class DATE
{
	int day,month,year;
	String dow;

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

	void setdow(String str)
	{
		this.dow=str;
	}

	void display(){
		
			System.out.println("Day" +this.day+ "month" +this.month+ "year" +this.year+ "dow :" +this.dow);
	
}

}
class TEST
{
	public static void main(String[] args)
	{
	
		DATE d1;
		d1=new DATE();
		
		d1.setday(10);  
		System.out.println(d1.day);

		d1.setmonth(2);
		System.out.println(d1.month);
		
		d1.setyear(2025);
		System.out.println(d1.year);
		
		d1.setdow("wed");
		System.out.println(d1.dow);



		d1.display();

	}
		
}