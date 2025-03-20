package optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        System.out.println();


        System.out.println("public static <T> Optional<T> of(T value)");

        String val = "Hello World";
        Optional<String> optionalString = Optional.of(val);
        System.out.println("optionalString.isPresent() " + optionalString.isPresent());
        System.out.println(optionalString.get());

        //String value = null;
        // Optional<String> optionalNull = Optional.of(value); // Throws NullPointerException


    }
    
}
