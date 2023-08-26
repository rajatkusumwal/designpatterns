package com.data.inn.compoundpattern.domain;

import java.util.ArrayList;
import java.util.List;


public class Observable implements QuackableObserver{

    QuackableObserver quackableObserver;

    List<Observer> observers = new ArrayList<>();

    public Observable(QuackableObserver quackableObserver) {
        this.quackableObserver = quackableObserver;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add( observer );
    }

    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
