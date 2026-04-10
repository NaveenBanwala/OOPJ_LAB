// 6. Aim of the program : Write a program in java using constructor overloading concept to calculate
// the area of a rectangle having data member as length and breadth. Use default constructor to
// initialize the value of the data member to zero and parameterized constructor to initialize the value
// of data member according to the user input.

// Input: Mention the value of length and breadth
// Output: Display the area of rectangle accordingly.
// 6.  Aim of the program : Write a program in java using constructor overloading concept to calculate the area of a rectangle having data member as length and breadth. Use default constructor to initialize the value of the data member to zero and parameterized constructor to initialize the value of data member according to the user input. 
// Input: Mention the value of length and breadth 
// Output: Display the area of rectangle accordingly.

import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;
    public Rectangle(){
        this.length=0;
        this.breadth=0;
    }
    public Rectangle(double length,double breadth) {
        this.length=length;
        this.breadth=breadth;
    }
    public double Area(){
        return length*breadth;
    }
}
public class le3f{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Area of rectangle with default constructor: " + rect.Area());
        System.out.print("Enter the length of the rectangle: ");
        double length=sc.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth=sc.nextDouble();
        Rectangle parameterizedRectangle = new Rectangle(length, breadth);
        System.out.println("Area of rectangle with given dimensions:" + parameterizedRectangle.Area());
        sc.close();
    }
}