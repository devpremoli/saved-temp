package functionalinterfaces.lambdaexpressions;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);  // Abstract method for operation on two integers
}


public class FunctionalInterfaceArgumentMethod {

    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;

        int additionResult = applyOperation(10, 100, addition);
        System.out.println(additionResult);

        int multiplicationResult = applyOperation(10, 100, (a, b) -> a * b);
        System.out.println(multiplicationResult);
    }

    public static int applyOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }
}
