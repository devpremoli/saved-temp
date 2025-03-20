public class GenericMethod {
    public static <T> void GenericPrintArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        Integer[] IntArray = {1, 2, 3, 4, 5};
        String[] StrArray = {"a", "b", "c", "d", "e"};
        GenericPrintArray(IntArray);
        GenericPrintArray(StrArray);
    }
}
