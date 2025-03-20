package reference_types.Array;

public class ArrayExample {

    public static void main(String[] args) {
        
        // Creating Arrays

        int[] numberArray = new int[5];
        for (int i = 0; i < 5; i++) {
            numberArray[i] = i+1;
        }

        char[] charArray = {'P', 'R', 'E', 'M'};
        String charArrayToString = "";
        for (int i = 0; i < charArray.length; i++) {
            charArrayToString += charArray[i];
        }
        System.out.println(charArrayToString);

        String[] stringArray = {"Prem", "Raj", "Oli"};
        System.out.printf("String = {%s, %s, %s}", stringArray[0], stringArray[1], stringArray[2]);


    }
    
}
