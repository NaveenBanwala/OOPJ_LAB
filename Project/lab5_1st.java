// 1.  Aim of the program -Illustrate the usage of abstract class with following Java classes –
// An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract method course()
// A subclass ‘kiitian’ with course() method implementation
// Write the driver class to print the all details of a kiitian object.

//           Input - Rollno - 2205180
// Registration no - 1234567890
//           Output -Rollno - 2205180
// Registration no - 1234567890
// Course - B.Tech. (Computer Science & Engg)


import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rollno - ");
        rollNo = scanner.nextInt();
        System.out.print("Registration no - ");
        regNo = scanner.nextLong();
       // scanner.close(); Don't close System.in!
    }

    abstract void course(); // Abstract method
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    public void printDetails() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
        course(); // Call the course() method
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian(); // Create a Kiitian object
        kiitian.getInput(); // Call the getInput method
        kiitian.printDetails(); // Call the printDetails method to display all details

    }
}