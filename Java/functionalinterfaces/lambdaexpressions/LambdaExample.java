package functionalinterfaces.lambdaexpressions;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class LambdaExample {

    public static void main(String[] args) {
        
        MathOperation add = (a, b) -> a + b;

        int additionResult = add.operate(10, 100);
        System.out.println(additionResult);

        // method reference to multiply
        MathOperation multiplyTwo = LambdaExample::multiply;
        System.out.println(multiplyTwo.operate(10, 100));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    
}
