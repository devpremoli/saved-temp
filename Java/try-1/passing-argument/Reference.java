public class Reference {
    public static void modifyObject(Person obj) {
        obj.name = "name has been modified";
        obj.age = 20;
        obj = new Person("Pradeep", 30);
        System.out.println("Inside the method, person.name: " + obj);

    }
    public static void main (String[] args) {
        Person person = new Person("Prem", 25);
        System.out.println("Before call, person: " + person);
        modifyObject(person);
        System.out.println("After call, person.name: " + person.name);
        System.out.println("After call, person.age: " + person.age);
        System.out.println("After call, person: " + person);
    }
}

class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}





