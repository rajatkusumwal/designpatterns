package com.data.inn.proxypattern.remoteproxy.server.domain;

public class WinnerState extends State {

    private static final long serialVersionUID = 2L;

    WinnerState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {
        System.out.println("Checking if you won!!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("Checking if you won!!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Checking if you won!!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        System.out.println("You are the winner!!");
        if( gumballMachine.getCount() > 0 ){
            gumballMachine.setCurrentState( gumballMachine.getNoQuarterState() );
        } else{
            gumballMachine.setCurrentState( gumballMachine.getSoldOutState() );
        }
    }
}
