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
	
	employe()
	{
		this.id=1;
		this.name="janu";
		this.salary=35000;
	}


	employe(int a,String b,double c)
	{
		this.id=a;
		this.name=b;
		this.salary=c;
	}


	void display()
	{
		System.out.println("id: " + this.id + "\tname: " + this.name + "\tsalary: " + this.salary);

	}
}
class testemploye
{	
	public static void main(String[] args)
	{
		employe e1;
		e1=new employe();
		e1.display();
		

		e1.setid(10);
		System.out.println(e1.getid());
		
		e1.setname("janhavi");
		System.out.println(e1.getname());


		e1.setsalary(39000);
		System.out.println(e1.getsalary());
		e1.display();
		System.out.println("e1 called");
		

		employe e2;
		e2=new employe(2,"jannvii",40000);
		e2.display();
		

		e2.setid(10);
		System.out.println(e1.getid());
		
		e2.setname("janhavi");
		System.out.println(e1.getname());


		e2.setsalary(39000);
		System.out.println(e1.getsalary());
		e2.display();
		System.out.println("e2 called");
					
	}

}