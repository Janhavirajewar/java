class hr{

	int id;
	String name;
	double salary;
	double commission;


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

	void setcommission(double salary)
	{
		this.commission=this.salary*0.10;
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

	double getcommission()
	{
		return this.commission;
	}


	void display()
	{
		System.out.println("id"+this.id+"name"+this.name+"salary"+this.salary+"commission"+this.commission);
	}
}
class testhr
{	
	public static void main(String[] args)
	{
		hr h1;
		h1=new hr();

		h1.setid(10);
		System.out.println(h1.getid());
		
		h1.setname("janhavi");
		System.out.println(h1.getname());


		h1.setsalary(39000);
		System.out.println(h1.getsalary());

		h1.setcommission(h1.getsalary());
		System.out.println(h1.getcommission());

		System.out.println("totalsal"+(h1.getsalary()+h1.getcommission()));



		h1.display();
			
	}

}