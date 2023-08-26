package com.data.inn.compoundpattern.domain;

// Adds the counting decorator factory
public class CountingDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounterDecorator(new RubberDuck());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounterDecorator(new MallardDuck());
    }

    @Override
    public Quackable createGoose() {
        return new QuackCounterDecorator( new GooseAdapter( new Goose() ));
    }
}
