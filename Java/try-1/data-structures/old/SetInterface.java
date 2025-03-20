import java.util.Set;
import java.util.HashSet;

class SetInterface {
    public static void main(String[] args) {
        Set<String> setA = new HashSet<>();
        boolean isAdded = setA.add("apple");
        System.out.println("When element is not present: " + isAdded);
        setA.add("ball");
        isAdded = setA.add("apple");
        System.out.println("When element is not present: " + isAdded);
    }

	
}
