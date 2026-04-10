// Ques 1 LAb 5
abstract class student{
    int reg_no;
    int roll_no;
    void getInput(int a , int b){
        this.reg_no=a;
        this.roll_no=b;
    }
    abstract void course();
    void display(){
        System.out.println("Reg_No :"+ reg_no + "Roll_no:"+roll_no);
    }
}
class kiit extends student{
    void course(){
        System.out.println("Course- B.Tech || Branch - Computer Science");

    }
}
public class abstractreg_no{
    public static void main(String args[]){
        student s= new kiit();
        s.getInput(123,23052251);
        s.display();
        s.course();
    }
    
}
