package p4;

import java.util.Scanner;
import p1.Account;
import p2.SavingAcc;
import p3.Bank;
import p2.Current_Acc;
import p2.Salary_Acc;
import p2.Loan_Acc;

public class TestBank
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(); // Preloaded with some demo accounts

        int choice;
        System.out.println("\n......WELCOME BANK MANAGEMENT SYSTEM.......\n");
        do {
            System.out.println("===== BANK MENU ======");
            System.out.println("1. Add Account");
            System.out.println("2. Display All Accounts");
            System.out.println("3. Search Account by Number");
            System.out.println("4. Search Account by Name");
            System.out.println("5. Deposit");
            System.out.println("6. Withdraw");
            System.out.println("7. Update Account Balance");
            System.out.println("8. Exit");
            System.out.println(" 9.show transaactions");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            sc.nextLine(); // clear buffer
          
            switch (choice) {

                case 1:
                    System.out.println("\nSelect Account Type:");
                    System.out.println("1. Saving");
                    System.out.println("2. Current");
                    System.out.println("3. Salary");
                    System.out.println("4. Loan");
                    System.out.print("Enter type: ");
                    
                    int type = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Opening Balance: ");
                    double bal = sc.nextDouble();
                    sc.nextLine();


                    switch (type)
                    {
                        case 1:
                            System.out.print("Enter Interest Rate: ");
                            double rate = sc.nextDouble();
                            System.out.print("Enter Minimum Balance: ");
                            double minBal = sc.nextDouble();
                             bank.addAccount(new SavingAcc(accNo, name, bal, "IFSC100", rate, minBal));
                            break;

                        case 2:
                            System.out.print("Enter Overdraft Limit: ");
                            double od = sc.nextDouble();
                            bank.addAccount(new Current_Acc(accNo, name, bal, "IFSC200", od));
                            break;

                        case 3:
                            bank.addAccount(new Salary_Acc(accNo, name, bal, "IFSC300"));
                            break;

                        case 4:
                            System.out.print("Enter Loan Amount: ");
                            double loanAmt = sc.nextDouble();
                            System.out.print("Enter Interest Rate: ");
                            double loanRate = sc.nextDouble();
       
                            bank.addAccount(new Loan_Acc(accNo, name,bal,"IFSC400", loanAmt, loanRate));
                            break;
                        default:
                            System.out.println("Invalid account type!");
                    }
                    break;
                   
                case 2:
                    bank.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Account Number to Search: ");
                    String sAcc = sc.nextLine();
                    Account foundAcc = bank.searchByAccNo(sAcc);
                    if (foundAcc != null)
                        foundAcc.displayAccount();
                    else
                        System.out.println("Account not found!");
                    break;

                case 4:
                    System.out.print("Enter Account Holder Name to Search: ");
                    String sName = sc.nextLine();
                    Account foundName = bank.searchByName(sName);
                    if (foundName != null)
                        foundName.displayAccount();
                    else
                        System.out.println("Account not found!");
                    break;

                case 5:
                    System.out.print("Enter Account Number: ");
                    String depNo = sc.nextLine();
                    System.out.print("Enter Deposit Amount: ");
                    double depAmt = sc.nextDouble();
                    bank.deposit(depNo, depAmt);
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    String wNo = sc.nextLine();
                    System.out.print("Enter Withdrawal Amount: ");
                    double wAmt = sc.nextDouble();
                    sc.nextLine();
                    bank.withdraw(wNo, wAmt);
                    break;

                case 7:
                    System.out.print("Enter Account Number to Update: ");
                    String upNo = sc.nextLine();
                    System.out.print("Enter New Balance: ");
                    double newBal = sc.nextDouble();
                    bank.updateAccount(upNo, newBal);
                    break;

                case 8:
                    System.out.println("Exiting... Thank you!");
                    break;

                case 9:
                    System.out.print("Enter Account Number to View Transactions: ");
                    String tAcc = sc.nextLine();
                    Account a = bank.searchByAccNo(tAcc);
                    if (a != null)
                        a.showTransactions();
                    else
                        System.out.println("Account not found!");
                    break;
                    
                    
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
