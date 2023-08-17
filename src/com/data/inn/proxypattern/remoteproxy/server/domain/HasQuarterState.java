package com.data.inn.proxypattern.remoteproxy.server.domain;

import java.util.Random;

public class HasQuarterState extends State {

    private static final long serialVersionUID = 2L;

    Random randomWinner = new Random(System.currentTimeMillis());

    HasQuarterState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {

        System.out.println("You cannot insert any more quarters.");
    }

    @Override
    public void ejectCoin() {

        System.out.println("Quarter returned");
        // State setting happens from the context never from the states.
        gumballMachine.setCurrentState( gumballMachine.getNoQuarterState() );
    }

    @Override
    public void turnCrank() {

        System.out.println("You turned..");
        int winner = randomWinner.nextInt(10);
        if( winner ==0 && gumballMachine.count>1){
            gumballMachine.setCurrentState( gumballMachine.getWinnerState() );
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {

        System.out.println("No gumball dispensed.");
    }
}
