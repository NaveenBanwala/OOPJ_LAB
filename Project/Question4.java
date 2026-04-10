// 4. Aim of the program : Write a program to overload subtract method with various parameters in a
// class in Java. Write the driver class to use the different subtract methods using object.
// Input: Mention various subtract method having different parameters.
// Output: Subtract method will display the result accordingly
class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }
    int subtract(int a, int b, int c) {
        return a - b - c;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    int subtract(int start,int[] numbers) {
        for (int number : numbers) {
            start -= number;
        }
        return start;
    }
}
public class Question4 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        // Using subtract method with two integers
        int result1=calculator.subtract(1, 3);
        System.out.println("Result of subtracting two integers:" +result1);
        // Using subtract method with three integers
        int result2=calculator.subtract(2, 1, 3);
        System.out.println("Result of subtracting three integers:"+result2);
        // Using subtract method with two double values
        double result3=calculator.subtract(10.1, 6.2);
        System.out.println("Result of subtracting two doubles: "+result3);
        // Using subtract method with an array of integers
        int[] numbers={5,6,7};
        int result4=calculator.subtract(10, numbers);
        System.out.println("Result of subtracting an array from a starting value: " + result4);
    }
}
