package com.data.inn.compoundpattern.domain;

// Decorator to add countable functionality
public class QuackCounterDecorator implements Quackable{

    Quackable duck;

    public static int counter = 0;

    Observable observable;

    public QuackCounterDecorator(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }


    @Override
    public void quack() {

        duck.quack();
        counter++;

        System.out.println("Current quack count :" + counter);
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        duck.notifyObserver();
    }
}
