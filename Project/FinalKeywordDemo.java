// 5. Create a Java program to demonstrate the use of the final keyword in a real-life scenario of a company's employee system. Create a class Employee with a final attribute companyName set to "TechCorp". Add a final method displayCompanyName() to print the company name. Create a subclass Developer that tries to override displayCompanyName() (this should result in a compilation error). In the main method, create an object of Employee and call displayCompanyName().
class Employee{
    final  String companyName="TechCorp";

    void displayCompanyName(){ 
            System.out.println("Company Name: " +companyName);
        }
        String employeeName;
        int employeeId;
        public Employee(String employeeName, int employeeId){
            this.employeeName = employeeName;
            this.employeeId = employeeId;
        }
    }
    public class FinalKeywordDemo{
        public static void main(String[] args){
            Employee emp=new Employee("NAVEEN BANWALA", 101);  
            emp.displayCompanyName(); 
            System.out.println("Employee "+emp.employeeName + " works at " +emp.companyName);
            Developer dev=new Developer("SACHIN BANWALA", 201);
            dev.displayCompanyName();
        }
    }
    class Developer extends Employee{
        public Developer(String employeeName, int employeeId){
            super(employeeName, employeeId);
        }
        void displayCompanyName(){
            System.out.println("Developer's Company: " +companyName);
        }
}
