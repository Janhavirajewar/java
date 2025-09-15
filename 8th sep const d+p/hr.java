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

	void cal()
	{
		System.out.println("totalsal"+(this.getsalary()+this.getcommission()));
	}
	
	hr()
	{
		this.id=0;
		this.name="not f";
		this.salary=0;	
		this.commission=0;
		
	}

hr(int a, String b, double d, double c)
 {
    this.id = a;
    this.name = b;
    this.salary = d;
    this.commission = c;
}

	void display()
	{
		System.out.println("id"+this.id+"\tname"+this.name+"\tsalary"+this.salary+"\tcommission"+this.commission);
	}
}
class testhr
{	
	public static void main(String[] args)
	{
		hr h1;
		h1=new hr(1,"devesh",100000,1000);
		h1.display();
		h1.cal();


		h1.setid(10);
		
		h1.setname("janhavi");
		
		h1.setsalary(39000);
		
		h1.setcommission(h1.getsalary());
		
		h1.cal();

		h1.display();
			
	}

}