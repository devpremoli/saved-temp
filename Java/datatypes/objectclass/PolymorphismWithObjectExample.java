package datatypes.objectclass;

public class PolymorphismWithObjectExample {

    public static void printObjectInfo(Object obj) {
        if (obj instanceof String) {
            System.out.println("This is a String: " + obj);
        } else if (obj instanceof Integer) {
            System.out.println("This is an Integer: " + obj);
        } else if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println("This is a Person: " + person);
        } else {
            System.out.println("This is an object of type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        String stringObject = "Hello World";
        Integer intObject = 5;

        printObjectInfo(stringObject);
        printObjectInfo(intObject);


    }
    
}
