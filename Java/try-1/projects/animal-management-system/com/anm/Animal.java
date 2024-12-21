package com.anm;

public class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

}