// 4. Aim of the program - Define an interface Emploee with a method getDetails() to get emplyee details as Empid and Ename. Also define a derived interface Manager with a method getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head which implements Manager interface and also prints all details of the employee. Write the complete program to display all details of one head of the department.
//             Input - Enter employee id - 123
//               Enter employee name - Sidharth Ambani
//               Enter department id - 06
//               Enter department name -Marketing
//               Output - Employee id - 123
//               Employee name - Sidharth Ambani
//               Department id - 06
//               Department name -Marketing
import java.util.Scanner;
interface Employee{
    void getDetails();
}
interface Manager extends Employee{
    void getDeptDetails();
}
class Head implements Manager{
    int empid;
    String ename;
    int deptid;
    String deptname;

    public void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter employee id - ");
        empid=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name - ");
        ename=sc.nextLine();
    }
    public void getDeptDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter department id - ");
        deptid=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name - ");
        deptname = sc.nextLine();
    sc.close();
    }


    public void printDetails() {
        System.out.println("Employee id - "+empid);
        System.out.println("Employee name - "+ename);
        System.out.println("Department id - "+deptid);
        System.out.println("Department name - "+deptname);
    }
}
public class HeadDetails{
    public static void main(String[] args){
        Head head=new Head();
        head.getDetails();
        head.getDeptDetails();
        head.printDetails();
    }
}