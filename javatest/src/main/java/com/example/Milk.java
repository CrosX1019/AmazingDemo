package com.example;

/**
 * Created by CrosX on 2017/10/10.
 */

public class Milk extends Cat implements IRunAction {

    @Override
    public void run() {
        System.out.println("Milk is running!");
    }
}
