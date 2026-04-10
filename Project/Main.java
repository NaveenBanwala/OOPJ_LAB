// 5. Aim of the program : Write a program which will overload the area () method and display the
// area of a circle, triangle and square as per user choice and user entered dimensions.

// Input: Mention dimensions like radius, base, height, side
// Output: Display area of circle
// Display area of triangle
// Display area of square
import java.util.Scanner;
class Shape {
    double area(double radius){
        return 3.14*radius*radius;
    }
    double area(double base, double height){
        return 0.5*base*height;
    }
    double area(int side){
        return side*side;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (circle/triangle/square): ");
        String choice = scanner.nextLine().trim().toLowerCase();
        switch (choice) {
            case "circle":
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + shape.area(radius));
                break;
            case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + shape.area(base, height));
                break;
            case "square":
                System.out.print("Enter the side of the square: ");
                int side = scanner.nextInt();
                System.out.println("Area of square: " + shape.area(side));
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
