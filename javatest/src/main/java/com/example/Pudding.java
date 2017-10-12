package com.example;

/**
 * Created by CrosX on 2017/10/10.
 */

public class Pudding extends Cat implements IRunAction, IFlyAction {
    @Override
    public void fly() {
        System.out.println("Pudding is flying!");
    }

    @Override
    public void run() {
        System.out.println("Pudding is running!");
    }
}
