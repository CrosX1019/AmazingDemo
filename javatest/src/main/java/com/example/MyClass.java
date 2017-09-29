package com.example;

public class MyClass {

    public static void main(String args[]) {
        Cat cat = new Cat();
        cat.run();
        cat.eat("fish");
        cat.sleep();

        Dog dog = new Dog();
        dog.run();
        dog.eat("meat");
        dog.sleep();
    }
}
