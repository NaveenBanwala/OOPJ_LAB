import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("--------------------");
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine(); // Consume newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int roll = input.nextInt();
            input.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("CGPA: ");
            double cgpa = input.nextDouble();
            input.nextLine(); // Consume newline

            students[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nStudent Details:");
        for (Student student : students) {
            student.display();
        }

        // Find student with lowest CGPA
        double lowestCgpa = students[0].cgpa;
        String lowestCgpaStudentName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaStudentName = students[i].name;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Name: " + lowestCgpaStudentName);
        System.out.println("CGPA: " + lowestCgpa);

        input.close();
    }
}
