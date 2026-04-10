package Loan_Package;

public class LoanManager{
    private static Customer[] customers={
        new Customer(1, "NAVEEN BANWALA", 30, 50000),
        new Customer(2, "SACHIN BANWALA", 40, 70000),
        new Customer(3, "SWEETY BANWALA", 25, 45000),
        new Customer(4, "MEHAK BANWALA", 35, 80000),
        new Customer(5, "ROHIT BANWALA", 29, 60000)
    };
    private static Loan[] loans={
        new Loan(1, "PERSONAL", 21, 60, 30000),
        new Loan(2, "HOME", 25, 65, 50000),
        new Loan(3, "BUISNESS", 21, 60, 40000)
    };
    private static LoanApplication[] applications=new LoanApplication[100];
    private static int applicationCount = 0;

    public static Customer getCustomer(int customerId){
        for(Customer customer : customers){
            if(customer.getCustomerId()==customerId) 
            return customer;
        }
        return null;
    }
    public static Loan getLoanTypeDetail(int loanTypeId){
        for (Loan loan : loans) {
            if (loan.getLoanTypeId() == loanTypeId) 
            return loan;
        }
        return null;
    }
    public static String applyForLoan(LoanApplication loanApplication){
        Customer customer = loanApplication.getCustomer();
        Loan loan = loanApplication.getLoan();
        if (customer.getAge() < loan.getMinAge() || customer.getAge() > loan.getMaxAge()) {
            loanApplication.setStatus(LoanStatus.REJECTED);
            return "Sorry, your loan is rejected due to age restrictions.Must be between " + loan.getMinAge() + " and " + loan.getMaxAge() + ".";
        }
        if (customer.getAnnualSalary() < loan.getMinSalary()) {
            loanApplication.setStatus(LoanStatus.REJECTED);
            return "Sorry, your loan is rejected due to insufficient salary.Minimum salary required is " + loan.getMinSalary() + ".";
        }
        loanApplication.setStatus(LoanStatus.APPROVED);
        applications[applicationCount++] = loanApplication;
        applicationCount++; 
        return "CONGRULATIONS ! Your loan is approved.";
    }
    public static LoanApplication[] getApplications(){
        return applications; }
    public static int getApplicationCount(){ 
        return applicationCount;
    }
    public static Customer[] getCustomers(){
        return customers;
    }
}