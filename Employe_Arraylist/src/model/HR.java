
package model;

public class HR extends Employe{

	double commission;
	
	public HR() {
		super();
		this.commission = 0;
	}
	
	
	public HR(int id, String name, double salary,double commission) {
		super(id,name,salary);
		this.commission = commission;
	}

	

	public double getCommission() {
		return commission;
	}


	public void setCommission(double commission) {
		this.commission = commission;
	}


	
	@Override
	public String toString() {		
		return super.toString()+"\nCommission:" +commission;
	}


	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.getSalary()+this.commission;
	}

}
