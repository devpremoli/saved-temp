public class GenericClassExample<T> {
    private T data;

    public GenericClassExample(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        GenericClassExample<String> stringExample = new GenericClassExample<>("Hello");
        System.out.println("String Example: " + stringExample.getData());

        GenericClassExample<Integer> integerExample = new GenericClassExample<>(123);
        System.out.println("Integer Example: " + integerExample.getData());
    }
}
