package com.data.inn.compoundpattern.compound.domain;

import java.util.ArrayList;
import java.util.List;

// Composite Pattern to add a flock of ducks
public class Flock implements Quackable{

    List<Quackable> ducks = new ArrayList<>();

    @Override
    public void quack() {

        ducks.forEach(Quackable::quack);
    }

    public void add(Quackable duck){

        ducks.add( duck );
    }

    @Override
    public void registerObserver(Observer observer) {
        ducks.forEach((duck)->duck.registerObserver(observer));
    }

    @Override
    public void notifyObserver() {
        ducks.forEach(QuackableObserver::notifyObserver);
    }
}
