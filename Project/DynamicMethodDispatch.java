// 3. Aim of the program : Write a program in Java having three classes Apple, Banana and
// Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
// own member function show() . Using Dynamic Method Dispatch concept display all the show()
// method of each class.
// Input: Mention show function of each class.
// Output: Display show function of each class accordingly.
class Apple {
    public void show() {
        System.out.println("Apple's show() method");
    }
}
class Banana extends Apple {
    public void show(){
        System.out.println("Banana's show() method");
    }
}
class Cherry extends Apple {
    public void show(){
        System.out.println("Cherry's show() method");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args){
        Apple[] fruits = new Apple[3];
        fruits[0]= new Apple();
        fruits[1]= new Banana();
        fruits[2]=new Cherry();
        for (Apple fruit:fruits){
            fruit.show();
        }
    }
}
