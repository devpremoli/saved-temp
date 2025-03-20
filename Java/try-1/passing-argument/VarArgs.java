public class VarArgs {
    public int sumNumbers(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }
    public static void main (String[] args) {
        VarArgs obj = new VarArgs();
        int[] arr = {1, 2, 3, 4};
        System.out.println(obj.sumNumbers(1, 2, 3, 4));
        System.out.println(obj.sumNumbers(arr));
    }
}
