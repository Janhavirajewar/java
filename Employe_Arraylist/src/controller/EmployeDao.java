
package controller;

import java.util.ArrayList;

import model.Admin;
import model.Employe;
import model.HR;
import model.SalesManager;

public class EmployeDao {
	
	
	static ArrayList<Employe> employees=new ArrayList<Employe>();
	
	static 
	{		
		employees.add( new HR(101, "janhavi", 50000, 5000));
		employees.add( new HR(102, "sunita", 48000, 4500));
		employees.add( new HR(103, "soni", 47000, 4000));
		employees.add( new SalesManager(201, "Karan", 60000, 12, 8000));
		employees.add( new SalesManager(202, "Meena", 58000, 15, 7500));
		employees.add( new SalesManager(203, "prashant", 62000, 10, 9000));
		employees.add( new Admin(301, "sakshi", 70000, 10000));
		employees.add( new Admin(302, "Isha", 68000, 9500));
		employees.add( new Admin(303, "pallavi", 72000, 11000));
	
	}
	
	
	public boolean addEmployee(Employe e) 
	{
	       return employees.add(e);
    }
	

    public Employe searchEmployeeById(int id)
    {
        for (int i = 0; i < employees.size(); i++)
        {
            if (employees.get(i).getId() == id)
            {
                return employees.get(i);
            }
        }
        return null;
    }
  
    public boolean updateEmployee(int id, double newSalary)
    {
        Employe emp = searchEmployeeById(id);
        if (emp != null)
        {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }
  
    public boolean deleteEmployee(int id) 
    {
    	 Employe emp = searchEmployeeById(id);
         if (emp != null) 
         {
        	 employees.remove(emp);
             return true;
         }
         return false;
    }
 
    public  ArrayList<Employe> getAllEmployee()
    {        
        return employees;
    }
}
