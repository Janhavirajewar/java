
package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.EmployeDao;
import controller.UserDAO;
//import controller.UserDaO;
import model.Admin;
import model.Employe;
import model.HR;
import model.SalesManager;
import model.User;

public class testemploye {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeDao empDao = new EmployeDao();
        UserDAO userDao = new UserDAO();
        System.out.println("********************  Employee Management System  ********************");
        int choice;
        do {
            System.out.println("\n===== LOGIN DASHBOARD =====");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Register New User");
            System.out.println("4. Forgot Password");
            System.out.println("0. Exit");
            System.out.print("\nEnter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1:
                login(sc, userDao, empDao, "Admin");
                break;
            case 2:
                login(sc, userDao, empDao, "User");
                break;
            case 3:
                register(sc, userDao);
                break;
            case 4:
                forgotPassword(sc, userDao);
                break;
            case 0:
                System.out.println("Exiting System... Goodbye!");
                break;
            default:
                System.out.println("❌ Invalid choice!");
            }
        } while (choice != 0);
    }

    
    
	    // ---------------- LOGIN HANDLER ----------------
	    public static void login(Scanner sc, UserDAO userDao, EmployeDao empDao, String roleType) {
	        System.out.println("\n===== " + roleType.toUpperCase() + " LOGIN =====");
	        System.out.print("Enter Username: ");
	        String username = sc.nextLine();
	        System.out.print("Enter Password: ");
	        String password = sc.nextLine();
	
	        User u = userDao.validateLogin(username, password, roleType);
	        if (u == null) {
	            System.out.println("❌ Invalid credentials!");
	            return;
	        }
	
	        System.out.println("✅ Welcome " + u.getUsername());
//	        if (u.getRole().equalsIgnoreCase("Admin"))
//	            adminDashboard(sc, empDao);
//	        else
	            //userDashboard(empDao);
	            if (u.getRole().equalsIgnoreCase("Admin"))
	                adminDashboard(sc, empDao);
	            else
	                userDashboard(sc, empDao);


	    }

    public static void register(Scanner sc, UserDAO userDao) {
        System.out.println("\n===== REGISTER NEW USER =====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        System.out.print("Enter Role (Admin/User): ");
        String role = sc.nextLine();

        if (userDao.registerUser(username, password, role))
            System.out.println("✅ Registered Successfully!");
        else
            System.out.println("❌ Username already exists!");
    }

    public static void forgotPassword(Scanner sc, UserDAO userDao) {
        System.out.println("\n===== FORGOT PASSWORD =====");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if (userDao.resetPassword(username, sc))
            System.out.println("✅ Password Reset Successfully!");
        else
            System.out.println("❌ Username not found!");
    }
	


    
    
    public static void adminDashboard(Scanner sc, EmployeDao dao) {
        ArrayList<Employe> employees = null;
        int choice;
        do {              
			System.out.println("\n===== ADMIN DASHBOARD =====\n");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Display All Employees");
			System.out.println("6. Calculate Salary of Each Employee");
			System.out.println("0. Exit");
			System.out.print("\nEnter your choice  : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Employee Type (1-Admin, 2-HR, 3-SalesManager) : ");
				int type = sc.nextInt();

				System.out.print("\nEnter ID          : ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name        : ");
				String name = sc.nextLine();
				System.out.print("Enter Base Salary : ");
				double salary = sc.nextDouble();

				
				if (type == 1) {
					System.out.print("Enter Allowance   : ");
					double allowance = sc.nextDouble();
					dao.addEmployee(new Admin(id, name, salary, allowance));
					System.out.println("Admin added successfully!");
				} 
				else if (type == 2) {
					System.out.print("Enter Commission  : ");
					double comm = sc.nextDouble();
					dao.addEmployee(new HR(id, name, salary, comm));
					System.out.println("HR added successfully!");
				} 
				else if (type == 3) {
					System.out.print("Enter Target              : ");
					int target = sc.nextInt();
					System.out.print("Enter Incentive per Target: ");
					double incentive = sc.nextDouble();
					dao.addEmployee(new SalesManager(id, name, salary, target, incentive));
					System.out.println("Sales Manager added successfully!");
				} else 
					System.out.println("Invalid Type!");				
				break;

			case 2:
				System.out.print("Enter ID to search : ");
				id = sc.nextInt();
				Employe e = dao.searchEmployeeById(id);
				if (e != null)
					System.out.println("Found " + e);
				else
					System.out.println("Employee not found.");
				break;

				
			case 3:
				System.out.print("Enter ID to update: ");
				id = sc.nextInt();
				System.out.print("Enter New Salary  : ");
				salary = sc.nextDouble();
				if (dao.updateEmployee(id, salary))
					System.out.println("Updated successfully!");
				else
					System.out.println("Employee not found.");
				break;
				

			case 4:
				System.out.print("Enter ID to delete : ");
				id = sc.nextInt();
				if (dao.deleteEmployee(id))
					System.out.println("Deleted successfully!");
				else
					System.out.println("Employee not found.");
				break;

				
			case 5:
			    employees = dao.getAllEmployee();

			    if (employees == null || employees.isEmpty()) {
			        System.out.println("\nNo employees found.");
			    } else {
			        System.out.println("\n================================= Employee List ==========================================================");
			        System.out.printf("%-5s %-20s %-15s %-15s %-15s %-15s\n",
			                "ID", "Name", "Type", "Base Salary", "Extra Info 1", "         Extra Info 2");
			        System.out.println("------------------------------------------------------------------------------------------------------------");

			        for (Employe emp : employees) {
			            String type1 = emp.getClass().getSimpleName();

			            // Default values
			            String extra1 = "-";
			            String extra2 = "-";

			            // Type-based info
			            if (emp instanceof model.Admin) {
			                extra1 = "Allowance : " + ((model.Admin) emp).getAllowance();
			            } else if (emp instanceof model.HR) {
			                extra1 = "Commission: " + ((model.HR) emp).getCommission();
			            } else if (emp instanceof model.SalesManager) {
			                extra1 = "Target    : " + ((model.SalesManager) emp).getTarget();
			                extra2 = "Incentive : " + ((model.SalesManager) emp).getIncentive();
			            }

			            System.out.printf("%-5d %-20s %-15s %-15.2f %-25s %-15s\n",
			                    emp.getId(), emp.getName(), type1, emp.getSalary(), extra1, extra2);
			        }

			        System.out.println("==========================================================================================================");
			    }
			    break;


				
			case 6:
			    employees = dao.getAllEmployee();

			    if (employees == null || employees.isEmpty()) {
			        System.out.println("\nNo employees found.");
			    } else {
			        System.out.println("\n================================= Employee Salary Details =================================");
			        System.out.printf("%-5s %-20s %-15s %-15s %-20s\n",
			                "ID", "Name", "Type", "Base Salary", "Final Salary");
			        System.out.println("-------------------------------------------------------------------------------------------");

			        for (Employe emp : employees) {
			            String type1 = emp.getClass().getSimpleName();
			            double finalSalary = emp.calculateSalary();

			            System.out.printf("%-5d %-20s %-15s %-15.2f %-20.2f\n",
			                    emp.getId(), emp.getName(), type1, emp.getSalary(), finalSalary);
			        }

			        System.out.println("===========================================================================================");
			    }
			    break;

				

			case 0:
				System.out.println("Exiting... Goodbye!");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 0);
    }
    // ---------------- USER DASHBOARD ----------------
 // ---------------- USER DASHBOARD (INTERACTIVE) ----------------
    public static void userDashboard(Scanner sc, EmployeDao dao) {
        int choice;
        do {
            System.out.println("\n===== USER DASHBOARD =====");
            System.out.println("1. View All Employees");
            System.out.println("2. Search Employee by ID");
            System.out.println("3. View Employee Salary Details");
            System.out.println("4. View Number of Employee Summary");
            System.out.println("0. Logout");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: {
                    ArrayList<Employe> employees = dao.getAllEmployee();
                    if (employees.isEmpty()) {
                        System.out.println("\nNo employees found!");
                    } else {
                        System.out.println("\n================================ EMPLOYEE LIST ================================");
                        System.out.printf("%-5s %-20s %-15s %-15s\n", "ID", "Name", "Type", "Base Salary");
                        System.out.println("-------------------------------------------------------------------------------");
                        for (Employe e : employees) 
                        {
                            String type = e.getClass().getSimpleName();
                            System.out.printf("%-5d %-20s %-15s %-15.2f\n",
                                    e.getId(), e.getName(), type, e.getSalary());
                        }
                        System.out.println("===============================================================================\n");
                    }
                    break;
                }

                case 2: {
                    System.out.print("Enter Employee ID to search: ");
                    int id = sc.nextInt();
                    Employe emp = dao.searchEmployeeById(id);
                    if (emp != null) {
                        System.out.println("\n✅ Employee Found!");
                        System.out.println("---------------------------------------------------");
                        System.out.println(emp);
                        System.out.println("---------------------------------------------------");
                    } else {
                        System.out.println("\n❌ Employee not found!");
                    }
                    break;
                }

                case 3: {
                    ArrayList<Employe> employees = dao.getAllEmployee();
                    if (employees.isEmpty()) {
                        System.out.println("\nNo employees found!");
                    } else {
                        System.out.println("\n====================== SALARY DETAILS ======================");
                        System.out.printf("%-5s %-20s %-15s %-15s %-15s\n",
                                "ID", "Name", "Type", "Base Salary", "Final Salary");
                        System.out.println("------------------------------------------------------------");
                        for (Employe e : employees) {
                            String type = e.getClass().getSimpleName();
                            double finalSalary = e.calculateSalary();
                            System.out.printf("%-5d %-20s %-15s %-15.2f %-15.2f\n",
                                    e.getId(), e.getName(), type, e.getSalary(), finalSalary);
                        }
                        System.out.println("============================================================\n");
                    }
                    break;
                }

                case 4: {
                    ArrayList<Employe> employees = dao.getAllEmployee();
                    if (employees.isEmpty()) {
                        System.out.println("\nNo employees found!");
                    } else {
                        long adminCount = employees.stream().filter(e -> e instanceof model.Admin).count();
                        long hrCount = employees.stream().filter(e -> e instanceof model.HR).count();
                        long smCount = employees.stream().filter(e -> e instanceof model.SalesManager).count();

                        System.out.println("\n===================== EMPLOYEE TYPE SUMMARY ===================");
                        System.out.printf("%-20s : %d\n", "Admin", adminCount);
                        System.out.printf("%-20s : %d\n", "HR", hrCount);
                        System.out.printf("%-20s : %d\n", "Sales Manager", smCount);
                        System.out.println("===============================================================\n");
                    }
                    break;
                }

                case 0:
                    System.out.println("\nLogging out... Returning to main menu!");
                    break;

                default:
                    System.out.println("\n❌ Invalid choice! Try again.");
            }

        } while (choice != 0);
    }

}
