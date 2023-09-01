package com.data.inn.compoundpattern.mvc.domain;

// Making our model observable
public interface BeatObservable {

    void registerObserver(Observer observer);
}
