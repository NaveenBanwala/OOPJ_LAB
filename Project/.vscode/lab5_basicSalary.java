import java.util.Scanner;

interface Employee{
    double earnings();
    double deductions();
    double bonus();
}
class Manager implements Employee{
    double basicSalary;
    public Manager(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double earnings(){
        double da =0.80 *basicSalary;
        double hra =0.15 *basicSalary;
        return basicSalary+da+hra;
    }
    public double deductions(){
        return 0.12 *basicSalary;
    }
    public double bonus() {
        return 0;
    }
}
class Substaff extends Manager{
    public Substaff(double basicSalary) {
        super(basicSalary);
    }
    public double bonus(){
        return 0.50 * basicSalary;
    }
}
public class lab5_basicSalary{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();
        Substaff substaff = new Substaff(basicSalary);
        double earnings = substaff.earnings();
        double deductions = substaff.deductions();
        double bonus = substaff.bonus();
        System.out.println("Earnings - " + earnings);
        System.out.println("Deduction -" + deductions);
        System.out.println("Bonus - " + bonus);
        scanner.close();
    }
}