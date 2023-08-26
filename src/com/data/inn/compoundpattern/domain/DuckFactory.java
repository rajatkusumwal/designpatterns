package com.data.inn.compoundpattern.domain;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
