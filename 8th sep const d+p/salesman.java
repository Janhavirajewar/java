class sales{

	int id;
	String name;
	double salary;


	void setid(int a)
	{
		this.id=a;
	}
	
	void setname(String a)
	{
		this.name=a;
	}

	void setsalary(double a)
	{
		this.salary=a;
	}
	
	int getid()
	{
		return this.id;
	}
	
	String  getname()
	{
		return this.name;
	}

	double getsalary()
	{
		return this.salary;
	}
		
	sales()
	{
		this.id=1;
		this.name="eshan";
		this.salary=100000;

	}
	
	sales(int a,String b,double c)
	{
		this.id=a;
		this.name=b;
		this.salary=c;

	}


	void display()
	{
		System.out.println("id :" +this.id+ "\tname :" +this.name+ "\tsalary :" +this.salary);
	}
}
class testsales
{	
	public static void main(String[] args)
	{
		sales s1;
		s1=new sales(2,"parth",500000);
		s1.display();
	
		
		s1.setid(10);
		System.out.println(s1.getid());
		
		s1.setname("janhavi");
		System.out.println(s1.getname());


		s1.setsalary(39000);
		System.out.println(s1.getsalary());
		s1.display();

			}

}