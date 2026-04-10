package LoanMgmt;

public class LoanApplication {
    private int applicationId;
    private Customer customer;
    private Loan loan;
    private String purpose;
    private double amount;
    private int tenure;
    private LoanStatus status;

    // Constructor
    public LoanApplication(int applicationId, Customer customer, Loan loan, String purpose, double amount, int tenure) {
        this.applicationId = applicationId;
        this.customer = customer;
        this.loan = loan;
        this.purpose = purpose;
        this.amount = amount;
        this.tenure = tenure;
        this.status = LoanStatus.PENDING; // Default status is PENDING
    }

    // Getters and Setters
    public int getApplicationId() {
        return applicationId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Loan getLoan() {
        return loan;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getAmount() {
        return amount;
    }

    public int getTenure() {
        return tenure;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}