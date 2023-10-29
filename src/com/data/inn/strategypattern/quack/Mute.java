package com.data.inn.strategypattern.quack;

public class Mute implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cannot quack I'm mute!!");
    }
}
