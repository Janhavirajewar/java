package p3;

import java.util.TreeSet;

 class employe implements Comparable<employe>
{
    int id;
    String name;
    double salary;

    // Default constructor
   employe() 
    {
    	System.out.println("employe by defalult");
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    // Parameterized constructor
    employe(int id, String name, double salary) 
    {
    	System.out.println("employe parameterized");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter methods
    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    
     public String toString() {
        return "ID = " + this.id + ", Name = " + this.name + ", Salary = " + this.salary;
    }

     
	public int compareTo(employe o) {
		
		// TODO Auto-generated method stub
		System.out.println("inside compareTo");
		return this.id-o.id;
	}

	
	
//     public int compareTo(Object o)
//     {
//    	 employe e1 = (employe)o ;
////		return this.id - e1.id;
//				
////		return (int) (this.salary - e1.salary);
//    	 return this.name.compareTo(e1.name);
//    	 
//     }

	
}

class admin extends employe
{
	double allowence;

	admin() {
		super();
		System.out.println("admin by def");
		this.allowence=0;
		
	}

	admin(int id,String name,double salary,double allowence) {
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
	
	public String toString() {
	    return super.toString() + "\nallowance = " + this.allowence;
	}
	
	

	
} // Admin ends here

class hrr extends employe // hr is-a employe 
{
	double commission;
	
	hrr() {
		super(); // step 2 use default const of super class 
		System.out.println("hr by def");
		this.commission=7000;
	}



	hrr(int id,String name,double salary,double commission) {
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
	
	public String toString()
	{
		return super.toString() + ",\ncommission"+this.commission;
		
	}
	
} // class hr ends here

class mng extends employe  // single inheritance
{
	double target;
	double incentive;
	
	mng() {
		super();
		System.out.println("sales man by def");
		this.target=1100;
		this.incentive=500;
	}

	mng(int id,String name,double salary,double target, double incentive) {
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
	 
	public String toString()
	{
		return super.toString() + ",Target"+this.target + ",\nIncentive"+ this.incentive;
		
	}
	
} //sales manager ends here 

class Testtreeset {
	
    public static void main(String[] args) {
       
        TreeSet<employe> a1= new TreeSet<employe>();
      
        a1.add(new admin(101 ,"prashant",70000,1000));
        
        a1.add(new hrr(104,"janhavi",50000,400));
        
        a1.add(new mng(103,"sakshi", 60000,700,8000));
       
        	System.out.println(a1);

        	if(a1.contains(new admin(101 ,"prashant",70000,1000)))
        	{
        		System.out.println("found");
        	}else {
        		System.out.println("not f");
        	}
        	
        
    }
}

