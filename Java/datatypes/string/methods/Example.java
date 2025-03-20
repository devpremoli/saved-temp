package datatypes.string.methods;

public class Example {

    public static void main(String[] args) {

        
        // String replace(char oldChar, char new Char)
        String replaceChar = "PPPppp";
        String replaceCharResult = replaceChar.replace('p', 'r');
        System.out.println(replaceCharResult);
        System.out.println(replaceChar);

        // String replace(CharSequence target, CharSequence replacement)
        String replaceString = "HelloPremHello";
        String replaceStringResult = replaceString.replace("Hello", "Hi");
        System.out.println(replaceStringResult);
        System.out.println(replaceString);



    }
    
}
