// 2. Aim of the program -Define an interface Motor with a data member –capacity and two methods such as run() and consume(). Define a Java class ‘Washing machine’ which implements this interface and write the code to check the value of the interface data member thru an object of the class.
// Input - mentioned in the program
// Output - Capacity of the motor is --
interface  motor{
    final double capacity=1;

    void run();
    void consume();
}
class washingMachine implements motor{
    public void run(){
            System.out.println("Washing MAchine runs");
        }
    public void consume(){
            System.out.println("power consumed");
    
        }
}
public class motorClass{
    public static void main(String args[]){
        washingMachine Wm = new washingMachine();
        Wm.run();
        Wm.consume();

        System.out.println("Capacity of the motor is "+motor.capacity);
    }
}