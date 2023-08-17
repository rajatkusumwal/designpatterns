package com.data.inn.proxypattern.remoteproxy.server.domain;

import com.data.inn.proxypattern.remoteproxy.GumballMachineRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Context
 * All the action on the context by the client happens here.
 * States are only responsible to help bound the object to the correct states.
 * Actions like gum ball count reduction and release ball happens in the context.
 * States do not alter these values in the subclass.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    int count;
    String location;
    State currentState;

    //When the states do not have their own context we can make them static to reduce memory footprint.
    State hasQuarterState;
    State noQuarterState;
    State soldState;
    State soldOutState;
    State winnerState;

    public GumballMachine(String location, int count) throws RemoteException {
        super();
        this.count = count;
        this.location = location;
        this.noQuarterState = new NoQuarterState( this );
        this.hasQuarterState = new HasQuarterState( this );
        this.soldState = new SoldState( this );
        this.soldOutState = new SoldOutState( this );
        this.winnerState = new WinnerState( this );

        if( this.count>0 ){

            this.currentState = getNoQuarterState();
        } else{

            this.currentState = getSoldOutState();
        }
    }

    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return currentState;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void insertQuarter(){

        currentState.insertCoin();
    }

    public void ejectQuarter(){

        currentState.ejectCoin();
    }

    public void turnCrank(){

        currentState.turnCrank();
        currentState.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if( count>0 ){

            count = count -1;
        }
    }

}
