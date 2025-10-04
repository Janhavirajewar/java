
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
		System.out.println("emp by def");
		this.id=1;
		this.name="janu";
		this.salary=35000;
	}


	employe(int a,String b,double c)
	{
		System.out.println("emp para");
		this.id=a;
		this.name=b;
		this.salary=c;
	}


	void display()
	{
		System.out.println("id: " + this.id + "\tname: " + this.name + "\tsalary: " + this.salary);

	}
} // employe end here

class Admin extends employe
{
	double allowence;

	Admin() {
		super();
		System.out.println("admin by def");
		this.allowence=1000;
		
	}

	Admin(int id,String name,double salary,double allowence) {
		super(id,name,salary);
		System.out.println("admin para");
		this.allowence = allowence;
	}

	double getAllowence() {
		return allowence;
	}

	void setAllowence(double allowence) {
		this.allowence = allowence;
	}
	
	void display()
	{
		super.display();
		System.out.println("allowance"+this.allowence);
	}
	
	
} // Admin ends here

class hr extends employe // hr is-a employe 
{
	double commission;
	
	

	hr() {
		super(); // step 2 use default const of super class 
		System.out.println("hr by def");
		this.commission=7000;
	}



	hr(int id,String name,double salary,double commission) {
		super(id,name,salary); // callpara const of super class
		System.out.println("hr para");
		this.commission = commission;
	}

	double getCommission() {
		return commission;
	}



	void setCommission(double commission) {
		this.commission = commission;
	}
	
	void display()
	{
		super.display();
		System.out.println("commission"+this.commission);
	}
	
} // class hr ends here

class salesManager extends employe  // single inheritance
{
	double target;
	double incentive;
	
	salesManager() {
		super();
		System.out.println("sales man by def");
		this.target=1100;
		this.incentive=500;
	}

	salesManager(int id,String name,double salary,double target, double incentive) {
	super(id,name,salary);
		System.out.println("salesman para");
		this.target = target;
		this.incentive = incentive;
	}

	double getTarget() {
		return target;
	}

	void setTarget(double target) {
		this.target = target;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	 
	void display()
	{
		super.display();
		System.out.println("targer ="+this.target);
		System.out.println("incentive ="+this.incentive);
	}
} //sales manager ends here 



class testemploye
{	
	public static void main(String[] args)
	{
		employe e1;
		e1=new employe(1,"janhavi",30000);
		e1.display();
		
		e1=new hr(2,"pallavi",40000,700);
		e1.display();
		
		e1=new salesManager(3,"eshan",500000,80000,200);
		e1.display();
		
		employe e2;
		e2=new employe();
		e2.display();
		
		e2=new hr();
		e2.display();
		
		e2=new salesManager();
		e2.display();
		
		
		
	}

	
	

}