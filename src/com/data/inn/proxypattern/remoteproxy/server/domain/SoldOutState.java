package com.data.inn.proxypattern.remoteproxy.server.domain;

public class SoldOutState extends State {

    private static final long serialVersionUID = 2L;

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
