/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class MyBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        //empty employee list
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Account> GAccounts = new ArrayList<Account>();
        ArrayList<CheckingAccount> Caccounts = new ArrayList<CheckingAccount>();
        //create a bank with empty employee list
        Bank bank = new Bank(1, "IT Expert Bank", "847 350 9034", employees, customers, GAccounts);

        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("== Add employee==");
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    System.out.println("Enter name");
                    String name = sc.next();

                    System.out.println("Enter email");
                    String email = sc.next();

                    System.out.println("Employee type");
                    String type = sc.next();
                    Employee emp1 = null;
                    if (type.equalsIgnoreCase("fulltime")) {
                        //create employee instance with data
                        System.out.println("Enter salary");
                        float salary = sc.nextFloat();
                        emp1 = new FullTiimeEmployee(salary, id, name, email);
                    } else {
                        System.out.println("Enter hourly rate");
                        float hourlyrate = sc.nextFloat();
                        emp1 = new ContractorEmployee(hourlyrate, id, name, email);
                    }

                    //add employee in a bank
                    bank.getEmployees().add(emp1);
                    System.out.println(bank);
                    break;
                case 2:
                    System.out.println("== Search employee == ");
                    System.out.println("Enter employee id ");
                    int eid = sc.nextInt();
                    boolean found = false;
                    for (Employee e : bank.getEmployees()) {
                        if (e.getId() == eid) {
                            System.out.println(e);
                            found = true;
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("For this id - Employee does not exit");
                    }
                    break;
                case 3:
                    System.out.println("Save Employee");
                    try {
                        FileWriter fw = new FileWriter("C:\\Users\\erani\\OneDrive\\Desktop\\BankProject\\bank,txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("===========Bank ============\n");
                        bw.write(bank.getId() + "|" + bank.getName() + "|" + bank.getPhone() + "\n");

                        bw.write("===========Employee[s] ============\n");

                        for (Employee e : bank.getEmployees()) {

                            bw.write(e.getId() + "|" + e.getName() + "|" + e.getEmail());
                            if (e instanceof FullTiimeEmployee) {
                                bw.write(((FullTiimeEmployee) e).getSalary() + "");
                            } else {
                                bw.write(((ContractorEmployee) e).getHourlyRate() + "");
                            }
                            bw.write("\n");

                        } //for

                        //TODO For Customer
                        //Each Customer has account
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("== Add customer==");
                    System.out.println("Enter id");
                    int CID = sc.nextInt();
                    System.out.println("Enter First name");
                    String fname = sc.next();
                    System.out.println("Enter Last name");
                    String lname = sc.next();
                    System.out.println("Enter email");
                    String cemail = sc.next();
                    System.out.println("Enter phone");
                    String phone = sc.next();

//                     Customer cust1 = new Customer(CID, fname, lname, cemail, phone);
//                    bank.getCustomers().add(cust1);
                    System.out.println("Customer type");
                    String ctype = sc.next();
                    Customer cust1 = null;

                    if (ctype.equalsIgnoreCase("Individual")) {
                        //create employee instance with data
                        System.out.println("Enter SSN");
                        String ssn = sc.next();
                        cust1 = new IndividualCustomer(ssn, CID, fname, lname, cemail, phone, GAccounts);
                    } else {
                        System.out.println("Enter EIN");
                        String ein = sc.next();
                        cust1 = new BusinessCustomer(ein, CID, fname, lname, cemail, phone, GAccounts);
                    }
                    //add employee in a bank
                    bank.getCustomers().add(cust1);
                    System.out.println(bank);

//                    System.out.println("== Add Account ==");
//                    System.out.println("Enter Account ID");
//                    int Aid = sc.nextInt();
////                    
//                    System.out.println("Account type");
//                    String atype = sc.next();
//                    Account acc1 = null;
//                    if (atype.equalsIgnoreCase("saving")) {
//                        //create employee instance with data
//                        System.out.println("Enter Saving Account Number");
//                        String SAC = sc.next();
//                        System.out.println("Enter Balance");
//                        double balance = sc.nextDouble();
//                        System.out.println("Enter Interest");
//                        double interest = sc.nextDouble();
//                        acc1 = new SavingAccount(SAC, balance);
//                    } else {
//                        System.out.println("Enter Checking Account Number");
//                        String CAC = sc.next();
//                        System.out.println("Enter Balance");
//                        double balance = sc.nextDouble();
//                        System.out.println("Enter Interest");
//                        double interest = sc.nextDouble();
//                        acc1 = new CheckingAccount(CAC, balance);
//                    }
////                    //add employee in a bank
//                    bank.getAccounts().add(acc1);

                    System.out.println(bank);
                    break;

                case 5:
                    System.out.println("== Search customer == ");
                    System.out.println("Enter customer id ");
                    int CID1 = sc.nextInt();
                    boolean found1 = false;
                    for (Customer c : bank.getCustomers()) {
                        if (c.getCID() == CID1) {
                            System.out.println(c);
                            found1 = true;
                            break;
                        }
                    }
                    if (found1 == false) {
                        System.out.println("For this id - Customer does not exit");
                    }
                    break;

                case 6:
                    System.out.println("Save Customer");
                    try {
                        FileWriter fw = new FileWriter("C:\\Users\\erani\\OneDrive\\Desktop\\BankProject\\bank,txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("===========Bank ============\n");
                        bw.write(bank.getId() + "|" + bank.getName() + "|" + bank.getPhone() + "\n");

                        //int CID, String fname, String lname, String email, String phone
                        bw.write("===========Customer[s] ============\n");

                        for (Customer c : bank.getCustomers()) {

                            bw.write(c.getCID() + "|" + c.getFname() + "|" + c.getLname() + "|" + c.getEmail() + "|" + c.getEmail() + "|" + c.getPhone() + "|");
//                            if (c instanceof FullTiimeEmployee) {
//                                bw.write(((FullTiimeEmployee) c).getSalary() + "");
//                            } else {
//                                bw.write(((ContractorEmployee) c).getHourlyRate() + "");
//                            }
                            bw.write("\n");

                        } //for

                        //TODO For Customer
                        //Each Customer has account
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                     case 7:
                    System.out.println("== Add account==");
                    System.out.println("Enter type of the account: Savings or Checking");
                    String gtype = sc.next();
                   // Customer cust1 = null;
                    if (gtype.equalsIgnoreCase("Savings")) {
                        //create account instance with data
                        System.out.println("Enter SAC");
                        String SAC = sc.next();
                        System.out.println("Enter balance");
                        double balance = sc.nextDouble(); 
                        Account acc1 = new SavingAccount(SAC, balance);
                        acc1.applyInterest();
                        bank.GAccounts.add(acc1);
                    } else {
                        System.out.println("Enter CAC");
                        String CAC = sc.next();
                        System.out.println("Enter balance");
                        double balance = sc.nextDouble(); 
                        Account acc1 = new CheckingAccount(CAC, balance); 
                        acc1.applyInterest();
                        bank.GAccounts.add(acc1);
                    }

                    System.out.println(bank);
                    
                      break;
              
           case 8:
                    System.out.println("== Search Account  == ");
                    System.out.println("Enter account number");
                   String a = sc.next();
                   boolean founda = false;
                   for (Account c : bank.getGAccounts()) {
                        if (a.equalsIgnoreCase(c.getaccountnumber())) {
                            System.out.println(c);
                            founda = true;
                            break;
                    }}
                    if (founda == false) {
                        System.out.println("For this id - Customer does not exit");
                    }
                   break;
                    
               case 9:
               
                    System.out.println("Save GAccount");
                    try {
                        FileWriter fw = new FileWriter("C:\\Users\\erani\\OneDrive\\Desktop\\BankProject\\bank,txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("===========Bank ============\n");
                        bw.write(bank.getId() + "|" + bank.getName() + "|" + bank.getPhone() + "\n");
                        bw.write("===========Account[s] ============\n");

                        for (Account c : bank.getGAccounts()) {

                            bw.write(c.getaccountnumber() + "|" + c.getBalance() + "|");
                            bw.write("\n");

                        } //for

                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                    

                case 10:
                    break;
            }

        } while (choice != 10);

    }

    public static void menu() {
        System.out.println("1 for Add Employee");
        System.out.println("2 for Search Employee");
        System.out.println("3 for Save Employee");

        System.out.println("4 for Add Customer");
        System.out.println("5 for Search Customer");
        System.out.println("6 for Save Customer");

        System.out.println("7 for Add Account");
        System.out.println("8 for Search Account");
        System.out.println("9 for Save Account");
        System.out.println("10 for Quit");
        System.out.println("Enter your choice  ");
    }
}
