import java.util.Scanner;

class ScannerClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String strA = scn.nextLine();
        System.out.println(strA);
        //System.out.println(strA.charAt(strA.length()-1));
        

        scn.close();
    }
    
}
