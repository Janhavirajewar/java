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


	void display()
	{
		System.out.println("id"+this.id+"name"+this.name+"salary"+this.salary);
	}
}
class testsales
{	
	public static void main(String[] args)
	{
		sales s1;
		s1=new sales();

		s1.setid(10);
		System.out.println(s1.getid());
		
		s1.setname("janhavi");
		System.out.println(s1.getname());


		s1.setsalary(39000);
		System.out.println(s1.getsalary());

		s1.display();
			
	}

}