package com.twitter.teruteru128.rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import com.twitter.teruteru128.rmi.MessageObject;
import com.twitter.teruteru128.rmi.RmiSample;

/**
 * @author Teruteru
 *
 */
public class RmiClient {

    public static void main(String[] args) throws Exception {

        RmiSample rs = lookup();
        System.out.println(rs.getMessage());
    }

    static RmiSample lookup() throws MalformedURLException, RemoteException, NotBoundException {
        Remote r = Naming.lookup("rmi://192.168.91.128/RmiSampleName");
        return (RmiSample) r;
    }
}
