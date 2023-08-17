package com.data.inn.proxypattern.remoteproxy.client;

import com.data.inn.proxypattern.remoteproxy.GumballMachineRemote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GumBallMachineClient {

    public void run()throws NotBoundException, RemoteException {

        Registry registry = LocateRegistry.getRegistry(8888);

        String location = "gumballmachine";
        GumballMachineRemote remote = (GumballMachineRemote) registry.lookup(location);

        GumballMonitor monitor = new GumballMonitor( remote );

        monitor.report();
    }
}
