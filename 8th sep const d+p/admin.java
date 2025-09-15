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


	admin()
	{
		this.id=0;
		this.name="not d";
		this.salary=0;
		this.allowance=0;
	}


	admin(int a,String b,double c,double d)
	{
		this.id=a;
		this.name=b;
		this.salary=c;
		this.allowance=d;
	}

	void calculate()
	{
		System.out.println("totalsal"+(this.getsalary()+this.getallowance()));
	}


	void display()
	{
		System.out.println("id :"+this.id+"\tname :"+this.name+"\tsalary :"+this.salary);
	}
}
class testadmin
{	
	public static void main(String[] args)
	{
		admin a1;
		a1=new admin(1,"manu",90000,900);
		a1.display();
		a1.calculate();

		a1.setid(10);
				
		a1.setname("janhavi");
		
		a1.setsalary(39000);
		
		a1.setallowance(a1.getsalary());
		
		a1.calculate();

		a1.display();
			
	}

}