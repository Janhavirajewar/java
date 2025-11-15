package p4;

import java.util.Scanner;
import p1.Account;
import p2.SavingAcc;
import p3.Bank;
import p2.Current_Acc;
import p2.Salary_Acc;
import p2.Loan_Acc;

public class TestBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(); // uses your array-based implementation

        int mainChoice;
        System.out.println("\n......WELCOME BANK MANAGEMENT SYSTEM.......\n");

        do {
            System.out.println("===== BANK EMPLOYEE MAIN MENU =====\n");
            System.out.println("1. Over the Counter Activities");
            System.out.println("2. Show All Transactions (Employee Only)");
            System.out.println("3. Display All Accounts Details");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {

                // ========== 1. Over the Counter ==========
                case 1:
                    int subChoice1;
                    do {
                        System.out.println("\n--- Over the Counter Activities ---");
                        System.out.println("1. Existing User");
                        System.out.println("2. New User Account Opening");
                        System.out.println("3. Close Existing Account");
                        System.out.println("4. Update Account");
                        System.out.println("5. Return to Main Menu");
                        System.out.print("\nEnter your choice: ");
                        subChoice1 = sc.nextInt();
                        sc.nextLine();

                        switch (subChoice1) {

                            // ========== Existing User ==========
                            case 1:
                                System.out.print("\nEnter Account Number: ");
                                String accNo = sc.nextLine();
                                Account acc = bank.searchByAccNo(accNo);

                                if (acc == null) {
                                    System.out.println("❌ Account not found!\n");
                                    break;
                                }
                                System.out.println("\nAccount Exists !!!");

                                if (acc instanceof SavingAcc) {
                                    int choice;
                                    do {
                                        System.out.println("\n--- Saving Account Menu ---");
                                        System.out.println("1. Deposit");
                                        System.out.println("2. Withdraw");
                                        System.out.println("3. Check Balance");
                                        System.out.println("4. Return");
                                        System.out.print("\nEnter your choice: ");
                                        choice = sc.nextInt();

                                        switch (choice) {
                                            case 1:
                                                System.out.print("Enter deposit amount: ");
                                                double dep = sc.nextDouble();
                                                bank.deposit(accNo, dep);
                                               // System.out.println("Deposit successfully");
                                                break;

                                            case 2:
                                                System.out.print("Enter withdrawal amount: ");
                                                double w = sc.nextDouble();
                                                bank.withdraw(accNo, w);
                                                break;

                                            case 3:
                                                System.out.println("\nCurrent Balance: " + acc.getBalance());
                                                break;

                                            case 4:
                                                break;

                                            default:
                                                System.out.println("Invalid choice!");
                                        }
                                    } while (choice != 4);

                                } else if (acc instanceof Current_Acc) {
                                    Current_Acc ca = (Current_Acc) acc;
                                    int choice;
                                    do {
                                        System.out.println("\n--- Current Account Menu ---");
                                        System.out.println("1. Deposit");
                                        System.out.println("2. Withdraw");
                                        System.out.println("3. Check Balance");
                                        System.out.println("4. Return");
                                        System.out.print("\nEnter your choice: ");
                                        choice = sc.nextInt();

                                        switch (choice) {
                                            case 1:
                                                System.out.print("Enter deposit amount: ");
                                                double dep = sc.nextDouble();
                                                bank.deposit(accNo, dep);
                                                break;

                                            case 2:
                                                System.out.print("Enter withdrawal amount: ");
                                                double w = sc.nextDouble();
                                                bank.withdraw(accNo, w);
                                                break;

                                            case 3:
                                                System.out.println("\nCurrent Balance: " + ca.getBalance());
                                                break;

                                            case 4:
                                                break;

                                            default:
                                                System.out.println("Invalid choice!");
                                        }
                                    } while (choice != 4);

                                }
                                else if (acc instanceof Salary_Acc) {
                                    Salary_Acc sa = (Salary_Acc) acc;
                                    int choice;
                                    do {
                                        System.out.println("\n--- Salary Account Menu ---");
                                        System.out.println("1. Deposit");
                                        System.out.println("2. Withdraw");
                                        System.out.println("3. Check Balance");
                                        System.out.println("4. Return");
                                        System.out.print("\nEnter your choice: ");
                                        choice = sc.nextInt();

                                        switch (choice) {
                                            case 1:
                                                System.out.print("Enter deposit amount: ");
                                                double dep = sc.nextDouble();
                                                bank.deposit(accNo, dep);
                                                break;

                                            case 2:
                                                System.out.print("Enter withdrawal amount: ");
                                                double w = sc.nextDouble();
                                                bank.withdraw(accNo, w);
                                                break;

                                            case 3:
                                                System.out.println("\nCurrent Balance: " + sa.getBalance());
                                                break;

                                            case 4:
                                                break;

                                            default:
                                                System.out.println("Invalid choice!");
                                        }
                                    } while (choice != 4);

                                } else if (acc instanceof Loan_Acc) {
                                    Loan_Acc la = (Loan_Acc) acc;
                                    int choice;
                                    do {
                                        System.out.println("\n--- Loan Account Menu ---");
                                        System.out.println("1. Deposit Loan Payment");
                                        System.out.println("2. Check Outstanding");
                                        System.out.println("3. Return");
                                        System.out.print("\nEnter your choice: ");
                                        choice = sc.nextInt();

                                        switch (choice) {
                                            case 1:
                                                System.out.print("Enter repayment amount: ");
                                                double rep = sc.nextDouble();
                                                bank.deposit(accNo, rep);
                                                break;

                                            case 2:
                                                System.out.println("\nOutstanding Amount: " + la.getBalance());
                                                break;

                                            case 3:
                                                break;

                                            default:
                                                System.out.println("Invalid choice!");
                                        }
                                    } while (choice != 3);
                                }
                                break;

                            // ========== New Account Opening ==========
                            case 2:
                                System.out.println("\nSelect Account Type:");
                                System.out.println("1. Saving");
                                System.out.println("2. Current");
                                System.out.println("3. Salary");
                                System.out.println("4. Loan");
                                System.out.print("\nEnter type: ");
                                int type = sc.nextInt();
                                sc.nextLine();

                                System.out.print("Enter Account Number: ");
                                String newNo = sc.nextLine();

                                System.out.print("Enter Holder Name: ");
                                String name = sc.nextLine();

                                System.out.print("Enter Opening Balance: ");
                                double bal = sc.nextDouble();

                                switch (type) {
                                    case 1:
                                        System.out.print("Enter Interest Rate: ");
                                        double rate = sc.nextDouble();
                                        System.out.print("Enter Min Balance: ");
                                        double minBal = sc.nextDouble();
                                        bank.add(new SavingAcc(newNo, name, bal, "IFSC100", rate, minBal));
                                        break;

                                    case 2:
                                        System.out.print("Enter Overdraft Limit: ");
                                        double od = sc.nextDouble();
                                        bank.add(new Current_Acc(newNo, name, bal, "IFSC200", od));
                                        break;

                                    case 3:
                                        bank.add(new Salary_Acc(newNo, name, bal, "IFSC300"));
                                        break;

                                    case 4:
                                        System.out.print("Enter Loan Amount: ");
                                        double loanAmt = sc.nextDouble();
                                        System.out.print("Enter Interest Rate: ");
                                        double loanRate = sc.nextDouble();
                                        bank.add(new Loan_Acc(newNo, name, bal, "IFSC400", loanAmt, loanRate));
                                        break;

                                    default:
                                        System.out.println("Invalid account type!");
                                }
                                break;

                            // ========== Close Account ==========
                            case 3:
                                System.out.print("Enter Account Number to close: ");
                                String closeNo = sc.nextLine();
                                bank.remove(closeNo);
                                break;

                            case 4:
                            {
                            	System.out.print("Enter Account Number to Update: ");
                            	String accno = sc.nextLine();

                            	System.out.print("Enter New Balance: ");
                            	double newBal = sc.nextDouble();

                            	// Call updateAccount() from Bank class
                            	bank.updateAccount(accno, newBal);

                            }
                                
                            case 5:
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (subChoice1 != 5);
                    break;

                // ========== 2. Show All Transactions ==========
                case 2:
                    bank.generateDailyReport();
                    break;

                // ========== 3. Display All Accounts ==========
                case 3:
                    bank.displayAll();
                    break;

                // ========== 4. Exit ==========
                case 4:
                	System.out.println();
                    System.out.println("Exiting Bank Management System. Goodbye!!!!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (mainChoice != 4);

        sc.close();
    }
}
