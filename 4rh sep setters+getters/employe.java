class employe{

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
class testemploye
{	
	public static void main(String[] args)
	{
		employe e1;
		e1=new employe();

		e1.setid(10);
		System.out.println(e1.getid());
		
		e1.setname("janhavi");
		System.out.println(e1.getname());


		e1.setsalary(39000);
		System.out.println(e1.getsalary());

		e1.display();
			
	}

}