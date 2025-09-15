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

	void display()
	{
		System.out.println("cource"+this.c_name);
		System.out.println("duration"+this.duration);
		System.out.println("fees"+this.fees);
		System.out.println("cource id"+this.cid);
	}
}
class testcource
{
	public static void main(String[] args)
	{

	cource c1;
	c1=new cource();

	c1.setname("corejava");
	System.out.println(c1.getname());

	c1.setduration("six month");
	System.out.println(c1.getduration());

	c1.setfees(40000);
	System.out.println(c1.getfees());

	c1.setid(011);
	System.out.println(c1.getid());
	
	c1.display();

}	
}