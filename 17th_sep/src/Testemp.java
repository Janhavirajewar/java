class Employe 
{	
		int empId;
		String empName;
		double salary;
		
		Employe() { //default constructor
			
			this.empId=101;
			this.empName="not given";
			this.salary=4000;
		}

		Employe(int emp_id, String name, double salary) { 
			
//			parameterized constructor
			
			this.empId = emp_id;
			this.empName = name;
			this.salary = salary;
		}

		int getEmpId() {
			return empId;
		}

		void setEmpId(int empId) {
			this.empId = empId;
		}

		String getEmpName() {
			return empName;
		}

		void setEmpName(String empName) {
			this.empName = empName;
		}

		double getSalary() {
			return salary;
		}

		void setSalary(double salary) {
			this.salary = salary;
		}
		
		
	void display()
	{
		System.out.println("ID :"+this.empId);
		System.out.println("NAME :"+this.empName);
		System.out.println("SALARY :"+this.salary);
	}

	
}
class Testemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1=new Employe();
		e1.setEmpId(10);
		e1.display();
		
	}

}
