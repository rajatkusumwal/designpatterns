package com.data.inn.statepattern;

import com.data.inn.statepattern.domain.GumballMachine;

//Client
public class StatePatternMain {

    public void run(){

        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println( gumballMachine );

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println( gumballMachine );

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}
