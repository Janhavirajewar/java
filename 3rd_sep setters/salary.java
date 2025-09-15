class Emp{
	
	int id;
	String name;
	double salary;
	
	void setId(int a){

		this.id=a;
		
	}

	void setName(String a){

		this.name=a;
		
	}

	void setSalary(double a){

		this.salary=a;
		
	}


}

class TestEmp
{
	public static void main(String[] args)
	{
		Emp e1;
		e1=new Emp();
		
		e1.setId(1);
		System.out.println(e1.id);

		e1.setName("Eshan");
		System.out.println(e1.name);

		e1.setSalary(80000.00);
		System.out.println(e1.salary);
				
		
		
	}


}