package com.data.inn.compoundpattern.compound.domain;

// Adding observe ability to quackable object
public interface QuackableObserver {

    void registerObserver(Observer observer);

    void notifyObserver();

}
