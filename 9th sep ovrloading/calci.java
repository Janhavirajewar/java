class calculator
{

	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition of ii is"+c);
	}
	
	void add(double a,double b)
	{
		double c=a+b;
		System.out.println("addition of dd is"+c);
	}

	void add(double a,int b)
	{
		double c=a+b;
		System.out.println("addition of di is"+c);
	}

	void add(int a,double b)
	{
		double c=a+b;
		System.out.println("addition of id is"+c);
	}


}

class testcal
{
	public static void main (String[] args)
	{
		calculator c1=new calculator();
		int a=10,b=20;
		c1.add(a,b);

		double d1=10.0,d2=20.0;	
		c1.add(d1,d2);

		double d=10.20;
		int c=2;
		c1.add(d,c);

		int e=2;
		double d5=4.9;	
		c1.add(e,d5);

				
	}

}
