package LoanMgmt;

import java.util.Scanner;
public class LoanManagerClient{
    private static int applicationId=1;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.Apply for a new loan");
            System.out.println("2.Dislay loan details");
            System.out.println("3.Exit");
            int choice=scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter customer id:");
                    int customerId=scanner.nextInt();
                    Customer customer=LoanManager.getCustomer(customerId);
                    if (customer == null) {
                        System.out.println("customer not found");
                        break;
                    }
                    System.out.println("enter loan type id:");
                    int loanTypeId = scanner.nextInt();
                    Loan loan = LoanManager.getLoanTypeDetail(loanTypeId);
                    if (loan == null) {
                        System.out.println("loan type not found.");
                        break;
                    }
                    System.out.println("Enter loan amount request:");
                    double amount = scanner.nextDouble();
                    System.out.println("Enter tenure in years only:");
                    int tenure = scanner.nextInt();
                    LoanApplication loanApplication = new LoanApplication(applicationId++, customer, loan, amount, tenure);
                    LoanStatus status = LoanManager.applyForLoan(loanApplication);
                    if(status == LoanStatus.APPROVED) {
                        System.out.println("! Loan Application Approved");
                    }else{
                        System.out.println("loan application rejected");
                    }
                    break;
                case 2:
                    for(LoanApplication application : LoanManager.getAllApplications()) {
                        System.out.println(application);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid : try again");
                    break;
            }
        }
    }
}
