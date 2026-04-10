// 4. Aim of the program :Write a class Account containing acc_no, balance as data members
// and two methods as input() for taking input from user and disp() method to display the details.
// Create a subclass Person which has name and aadhar_no as extra data members and
// override disp() function. Write the complete program to take and print details of three persons.

// Input: Enter details of three persons.
// Output: Display details of three persons.
import java.util.ArrayList;
import java.util.Scanner;
class Account {
    int acc_no;
    double balance;
    public Account(){

    }
    public void input(Scanner scanner) {
        System.out.print("Enter account number: ");
        this.acc_no = scanner.nextInt();
        System.out.print("Enter balance: ");
        this.balance = scanner.nextDouble();
        scanner.nextLine();
    }
    public void disp(){
        System.out.println("Account Number: " + this.acc_no);
        System.out.println("Balance: " + this.balance);
    }
}
class Person extends Account {
    String name;
    String aadhar_no;
    public Person(){

    }
    public void input(Scanner scanner){
        super.input(scanner);
        System.out.print("Enter name: ");
        this.name=scanner.nextLine();
        System.out.print("Enter Aadhar number:");
        this.aadhar_no=scanner.nextLine();
    }

    public void disp(){
        System.out.println("Name: " + this.name);
        System.out.println("Aadhar Number: " + this.aadhar_no);
        super.disp();
    }
}
public class PersonDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        int numPersons= 3;

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nEnter details of person " + (i + 1) + ":");
            Person p = new Person();
            p.input(scanner);
            persons.add(p);
        }
        System.out.println("\nDetails of persons:");
        for (Person person : persons) {
            System.out.println();
            person.disp();
        }
        scanner.close();
    }
}