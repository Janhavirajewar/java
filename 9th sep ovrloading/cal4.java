class calculator
{

	void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);

	}
	
	void sub(double a,double b)
	{
		double c = a-b;
		System.out.println(c);


	}
	
	void mul(int a,double b)
	{
		double c = a*b;
		System.out.println(c);

	}
	
	void div(double a,int b)
	{
		double c = a/b;
		System.out.println(c);

	}
				
}
class testcal
{

	public static void main(String[] args)
{
	 System.out.println("Program is running!");
	calculator c1=new calculator();

	c1.add(10,10);
	c1.sub(10.0,20.0);
	c1.mul(10,10.0);
	c1.div(10.0,10);

}
}