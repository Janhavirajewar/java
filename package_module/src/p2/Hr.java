package p2;

import p1.Employe;

public class Hr extends Employe {

	double commission;

	public Hr() {
		super();
		System.out.println("hr default");
		this.commission=0;
				
	}

	public Hr(int id,String name,double salary,double commission) {
		super(id,name,salary);
		System.out.println("para hr");
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	
	public void display()
	{
		super.display();
		System.out.println("commission ="+this.commission);
	}
	
	public double calsal()
	{
		return this.getSalary()+this.getCommission();
				
	}
	
}
