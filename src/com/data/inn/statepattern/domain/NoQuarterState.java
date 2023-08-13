package com.data.inn.statepattern.domain;

public class NoQuarterState extends State {

    NoQuarterState(GumballMachine machine) {
        super(machine);
    }

    @Override
    public void insertCoin() {

        System.out.println( "Thank you!!" );
        gumballMachine.setCurrentState( gumballMachine.getHasQuarterState() );
    }

    @Override
    public void ejectCoin() {
        System.out.println( "There is no quarter to eject." );
    }

    @Override
    public void turnCrank() {
        System.out.println( "Insert quarter first." );
    }

    @Override
    public void dispense() {
        System.out.println( "Insert quarter first." );
    }
}
