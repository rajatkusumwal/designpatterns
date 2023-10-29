package com.data.inn.strategypattern.fly;

public class FlyNoWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot Fly I don't have wings!!");
    }
}
