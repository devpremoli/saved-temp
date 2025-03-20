package optional.map;

import java.util.Optional;
import java.util.function.Function;

public class MapMethod {

    public static void main(String[] args) {

        Optional<String> optionalStringHello = Optional.of("Hello");

        Optional<Integer> length = optionalStringHello.map(String::length);
        System.out.println(length);
        length.ifPresent(System.out::println);
        length.ifPresent(val -> System.out.println(val));


        Optional<String> UpperAddWorldA = optionalStringHello.map(
            val -> val.toUpperCase() + "WORLD"
        );
        UpperAddWorldA.ifPresent(System.out::println);

        Optional<String> UpperAddWorldB = optionalStringHello.map(
            val -> {
                return val.toUpperCase() + "WORLD";
            }
        );
        UpperAddWorldB.ifPresent(System.out::println);

        Optional<String> UpperAddWorldC = optionalStringHello.map(
            val -> {
                Function<String, String> UpperVal = String::toUpperCase;
                return UpperVal.apply(val) + "WORLD";
            }
        );
        UpperAddWorldC.ifPresent(System.out::println);





        

    }
    
}
