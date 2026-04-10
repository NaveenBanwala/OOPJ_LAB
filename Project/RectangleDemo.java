// 2. Aim of the program : Write a program in Java to create a class Rectangle having data members
// length and breadth and three methods called read, calculate and display to read the values of
// length and breadth, calculate the area and perimeter of the rectangle and display the result
// respectively.
// import java.util.Scanner;
//     class Rectangle{
//             int length;
//             int breath;
//             Rectangle(int length,int breath){
//                 this.length=length;
//                 this.breath=breath;
//             }
//             int area(int length,int breath){
//                 return length*breath;
//             }
//             int perimeter(int length,int breath){
//                     return 2*(length+breath);
//             }
//         }
// public class recatangle{
//     public static void main(){
//         Scanner sc=new Scanner(System.in);
//         int length,breath;
//         System.out.println("Enter the Length of a rectangle:");
//         length=sc.nextInt();
//         System.out.println("Enter the breath of a rectangle:");
//         breath=sc.nextInt();
//         Rectangle rectangle=new Rectangle(length,breath);
//         System.out.println("The Area of a rectangle is"+ rectangle.area());
//         System.out.println("The Perimeter of a rectangle is"+rectangle.perimeter());
//     }
// }

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    int area() {
        return length * breadth;
    }
    int perimeter() {
        return 2 * (length + breadth);
    }
}
public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the rectangle:");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth of the rectangle:");
        int breadth = sc.nextInt();
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println("The Area of the rectangle is " + rectangle.area());
        System.out.println("The Perimeter of the rectangle is " + rectangle.perimeter());
        sc.close();
    }
}
