package datatypes.objectclass.methods.clone;

import java.lang.CloneNotSupportedException;

public class Person implements Cloneable {

    String name;
    int age;
    String[] nicknames;

    public Person(String name, int age, String[] nicknames) {
        this.name = name;
        this.age = age;
        this.nicknames = nicknames;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone(); // shallow copy
    }
    
    @Override
    public String toString() {
        return "MyClass [name= " + name + ", age= " + age + " " + nicknames[0] + "]";
    }



    public static void main(String[] args) {

        String[] nicknames = {"Oli"};
        Person originalPersonA = new Person("Prem", 25, nicknames);

        try {
            Person copyPersonA = originalPersonA.clone();

            originalPersonA.name = "changed"; // reference to new String object
            originalPersonA.nicknames[0] = "changed";
            System.out.println(originalPersonA);
            System.out.println(copyPersonA);


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
