interface MyInterface {
    // Constant (implicitly public, static, final)
    int CONSTANT_VALUE = 100;
    // Abstract method
    void abstractMethod();
    // default method
    default void defaultMethod() {
        System.out.println("This is the default method.");
    }
    // static method
    static void staticMethod() {
        System.out.println("This is the static method.");
    }
    // nested type - nested interface 
    interface NestedInterface {
        void nestedInterfaceMethod();
    }
    // nested type - nested class
    class NestedClass {
        void nestedClassMethod() {
            System.out.println("This is the method inside the nested class.");
        }
    }
}

class MyClass implements MyInterface, MyInterface.NestedInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method in MyClass.");
    }
    @Override
    public void nestedInterfaceMethod () {
        System.out.println("Incorrect implementation of nestedInterfaceMethod.");
    }
}

class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(MyClass.CONSTANT_VALUE);
        myClass.abstractMethod();
        myClass.defaultMethod();
        MyInterface.staticMethod();
        myClass.nestedInterfaceMethod();
        MyInterface.NestedClass nestedClass = new MyInterface.NestedClass();
        nestedClass.nestedClassMethod();

        MyInterface interClass = new MyClass();
        System.out.println(MyInterface.CONSTANT_VALUE);
        interClass.abstractMethod();
        interClass.defaultMethod();
        MyInterface.staticMethod();
        //interClass.nestedInterfaceMethod(); why this line gives error
        MyClass newClass = (MyClass) interClass;
        newClass.nestedInterfaceMethod();
        MyInterface.NestedClass interNestedClass = new MyInterface.NestedClass();
        interNestedClass.nestedClassMethod();
    }
}