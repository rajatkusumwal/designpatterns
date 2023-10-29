package com.data.inn.strategypattern.domain;

import com.data.inn.strategypattern.fly.FlyWithWings;
import com.data.inn.strategypattern.quack.Quack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        this.quackBehaviour.quack();
        this.flyBehaviour.fly();
    }
}
