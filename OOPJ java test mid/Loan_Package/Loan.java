package Loan_Package;

public class Loan{
    private int loanTypeId;
    private String type;
    private int minAge;
    private int maxAge;
    private double minSalary;
    public Loan(int loanTypeId, String type, int minAge, int maxAge, double minSalary) {
        this.loanTypeId = loanTypeId;
        this.type=type;
        this.minAge=minAge;
        this.maxAge=maxAge;
        this.minSalary=minSalary;
    }
    public int getLoanTypeId(){ 
        return loanTypeId; 
    }
    public String getType(){
        return type; 
    }
    public int getMinAge(){
        return minAge;
    }
    public int getMaxAge(){ 
        return maxAge; 
    }
    public double getMinSalary(){
        return minSalary; 
    }
}