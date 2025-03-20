package datatypes.objectclass;



public class ObjectClass {

    public static void main(String[] args) {

        Object stringObject = new String("Hello World");
        Object stringLiteralObject = "Hello Prem";
        Object integerObject = 5;
        Object arrayObject = new String[] {"Prem", "Raj"};
        Object personObject = new Person("prem", 5);
        Object objectObject = new Object();

        /*
         * Polymorphism - Ability of different objects (String, Integer, Array, Person) to use same method call (toString())
         */
        System.out.println(stringObject); 
        System.out.println(stringLiteralObject);
        System.out.println(integerObject);
        System.out.println(arrayObject);
        System.out.println(personObject);
        System.out.println(objectObject);
    }
}
