package com.data.inn.statepattern.domain;

public class SoldOutState extends State {

    SoldOutState(GumballMachine machine) {
        super(machine);
    }

    @Override
    void insertCoin() {
        System.out.println("Sold out!!");
    }

    @Override
    void ejectCoin() {
        System.out.println("Sold out!!");
    }

    @Override
    void turnCrank() {
        System.out.println("Sold out!!");
    }

    @Override
    void dispense() {
        System.out.println("Sold out!!");
    }


}
