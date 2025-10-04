class employe{

	int id;
	String name;
	double salary;


	void setid(int a)
	{
		this.id=a;
	}
	
	void setname(String a)
	{
		this.name=a;
	}

	void setsalary(double a)
	{
		this.salary=a;
	}
	
	int getid()
	{
		return this.id;
	}
	
	String  getname()
	{
		return this.name;
	}

	double getsalary()
	{
		return this.salary;
	}
	
	employe()
	{
		this.id=1;
		this.name="janu";
		this.salary=35000;
	}


	employe(int a,String b,double c)
	{
		this.id=a;
		this.name=b;
		this.salary=c;
	}


	void display()
	{
		System.out.println("id: " + this.id + "\tname: " + this.name + "\tsalary: " + this.salary);

	}
}
class testemploye
{	
	public static void main(String[] args)
	{

		 employe[] arr = new employe[5];

         for (int i = 0; i < arr.length; i++)
	 {
		System.out.println("array"+arr[i]);   // null pointer exception coz only objects banenge employe ke
            
        }

	for (int i = 0; i < arr.length; i++) 
	{
            arr[i].display(); // show null
        }
	
				
	}

    
        arr[0] = new employe();   // yana employe ko call hoga nd arr[0] employe ko point krega 
        arr[1] = new employe(2, "Janhavi", 40000);
	
	System.out.println("array"+arr[0]);
	
        arr[2] = new employe(3, "Raj", 50000);
        arr[3] = new employe(4, "Neha", 60000);
        arr[4] = new employe(5, "Amit", 45000);

	for (int i = 0; i < arr.length; i++) 
	{
            arr[i].display(); // now shows proper details
        }
	
				
	}

}