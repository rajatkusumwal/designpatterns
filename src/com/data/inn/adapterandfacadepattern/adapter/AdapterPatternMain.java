package com.data.inn.adapterandfacadepattern.adapter;

import com.data.inn.adapterandfacadepattern.adapter.domain.AustralianTurkey;
import com.data.inn.adapterandfacadepattern.adapter.domain.DuckAdapter;

public class AdapterPatternMain {

    /**
     * Adapters are used to covert interfaces from one form to another.
     * Java library Eg. Converting a legacy collection Enumeration to iterator.
     */
    public void run(){

        AustralianTurkey australianTurkey = new AustralianTurkey();

        //Converts a turkey into a duck.
        DuckAdapter turkeyToDuck = new DuckAdapter( australianTurkey );

        System.out.println( turkeyToDuck.quack() );

        System.out.println( turkeyToDuck.fly() );
    }
}
