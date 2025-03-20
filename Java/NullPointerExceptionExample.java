public class NullPointerExceptionExample {
    
    public static void main(String[] args) {

        String nullStr = null;
        System.out.println(nullStr);

        // Calling a method on a null object
        //System.out.println(nullStr.length());


        class Person {
            String name;
        }

        Person personA = null;
        String personName = personA.name;
    }
    
}
