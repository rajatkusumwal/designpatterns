package com.data.inn.proxypattern.remoteproxy;

import com.data.inn.proxypattern.remoteproxy.server.domain.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface common for both client and server.
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
