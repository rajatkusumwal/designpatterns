package com.data.inn.proxypattern.remoteproxy;

import com.data.inn.proxypattern.remoteproxy.client.GumBallMachineClient;
import com.data.inn.proxypattern.remoteproxy.server.GumBallMachineServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ProxyPatternMain {

    public void run(){

        try {

            // Create registry to be used by client and server.
            LocateRegistry.createRegistry(8888);

            GumBallMachineServer gumBallMachineServer = new GumBallMachineServer();
            GumBallMachineClient gumBallMachineClient = new GumBallMachineClient();

            gumBallMachineServer.run();
            gumBallMachineClient.run();

            System.exit( 0 );

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }

    }

}
