import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        System.out.println("intArray:");
        System.out.println(intArray); // print array
        System.out.println("intArray.get(0):");
        System.out.println(intArray.get(0)); // access array's element
        System.out.println("intArray.remove(0)");
        System.out.println(intArray.remove(0));
        System.out.println("intArray.remove(Integer.valueOf(30))");
        System.out.println(intArray.remove(Integer.valueOf(30)));
        System.out.println(intArray);

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("apple");
        strArray.add("banana");
        strArray.add("cat");
        System.out.println(strArray);
        System.out.println(strArray.get(2));
        System.out.println(strArray.remove(0));
        System.out.println(strArray.remove("dog"));
        System.out.println(strArray);



    }
}