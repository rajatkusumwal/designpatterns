package com.data.inn.strategypattern.domain;

import com.data.inn.strategypattern.fly.FlyNoWings;
import com.data.inn.strategypattern.quack.Mute;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super( new FlyNoWings(), new Mute());
    }

    @Override
    public void display() {
        this.quackBehaviour.quack();
        this.flyBehaviour.fly();
    }
}
