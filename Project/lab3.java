// Aim of the program : Write a program which will overload the area () method and display the
// area of a circle, triangle and square as per user choice and user entered dimensions.

// Input: Mention dimensions like radius, base, height, side
// Output: Display area of circle
// Display area of triangle
// Display area of square
// 5. Aim of the program :  Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions. 
// Input:  Mention dimensions like radius, base, height, side
// Output:	Display area of circle
//    		Display area of triangle
//    		Display area of square
import java.util.Scanner;
public class lab3 {
    public void area(float r) {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
    public void area(int base, int height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
    public void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lab3 object = new lab3();
        System.out.println("Choose the shape to calculate the area:");
        System.out.println("1.Circle");
        System.out.println("2.Triangle");
        System.out.println("3.Square");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                float radius = sc.nextFloat();
                object.area(radius);
                break;
            case 2:
                System.out.print("Enter the base of the triangle: ");
                int base = sc.nextInt();
                System.out.print("Enter the height of the triangle: ");
                int height = sc.nextInt();
                object.area(base, height);
                break;
            case 3:
                System.out.print("Enter the side of the square: ");
                int side = sc.nextInt();
                object.area(side);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}