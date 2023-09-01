package com.data.inn.compoundpattern.compound.domain;

// Adapter from goose to duck
public class GooseAdapter implements Quackable{

    Goose goose;

    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        this.observable = new Observable(this);
    }


    @Override
    public void quack() {

        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
