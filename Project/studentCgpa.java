import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }
}

public class studentCgpa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Student[] students = new Student[n];
        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaStudentName = "";
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();
            students[i] = new Student(roll, name, cgpa);
            if (cgpa < lowestCgpa) {
                lowestCgpa = cgpa;
                lowestCgpaStudentName = name;
            }
        }
        System.out.println("\nDetails of Students:");
        for (Student student : students) {
            System.out.println("Roll No: " + student.roll + ", Name: " + student.name + ", CGPA: " + student.cgpa);
        }
        System.out.println("\nStudent with the lowest CGPA: " + lowestCgpaStudentName);
        scanner.close();
    }
}
