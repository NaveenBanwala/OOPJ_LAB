// 3. Aim of the program -Define an interface with three methods – earnings(), deductions() and bonus() and define a Java class ‘Manager’ which uses this interface without implementing bonus() method. Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements bonus() method.  Write the complete program to find out earnings, deduction and bonus of a substaff with basic salary amount entered by the user as per the following guidelines –
// earnings           basic + DA (80% of basic) + HRA (15% of basic)
// deduction PF       12% of basic
// bonus             50% of basic
//    Input -Basic salary - 50000
//    Output -Earnings -  97500
// Deduction -6000
// Bonus - 25000
import java.util.Scanner;
interface Company{;
    void earnings();
    void deductions();
    void bonus();
}
class Manager implements Company{
    double basic_salary;
    public Manager(double b_c){
        this.basic_salary=b_c;

    }
    public void earnings(){
        double da = 0.80*basic_salary;
        double hra = 0.15 *basic_salary;
        double earnings=basic_salary+da+hra;
        System.out.println("Earnings is" + earnings);
    }
    public void deductions(){
        double deduction=0.12*basic_salary;
        System.out.println("Deduction is"+ deduction);
    }
    public void bonus(){
    // Empty
    }
}
class subStaff extends Manager{
    public subStaff(double basic_salary){
        super(basic_salary); 
    }

    public void bonus(){
        double bonus = 0.50*basic_salary;
        System.out.println("Bonus is "+ bonus); 
    }
}
public class Hrdra{ 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter basic salary");
        double salary=sc.nextDouble();
        subStaff s=new subStaff(salary);
        s.earnings();
        s.deductions();
        s.bonus();
        sc.close();
    }
}