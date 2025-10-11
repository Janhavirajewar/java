package p1;


import java.util.*;

class employe2
{
    int id;
    String name;
    double salary;

    // Default constructor
   employe2() 
    {
    	System.out.println("employe by defalult");
        this.id = 0;
        this.name = "Not Found";
        this.salary = 0.0;
    }

    // Parameterized constructor
    employe2(int id, String name, double salary) 
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
    
     public boolean equals(Object obj)
     {
   	 System.out.println("inside equal");
   	 
   	  employe2 e1=(employe2)obj;
    	  if(this.id == e1.id)
    	  {
    		  return true;
   		  
   	  }
   	  else
   	  {
   		  return false;
   	  }
    	  
    }
     
}

class admin2 extends employe2
{
	double allowence;

	admin2() {
		super();
		System.out.println("admin by def");
		this.allowence=1000;
		
	}

	admin2(int id,String name,double salary,double allowence) {
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
	
	public String toString()
	{
		return super.toString() + ", allowance" +this.allowence;
	}
	

	
} // Admin ends here

class hrr2 extends employe2 // hr is-a employe 
{
	double commission;
	
	

	hrr2() {
		super(); // step 2 use default const of super class 
		System.out.println("hr by def");
		this.commission=7000;
	}



	hrr2(int id,String name,double salary,double commission) {
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
		return super.toString() + ",commission"+this.commission;
		
	}
	
} // class hr ends here

class mng2 extends employe2  // single inheritance
{
	double target;
	double incentive;
	
	mng2() {
		super();
		System.out.println("sales man by def");
		this.target=1100;
		this.incentive=500;
	}

	mng2(int id,String name,double salary,double target, double incentive) {
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
		return super.toString() + ",Target"+this.target + ",Incentive"+ this.incentive;
		
	}
	
} //sales manager ends here 

class demooo {
	
    public static void main(String[] args) {
       
    	
       LinkedList<employe2> a1= new LinkedList<employe2>();
      
        a1.add(new admin2(101 ,"prashant",70000,1000));
        
        a1.add(new hrr2(102,"janhavi",50000,400));
        
        a1.add(new mng2(103,"sakshi", 60000,700,8000));
       
       
       
        	 System.out.println(a1);
        	 
//        	 System.out.println(a1.get(8));// it gives error : Arrayindexout of bounce
        
        	 if(a1.contains(new mng2(103,"sakshi", 60000,700,8000)))
        	 {
        		 System.out.println("found");
        	 }
        	 else
        	 {						
        		System.out.println("not found"); 
        	 }
      
       
    }
}
