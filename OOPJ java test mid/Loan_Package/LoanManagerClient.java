package Loan_Package;

import java.util.Scanner;
public class LoanManagerClient{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.APPLY FOR  NEW LOAN");
            System.out.println("2.SEE  LOAN APPLICATIONS  Status");
            System.out.println("3.PRESS FOR EXIT");
            System.out.print("Enter Your choice(1/2/3): ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            if (choice==1) applyForNewLoan(sc);
            else if (choice==2) viewAllLoanApplications();
            else if (choice==3){
                System.out.println("Exiting...");
                sc.close();
                return;
            }else{
                System.out.println("Please try again |Invalid|");
            }
        }
    }
    private static void applyForNewLoan(Scanner sc){
        System.out.print("Which type of Loan You Need(1-Personal, 2-Home, 3-Car): ");
        int loanTypeId = sc.nextInt();
        Customer[] customers = LoanManager.getCustomers();
        for(Customer customer : customers) {
            System.out.println(customer.getCustomerId() + " - " + customer.getName());
        }
        System.out.print("Select a Customer ID(1-5): ");
        int customerId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Purpose of your taking LOAN:");
        String purpose = sc.nextLine();
        System.out.print("Enter Amount of Loan:");
        double amount = sc.nextDouble();
        System.out.print("Enter Tenure of Loan:");
        int tenure = sc.nextInt();
        sc.nextLine(); 
        Customer customer = LoanManager.getCustomer(customerId);
        Loan loan = LoanManager.getLoanTypeDetail(loanTypeId);
        if (customer == null ||loan==null) {
            System.out.println("Invalid customer or loan type selected.>");
            return;
        }
        LoanApplication loanApplication = new LoanApplication(LoanManager.getApplicationCount() + 1, customer, loan, purpose, amount, tenure);
        String statusMessage = LoanManager.applyForLoan(loanApplication); 
        System.out.println(statusMessage);
    }
    private static void viewAllLoanApplications() {
        for (int i=0;i<LoanManager.getApplicationCount();i++) {
            LoanApplication application=LoanManager.getApplications()[i];
            if(application !=null) { 
                System.out.println("Application ID: "+application.getApplicationId());
                System.out.println("Customer: " +application.getCustomer().getName());
                System.out.println("Loan Type: "+application.getLoan().getType());
                System.out.println("Purpose: "+application.getPurpose());
                System.out.println("Amount: "+application.getAmount());
                System.out.println("Tenure: "+application.getTenure());
                System.out.println("Status: "+application.getStatus());
                System.out.println("---------");
            }
        }
    }
}