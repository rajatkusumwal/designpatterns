package com.data.inn.strategypattern.domain;

import com.data.inn.strategypattern.fly.FlyBehaviour;
import com.data.inn.strategypattern.quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    // Each duck implementation can decide the behavior it wants to adapt to
    Duck(FlyBehaviour fly, QuackBehaviour quack){
        this.flyBehaviour = fly;
        this.quackBehaviour = quack;
    }

    public abstract void display();

}
