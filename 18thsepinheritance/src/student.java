
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
		System.out.println("placed student ");
		this.fbs_roll_no=0;
		this.distance=0;
		this.name="not given";
		student.student_count++;  // jab kbhi stu ka obj bnega to const ko call jyega to const mai y kiya

	}
	
	student(int a,int b,String c)
	{
		System.out.println(" student para");
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

} // student ends here


class placedStudent extends student // is-a step1
{

	String deg;
	String company;
	
	placedStudent() {
		super(); // step2
		System.out.println("placed student default");
		this.deg="notf";
		this.company="notf";
		
	}

	placedStudent(int rollno,int distance ,String name ,String deg, String company)  
	{
		
		super(rollno,distance,name); //step2 
		System.out.println("placed student para");
		this.deg = deg;
		this.company = company;
	}

	String getDeg() {
		return deg;
	}

	void setDeg(String deg) {
		this.deg = deg;
	}

	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}
	
	
	void display()
	{
		super.display(); // step 3
		System.out.println("designation "+this.deg);
		System.out.println("company"+this.company);
	}
}

class teststudent{

	public static void main(String[] args)
	{
		student s1=new student(101,90,"pallavi");
		student s2=new student(101,100,"janhavi");
		
		placedStudent ps1=new placedStudent(101,110,"rucha","developer","wipro");
		ps1.display();
		System.out.println("count"+student.getcount());
		
		
	}

	
}