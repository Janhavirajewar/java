class Student{


	int fbs_roll_no;
	int marks;
	String name;


	Student()
	{
		this.fbs_roll_no=0;
		this.marks=0;
		this.name="not given";
	}
	
	Student(int a,int b,String c)
	{
		this.fbs_roll_no=a;
		this.marks=b;
		this.name=c;
	}


	void setrollno(int a)
	{
		this.fbs_roll_no=a;
	}
	
	void setmarks(int a)
	{
		this.marks=a;
	}

	void setname(String a)
	{
		this.name=a;
	}
	
	int getrollno()
	{
		return this.fbs_roll_no;
	}
	
	int getmarks()
	{
		return this.marks;
	}
	
	String getname()
	{
		return this.name;
	}
	
	void display()
	{
		System.out.println("Roll No: " + this.fbs_roll_no + "\tMarks: " + this.marks + "\tName: " + this.name);
	}

}
class testStudent{

	public static void main(String[] args)
	{
		Student s1;
		s1=new Student(101,90,"pallavi");
		s1.display();		


		s1.setrollno(1);
		
		s1.setmarks(70);
		

		s1.setname("Rani");
		
		s1.display();
	}
}