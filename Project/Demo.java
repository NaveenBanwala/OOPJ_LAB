// Aim of the program :Write a class file – box with three data members(length, width, height)
// and a method volume() . Also implement the application class Demo where an object of the
// box class is created with user entered dimensions and volume is printed.

// Input: length,width and height.
// Output: Volume
import java.util.Scanner;

class Box {
    int length, width, height;
    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    int volume() {
        return length * width * height;
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of a box:");
        int length = sc.nextInt();
        System.out.println("Enter the Breadth of a box:");
        int width = sc.nextInt();
        System.out.println("Enter the Height of a box:");
        int height = sc.nextInt();
        Box box = new Box(length, width, height);
        System.out.println("The volume of the box is " + box.volume());
        sc.close();
    }
}
