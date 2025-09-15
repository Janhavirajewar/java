class admin{

	int id;
	String name;
	double salary;
	double allowance;


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

	void setallowance(double salary)
	{
		this.allowance=this.salary*0.10;
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

	double getallowance()
	{
		return this.allowance;
	}


	void display()
	{
		System.out.println("id"+this.id+"name"+this.name+"salary"+this.salary);
	}
}
class testadmin
{	
	public static void main(String[] args)
	{
		admin a1;
		a1=new admin();

		a1.setid(10);
		System.out.println(a1.getid());
		
		a1.setname("janhavi");
		System.out.println(a1.getname());


		a1.setsalary(39000);
		System.out.println(a1.getsalary());

		a1.setallowance(a1.getsalary());
		System.out.println(a1.getallowance());

		System.out.println("totalsal"+(a1.getsalary()+a1.getallowance()));



		a1.display();
			
	}

}