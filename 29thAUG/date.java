
class date
{
	int day,month,year;
	String dow;  
}

class test{
	public static void main(String[] args)
	{
		date d1;
		d1=new date();
		System.out.println(d1);

		d1.day=2;
		d1.dow="Wed";
		
		System.out.println(d1.dow);
		System.out.println(d1.day);
		System.out.println(d1.month);
		System.out.println(d1.year);

		System.out.println(d1.day+"/" +d1.month+ "/" +d1.year);

		date d2;
		d2=new date();
		System.out.println(d2);
	}
}
