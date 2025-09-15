class cource
{
	String c_name;
	String duration;
	int fees;
	int cid;

	void setname(String a)
	{
		this.c_name=a;
	}
	
	void setduration(String a)
	{
		this.duration=a;
	}
	
	void setfees(int a)
	{
		this.fees=a;
	}
	
	void setid(int a)
	{
		this.cid=a;
	}

	String getname()
	{
		return this.c_name;
	}
	
	String getduration()
	{
		return this.duration;
	}

	int getfees()
	{
		
		return this.fees;	
	}
	
	int getid()
	{
		
		return this.cid;	
	}
	
	cource()
	{
		this.c_name="cpp";
		this.duration="two  m";
		this.fees=20000;
		this.cid=1;
	}
	
	cource(String a,String b,int c,int d)
	{
		this.c_name=a;
		this.duration=b;
		this.fees=c;
		this.cid=d;
	}




	void display()
	{
		System.out.println("cource"+this.c_name);
		System.out.println("\tduration"+this.duration);
		System.out.println("\tfees"+this.fees);
		System.out.println("\tcource id"+this.cid);
	}
}
class testcource
{
	public static void main(String[] args)
	{

	cource c1;
	c1=new cource();
	c1.display();

	c1.setname("corejava");
	
	c1.setduration("six month");
	

	c1.setfees(40000);
	
	c1.setid(011);
		
	c1.display();

	cource c2;
	c2=new cource("c","6 m",40000,101);
	c2.display();


}	
}