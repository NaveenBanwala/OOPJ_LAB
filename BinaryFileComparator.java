//  4..Aim of the program -Write a java program to compare two binary files, printing the first byte
// position where they differ.
// Input: Specify two binary files in the program (Assume two files are exist in the
// system)
// Output: Two files are equal
// Input: Specify two binary files in the program
// Output: Two files are not equal: byte position at which two files differ is 30
import java.io.*;

public class BinaryFileComparator {
    public static void main(String[] args) {
        String file1="file1.bin"; 
        String file2="file2.bin"; 
        try (FileInputStream fis1=new FileInputStream(file1);
            FileInputStream fis2=new FileInputStream(file2)){
            int byte1, byte2;
            int position = 1;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read())!= -1){
                if (byte1 != byte2) {
                    System.out.println("Two files are not equal: byte position at which two files differ is " + position);
                    return;
                }
                position++;
            }
            if(fis1.read() != -1 || fis2.read() != -1){
                System.out.println("Two files are not equal: one file is longer than the other");
            }else{
                System.out.println("Two files are equal");
            }
            
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
