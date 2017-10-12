package com.example;

/**
 * Created by crosx on 2017/9/30.
 */

public abstract class Cat extends Animal {

    @Override
    void eat(String food) {
        System.out.println("The cat is eating " + food + "!");
    }

    @Override
    void sleep() {
        System.out.println("The cat is sleeping...");
    }

}
