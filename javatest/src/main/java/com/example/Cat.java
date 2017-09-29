package com.example;

/**
 * Created by crosx on 2017/9/30.
 */

public class Cat extends Animal {

    @Override
    void run() {
        System.out.println("The cat is running!");
    }

    @Override
    void eat(String food) {
        System.out.println("The cat is eating " + food + "!");
    }

    @Override
    void sleep() {
        System.out.println("The cat is sleeping...");
    }


}
