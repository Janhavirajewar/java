class student{


	int fbs_roll_no;
	int distance;
	String name;
	static int student_count;

	static{
		student_count=0;
	}


	student()
	{
		this.fbs_roll_no=0;
		this.distance=0;
		this.name="not given";
		student.student_count++;  // jab kbhi stu ka obj bnega to const ko call jyega to const mai y kiya

	}
	
	student(int a,int b,String c)
	{
		this.fbs_roll_no=a;
		this.distance=b;
		this.name=c;
		student_count++;
	}


	void setrollno(int a)
	{
		this.fbs_roll_no=a;
	}
	
	void setdistance(int a)
	{
		this.distance=a;
	}

	void setname(String a)
	{
		this.name=a;
	}
	
	int getrollno()
	{
		return this.fbs_roll_no;
	}
	
	int getdistance()
	{
		return this.distance;
	}
	
	String getname()
	{
		return this.name;
	}

	static int  getcount()
	{
		 return student.student_count;	
	}
	
	void display()
	{
		System.out.println("Roll No: " + this.fbs_roll_no + "\tdistance: " + this.distance + "\tName: " + this.name);// count hataya q u wo unstatic mai access ho rhat tha coz wo object ho rha tha class level access krna tha to getcount ko static kiya

	}

}
class teststudent{

	public static void main(String[] args)
	{
		student s1;
		s1=new student(101,90,"pallavi");
		s1.setrollno(1);
		
		s1.setdistance(70);
		
		s1.setname("Rani");
		
		s1.display();

		student s2=new student(102,25,"sakshi");	
		
		s2.setrollno(2);
		s2.setdistance(100);
		s2.setname("raju");
		s2.display();

		 System.out.println("Total number of student objects created = " + student.getcount());
		
	}
}