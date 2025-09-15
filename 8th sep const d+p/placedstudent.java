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

	PlacedStudent()
	{
		this.c_name="not specified";
		this.distance=0;
		this.designation="not mention";
	}


	PlacedStudent(String a,int b,String c)
	{
		this.c_name=a;
		this.distance=b;
		this.designation=c;
	}



	void display()
	{
		System.out.println("\tcompany:" +this.c_name+ "\tdistance :" +this.distance+ "\tdesignation :" +this.designation);
	}
}
class TestPlacedStudent
{
	public static void main(String[] args)
	{
	PlacedStudent p1;
	p1=new PlacedStudent();
	p1.display();

	
	p1.setcname("TCS");
		
	p1.setdistance(50);
	

	p1.setdesignation("Intern");
	
	p1.display();

	PlacedStudent p2;
	p2=new PlacedStudent("Infosis",30,"Developer");
	p2.display();

	
	p2.setcname("wipro");
		
	p2.setdistance(40);
	

	p2.setdesignation("Tester");
	
	
	p2.display();


	}

}