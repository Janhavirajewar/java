package p1;

public abstract class Employe {
	
	int id;
	String name;
	double salary;

	public Employe() {
		System.out.println("default employe");
		this.id=0;
		this.name="default name";
		this.salary=0;
		
	}

	public Employe(int id, String name, double salary) {
		System.out.println("para employe");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("id ="+this.id);
		System.out.println("name ="+this.name);
		System.out.println("salary ="+this.salary);
	}
	
	public abstract double calsal();

}// employe ends here
