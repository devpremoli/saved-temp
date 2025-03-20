package datatypes.wrappers.integer;

import java.lang.Integer;


public class IntegerWrapperClass {

    public static void main(String[] args) {
        
        // Static Methods
        // 1. static int compare(int x, int y)
        int a = 1;
        int b = 1;
        int c = 2;
        int d = 0;
        System.out.println(Integer.compare(a, b)); // x = y -> 0
        System.out.println(Integer.compare(a, c)); // x > y -> 1
        System.out.println(Integer.compare(a, d)); // x < y -> -1

        // 2. static int max(int a, int b)
        // 3. static int min(int a, int b)
        System.out.println(Integer.max(a, c)); // returns c
        System.out.println(Integer.min(a, c)); // returns a


        // static int sum(int a, int b)
        System.out.println(Integer.sum(a, b)); // returns a+b

        // static String toString(int i)
        String aString = Integer.toString(a);
        System.out.println(aString);

        // 





    }
    
}
