package com.data.inn.proxypattern.remoteproxy.client;

import com.data.inn.proxypattern.remoteproxy.GumballMachineRemote;

import java.rmi.RemoteException;

// Client monitor invokes server gumball using remote interface
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report(){
        try{
            System.out.println("Gumball machine: "+ machine.getLocation() );
            System.out.println("Current inventory: "+ machine.getCount() );
            System.out.println("Current state: "+ machine.getState() );
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
