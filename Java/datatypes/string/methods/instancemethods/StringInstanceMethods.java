package datatypes.string.methods.instancemethods;

public class StringInstanceMethods {

    public static void main(String[] args) {
        System.out.println();
        
        String stringA = "Prem";
        String stringB = "prem";
        String stringC = "Hello World";



        /*
         ***************************************************************
         * Method: public char charAt(int index)
         * Description: Returns the character at the specified index.
         * Example: Getting the last character of the string.
         ***************************************************************
         */
        System.out.println("public char charAt(int index)");

        // Get the last character of the string
        System.out.println("Last character of stringA: " + stringA.charAt(stringA.length() - 1));  // Output: 'm'
        
        // Uncommenting these lines will throw exceptions due to invalid indices
        // System.out.println(stringA.charAt(-1));  // Throws StringIndexOutOfBoundsException
        // System.out.println(stringA.charAt(stringA.length()));  // Throws StringIndexOutOfBoundsException

        System.out.println();



        /*
         ***************************************************************
         * Method: public int compareTo(String anotherString)
         * Description: Compares two strings lexicographically.
         * Returns:
         *   - Negative if stringA comes before anotherString
         *   - 0 if stringA is equal to anotherString
         *   - Positive if stringA comes after anotherString
         ***************************************************************
         */
        System.out.println("public int compareTo(String anotherString)");

        // Comparing stringA with other strings lexicographically
        System.out.println("Comparing with 'Orem': " + stringA.compareTo("Orem"));  // Negative value
        System.out.println("Comparing with 'Nrem': " + stringA.compareTo("Nrem"));  // Negative value
        System.out.println("Comparing with 'Prem': " + stringA.compareTo("Prem"));  // Output: 0 (equal)
        System.out.println("Comparing with 'Qrem': " + stringA.compareTo("Qrem"));  // Positive value
        System.out.println("Comparing with 'Rrem': " + stringA.compareTo("Rrem"));  // Positive value

        System.out.println();



        /*
         ***************************************************************
         * Method: public int compareToIgnoreCase(String str)
         * Description: Compares two strings lexicographically, ignoring case.
         ***************************************************************
         */
        System.out.println("public int compareToIgnoreCase(String str)");
        System.out.println(stringA.compareToIgnoreCase("pRem"));
        System.out.println();



        /*
         ***************************************************************
         * Method: public String concat(String str)
         * Description: Concatenates the specified string to the end of the current string.
         ***************************************************************
         */
        System.out.println("public String concat(String str)");
        System.out.println(stringA.concat(" Raj"));  // Output: "Prem Raj"
        System.out.println();



        /*
         ***************************************************************
         * Method: public boolean contains(CharSequence s)
         * Description: Checks if the string contains the specified sequence.
         ***************************************************************
         */
        System.out.println("public boolean contains(CharSequence s)");
        System.out.println(stringC.contains("World"));  // Output: true

        System.out.println();



        /*
         ***************************************************************
         * Method: public boolean endsWith(String suffix)
         * Description: Checks if the string ends with the specified suffix.
         ***************************************************************
         */
        System.out.println("public boolean endsWith(String suffix)");
        System.out.println(stringC.endsWith("World"));  // Output: true

        System.out.println();



        /*
         ***************************************************************
         * Method: public boolean equalsIgnoreCase(String anotherString)
         * Description: Compares two strings, ignoring case considerations.
         ***************************************************************
         */
        System.out.println("public boolean equalsIgnoreCase(String anotherString)");
        System.out.println(stringA.equalsIgnoreCase(stringB));  // Output: true

        System.out.println();


        /*
         ***************************************************************
         * Method: public int indexOf(int ch)
         * Description: Returns the index of the first occurrence of the specified character.
         ***************************************************************
         */
        System.out.println("public int indexOf(int ch)");
        System.out.println(stringC.indexOf('o'));  // Output: 4 (first occurrence of 'o')

        System.out.println();


        /*
         ***************************************************************
         * Method: public int indexOf(int ch, int fromIndex)
         * Description: Returns the index of the first occurrence of the character after the specified index.
         ***************************************************************
         */
        System.out.println("public int indexOf(int ch, int fromIndex)");
        System.out.println(stringC.indexOf('o', 5));  // Output: 7 (first 'o' after index 5)

        System.out.println();  // Empty line for separation between sections


        /*
         ***************************************************************
         * Method: public int indexOf(String str)
         * Description: Returns the index of the first occurrence of the specified substring.
         ***************************************************************
         */
        System.out.println("public int indexOf(String str)");
        System.out.println(stringC.indexOf("World"));  // Output: 6

        System.out.println();  // Empty line for separation between sections


        /*
         ***************************************************************
         * Method: public int indexOf(String str, int fromIndex)
         * Description: Returns the index of the first occurrence of the substring after the specified index.
         ***************************************************************
         */
        System.out.println("public int indexOf(String str, int fromIndex)");
        System.out.println(stringC.indexOf("World", 3));  // Output: 6 (starts searching after index 3)

        System.out.println();  // Empty line for separation between sections


        /*
         ***************************************************************
         * Method: public boolean isBlank()
         * Description: Returns true if the string is empty or contains only white space.
         ***************************************************************
         */
        System.out.println("public boolean isBlank()");
        System.out.println("   ".isBlank());  // Output: true

        System.out.println();  // Empty line for separation between sections


        /*
         ***************************************************************
         * Method: public boolean isEmpty()
         * Description: Returns true if the string length is 0.
         ***************************************************************
         */
        System.out.println("public boolean isEmpty()");
        System.out.println("".isEmpty());  // Output: true

        System.out.println();  // Empty line for separation between sections


        /*
         ***************************************************************
         * Method: public int lastIndexOf(int ch)
         * Description: Returns the index of the last occurrence of the specified character.
         ***************************************************************
         */
        System.out.println("public int lastIndexOf(int ch)");
        System.out.println(stringC.lastIndexOf('o'));  // Output: 7 (last occurrence of 'o')

        System.out.println();


        /*
         ***************************************************************
         * Method: public int lastIndexOf(String str)
         * Description: Returns the index of the last occurrence of the specified substring.
         ***************************************************************
         */
        System.out.println("public int lastIndexOf(String str)");
        System.out.println(stringC.lastIndexOf("o"));  // Output: 7

        System.out.println();


        
        /*
         ***************************************************************
         * Method: public int length()
         * Description: Returns the length of the string.
         ***************************************************************
         */
        System.out.println("public int length()");
        System.out.println(stringC.length());  // Output: 11

        System.out.println();
    }
}
