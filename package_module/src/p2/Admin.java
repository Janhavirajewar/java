package p2;

import p1.Employe;

public class Admin extends Employe {

	double allowance;

	public Admin() {
		super();
		System.out.println("admin default");
		this.allowance=0;
				
	}

	public Admin(int id,String name,double salary,double allowance) {
		super(id,name,salary);
		System.out.println("para admin");
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double commission) {
		this.allowance = commission;
	}

	
	public void display()
	{
		super.display();
		System.out.println("allowance ="+this.allowance);
	}
	
	public double calsal()
	{
		return this.getSalary()+this.getAllowance();
				
	}
	
}
