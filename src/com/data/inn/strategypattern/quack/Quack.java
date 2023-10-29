package com.data.inn.strategypattern.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
