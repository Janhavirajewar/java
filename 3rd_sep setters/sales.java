class Sales{

	int id;
	String name;
	double salary;
	int target;
	double incentive;

	void setId(int a)
	{
		this.id=a;
	}
	
	void setName(String a)
	{
		this.name=a;
	}

	void setSalary(double a)
	{
		this.salary=a;
	}
	
	void setTarget(int a)
	{
		this.target=a;
	}

	void setIncentive(int a)
	{
		if(target>50000)
		{
			this.incentive=this.salary*0.10;
		}
		else if(target>30000)
		{
			this.incentive=this.salary*0.10;
		}
		else if(target>15000)
		{
			this.incentive=this.salary*0.10;
		}

	}


}
class TestSales
{
	public static void main(String[] args)
	{
		Sales s1;
		s1=new Sales();
		
		s1.setId(10);
		System.out.println(s1.id);
		
		s1.setName("Janhavi");
		System.out.println(s1.name);

		s1.setSalary(35000);
		System.out.println(s1.salary);

		s1.setTarget(50000);
		System.out.println(s1.target);
		
		s1.setIncentive(s1.gettarget());
		System.out.println(s1.incentive);
		System.out.println("total salary"+(s1.salary+s1.incentive));
	}



}