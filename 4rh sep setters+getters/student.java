class Student{


	int fbs_roll_no;
	int marks;
	String name;

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


}
class testStudent{

	public static void main(String[] args)
	{
		Student s1;
		s1=new Student();
		
		s1.setrollno(1);
		System.out.println(s1.getrollno());
		s1.setmarks(70);
		System.out.println(s1.getmarks());

		s1.setname("Rani");
		System.out.println(s1.getname());

	}
}