package com.data.inn.compoundpattern.compound.domain;

// Factory that abstracts creation from the simulator
public abstract class AbstractDuckFactory {

    public abstract Quackable createRubberDuck();
    public abstract Quackable createMallardDuck();
    public  abstract Quackable createGoose();

}
