package com.data.inn.statepattern.domain;

//States used by the context
public abstract class State {

    GumballMachine gumballMachine;

    State( GumballMachine machine ){
        this.gumballMachine = machine;
    }

    // Actions possible on the state.
    abstract void insertCoin();

    abstract void ejectCoin();

    abstract void turnCrank();

    abstract void dispense();

}
