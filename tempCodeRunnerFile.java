public class Test {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x * 2 + x--;
        System.out.println(y);
    }
}
