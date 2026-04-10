import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size =scanner.nextInt();
        int[] arr=new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        try{
            System.out.println("Accessing element at index " + size + " (out of bounds):");
            System.out.println(arr[size]); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught: " + e);
        }
        scanner.close();
    }
}