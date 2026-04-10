package LoanMgmt;
import java.util.ArrayList;
import java.util.List;
public class LoanManager{
    public static List<Customer> customers = new ArrayList<>();
    public static List<Loan> loans = new ArrayList<>();
    public static List<LoanApplication> applications = new ArrayList<>();
    public static Customer getCustomer(int customerId) {
        for (Customer customer : customers){
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }
    public static Loan getLoanTypeDetail(int loanTypeId){
        for (Loan loan : loans) {
            if (loan.getLoanTypeId() == loanTypeId){
                return loan;
            }
        }
        return null;
    }
    public static LoanStatus applyForLoan(LoanApplication loanApplication) {
        Loan loan = loanApplication.getLoan();
        Customer customer = loanApplication.getCustomer();
        if (customer.getAge() < loan.getMinAge() || customer.getAge() > loan.getMaxAge()) {
            return LoanStatus.REJECTED; 
        }
        if (customer.getAnnualSalary() < loan.getMinSalary()) {
            return LoanStatus.REJECTED; 
        }
        applications.add(loanApplication);
        return LoanStatus.APPROVED;
    }
    public static List<LoanApplication> getAllApplications() {
        return applications;
    }
}
