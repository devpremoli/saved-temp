@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

class LambdaExample {

    public static int executeOperation(int a, int b, MathOperation operation) {
        return operation.operate(a, b);
    }

    public static void main(String[] args) {
        int addResult = executeOperation(10, 2, (int a, int b) -> a + b);
        System.out.println(addResult);

        int divideResult = executeOperation(10, 2, (int a, int b) -> a * b);
        System.out.println(divideResult);
    }
    
}