// import java.util.Scanner;
// public class containsDuplicate{

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         System.out.println("Enter the elements of an array:");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//         }
//             int duplicateCount=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     duplicateCount++;
//                 }
//             System.out.println("Element "+arr[i]+"occurs" + duplicateCount +"times");

//         }
//     }

// }
import java.util.Scanner;

public class containsDuplicate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] processed = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (processed[i]) {
                continue;
            }

            int duplicateCount = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateCount++;
                    processed[j] = true; 
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + duplicateCount + " times");
        }
        sc.close();
    }
}
