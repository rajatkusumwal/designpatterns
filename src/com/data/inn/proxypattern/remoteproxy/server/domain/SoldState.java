package com.data.inn.proxypattern.remoteproxy.server.domain;

public class SoldState extends State {

    private static final long serialVersionUID = 2L;

    SoldState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {

        System.out.println("Please wait giving you gumball.");
    }

    @Override
    public void ejectCoin() {

        System.out.println("Already turned the crank");
    }

    @Override
    public void turnCrank() {

        System.out.println("Turning twice will not return two.");
    }

    @Override
    public void dispense() {
        // No decision is taken by the states, the context is the one which helps orchestration of work.
        // States are only responsible for controlling the flow of the states from one to another.
        gumballMachine.releaseBall();

        if( gumballMachine.getCount() > 0 ){
            gumballMachine.setCurrentState( gumballMachine.getNoQuarterState() );
        } else{
            gumballMachine.setCurrentState( gumballMachine.getSoldOutState() );
        }
    }
}
