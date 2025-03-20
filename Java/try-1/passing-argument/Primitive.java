public class Primitive {
    public static void changeValue(int a) {
        a = 20;
        System.out.println("value of a inside the method: " + a);
    }
    public static void main (String[] args) {
        int original = 10;
        changeValue(original);
        System.out.println("value of original after method call: " + original);
    }
}