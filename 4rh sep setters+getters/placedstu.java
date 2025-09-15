class PlacedStudent
{
	String c_name;
	int distance;
	String designation;
	
	void setcname(String a)
	{
		this.c_name=a;
	}
	
	void setdistance(int a)
	{
		this.distance=a;
	}

	void setdesignation(String a)
	{
		this.designation=a;
	}
	
	String getcname()
	{
		return this.c_name;
	}
	
	int getdistance()
	{
		return this.distance;
	}
	
	String getdesignation()
	{
		return this.designation;
	}

	void display()
	{
		System.out.println("company:" +this.c_name+ "distance" +this.distance+ "designation" +this.designation);
	}
}
class TestPlacedStudent
{
	public static void main(String[] args)
	{
	PlacedStudent p1;
	p1=new PlacedStudent();
	
	p1.setcname("TCS");
	System.out.println(p1.getcname());
	
	p1.setdistance(50);
	System.out.println(p1.getdistance());

	p1.setdesignation("Intern");
	System.out.println(p1.getdesignation());
	
	p1.display();
}

}