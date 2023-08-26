package com.data.inn.compoundpattern.domain;

// Adding observe ability to quackable object
public interface QuackableObserver {

    void registerObserver(Observer observer);

    void notifyObserver();

}
