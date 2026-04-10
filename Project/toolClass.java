//2. Aim of the program : Illustrate the execution of constructors in multi-level inheritance with three
// Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
// where box inherits from plate and woodbox inherits from box class. Each class has constructor where
// dimensions are taken from user.
// Input: Enter the dimensions
// Output: Display the dimensions accordingly
import java.util.Scanner;
class Plate{
    double length;
    double width;

    Plate(double length, double width){
        this.length=length;
        this.width=width;
    }
    void Display(){
        System.out.println("Length Of PLate is "+ length +" "+"Width of plate is "+ width);

    }
}
class Box extends Plate{
    double height;

    Box(double length , double width,double height){
        super(length,width);
        this.height=height;
    }
    void Display(){
        System.out.println("Length of the box is "+length +" "+"Width of the box is"+ width +" "+" Height of the box is "+ height);
    }
}
class woodBox extends Box{
    double thick;
    woodBox(double length,double width , double height, double thick){
        super(length,width,height);
        this.thick=thick;
    }
    void Display(){
        System.out.println("Length of the woodBox is "+length +""+"Width of the woodBox"+width +""+"Height of the woodBox"+height+" "+"Thickness of the wooden box is"+ thick);
    }

}
public class toolClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double length=sc.nextDouble();
        double width=sc.nextDouble();
        double height=sc.nextDouble();
        double thick=sc.nextDouble();
        Plate plate=new Plate(length,width);
        Box box=new Box(length,width,height);
        woodBox woodbox=new woodBox(length,width,height,thick);
        plate.Display();
        box.Display();
        woodbox.Display();
        
        sc.close();
    }
}
