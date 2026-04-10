
// 1. Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
// box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
// it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
// from 2D.
// Input: Enter dimensions
// Output: Display the cost of plastic
import java.util.Scanner;

class TwoD {
    double length;
    double width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }

    double getCost() {
        return getArea() * 40;// In Rupess
    }
}
class threeD extends TwoD {
    double height;

    threeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
    double getVolume() {
        return length * width * height;
    }
    double getCost() {
        return getVolume() * 60;
    }
}
public class plasticManufactures {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shape(2D|3D)");
        String str = sc.nextLine();
        if (str.equalsIgnoreCase("2D")) {
            System.out.println("Enter the length of 2-D box:");
            double length = sc.nextDouble();
            System.out.println("Enter the width of a 2-D box:");
            double width = sc.nextDouble();
            TwoD twoD = new TwoD(length, width);
            System.out.println("THe cost of the 2-D Shape is:" + twoD.getCost());
        } else if (str.equalsIgnoreCase("3D")) {
            System.out.println("Enter the length of 3-D box:");
            double length = sc.nextDouble();
            System.out.println("ENter the width of 3-D box:");
            double width = sc.nextDouble();
            System.out.println("Enter the height of 3-D box:");
            double height =sc.nextDouble();
            threeD threed = new threeD(length,width,height);
            System.out.println("THe cost of the 2-D Shape is:" + threed.getCost());
        }
        sc.close();
    }

}
