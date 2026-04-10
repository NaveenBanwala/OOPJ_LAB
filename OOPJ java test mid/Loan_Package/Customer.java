package Loan_Package;

public class Customer{
    private int customerId;
    private String name;
    private int age;
    private double annualSalary;
    public Customer(int customerId, String name, int age, double annualSalary) {
        this.customerId=customerId;
        this.name=name;
        this.age=age;
        this.annualSalary=annualSalary;
    }
    public int getCustomerId(){ 
        return customerId; 
    }
    public String getName(){
        return name; 
    }
    public int getAge() {
        return age; 
    }
    public double getAnnualSalary(){ 
        return annualSalary;
    }
}