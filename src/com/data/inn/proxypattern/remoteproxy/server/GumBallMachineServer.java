package com.data.inn.proxypattern.remoteproxy.server;

import com.data.inn.proxypattern.remoteproxy.GumballMachineRemote;
import com.data.inn.proxypattern.remoteproxy.server.domain.GumballMachine;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

// Binds original gumball machine to rmi
public class GumBallMachineServer {

    public void run(){

        System.out.println("Binding server to the registry.");

        int count = 100;

        try{

            GumballMachineRemote gumballMachine = new GumballMachine("gumball-server-machine",count);

            Registry registry = LocateRegistry.getRegistry(8888);
            registry.rebind("gumballmachine", gumballMachine );

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
