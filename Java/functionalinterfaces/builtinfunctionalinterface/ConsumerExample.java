package functionalinterfaces.builtinfunctionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.lang.StringBuilder;

public class ConsumerExample {

    public static void main(String[] args) {

        // Example - 1
        Consumer<Integer> printIt = para -> System.out.println(para);
        printIt.accept(1);


        // Example - 2
        StringBuilder message = new StringBuilder("Hello,");
        Consumer<StringBuilder> appendSuffix = sb -> sb.append(" World!");
        
        appendSuffix.accept(message);
        System.out.println(message.toString());


        // Example - 3
        Consumer<int[]> incrementFirstElement = arr -> arr[0]++;
        
        int[] numberArray = new int[5];
        incrementFirstElement.accept(numberArray);
        System.out.println(Arrays.toString(numberArray));


        // Example - 4
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printer = name -> System.out.println(name);

        names.forEach(printer);


    }
    
}
