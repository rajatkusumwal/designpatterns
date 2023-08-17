package com.data.inn.proxypattern.remoteproxy.server.domain;

public class NoQuarterState extends State {

    private static final long serialVersionUID = 2L;

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
