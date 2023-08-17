package com.data.inn.proxypattern.remoteproxy.server.domain;

import java.io.Serializable;

//States used by the context
//Implements serializable so that it can be transferred over rmi network
public abstract class State implements Serializable {

    // Ensures the same version is deserialized at the receiving end else miss match runtime exception
    private static final long serialVersionUID = 2L;

    transient GumballMachine gumballMachine;

    State( GumballMachine machine ){
        this.gumballMachine = machine;
    }

    // Actions possible on the state.
    abstract void insertCoin();

    abstract void ejectCoin();

    abstract void turnCrank();

    abstract void dispense();

}
