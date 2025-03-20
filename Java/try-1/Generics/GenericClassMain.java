public class GenericClassMain {
    public static void main(String[] args) {
        //GenericClass gc<String> = new GenericClass<>("Hello World!");
        GenericClass<String> gc = new GenericClass<>("Hello World!");
        System.out.println(gc.getObj());
        gc.setObj("Hello Prem");
        System.out.println(gc.getObj());
    }
}
