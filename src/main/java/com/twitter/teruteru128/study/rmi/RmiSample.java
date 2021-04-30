package com.twitter.teruteru128.study.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Teruteru
 *
 */
public interface RmiSample extends Remote {

    public MessageObject getMessage()throws RemoteException;
    
}
