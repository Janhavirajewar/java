package p3;


import java.util.HashSet;

class student {

	int id;
	String name;
	int marks;
	
	
	
	student() {
		super();
		this.id=0;
		this.name="n";
		this.marks=0;
	}



	student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	public boolean equals(Object obje)
	{
		System.out.println("equals");
		student s1=(student)obje;
		if(this.id==s1.id)
		{
			return true;

		}
		else
		{
			return false;
		}
		
	}
	
	@Override // check uniquness
	public int hashCode() {
	    System.out.println("hashCode called");
	    return this.id;
	}

	
	
}

class hashset
{
	public static void main(String[] args)
	{
		
		HashSet<student> s1=new HashSet<student>();
		
		s1.add(new student(1,"prashant",80));
		s1.add(new student(2,"janhavi",82));
		s1.add(new student(7,"parth",90));
		s1.add(new student(1,"prashant",80));
		s1.add(new student(1,"prashant",80));
		s1.add(new student(2,"janhavi",82));
		s1.add(new student(7,"parth",90));
				
		if(s1.contains(new student(7,"parth",90)))
		{
			
			System.out.println("f");
		}
		
		else
			
		{
			System.out.println("notf ");
		}
		
		// print student
		System.out.println(s1);
	}
}
