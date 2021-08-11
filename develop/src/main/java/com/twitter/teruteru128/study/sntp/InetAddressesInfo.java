package com.twitter.teruteru128.study.sntp;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;

/**
 * ネットワークインターフェースの取得
 * 
 * @author https://yukun.info/java-networkinterface-ipv6-ipv4/
 */
public class InetAddressesInfo {
    private HashMap<NetworkInterface, List<InetAddress>> interfaceMap = new HashMap<>();

    public InetAddressesInfo() {
    }

    public void getInterfaces() {
        interfaceMap.clear();
        try {
            Enumeration<NetworkInterface> interfaceList = NetworkInterface.getNetworkInterfaces();
            if (interfaceList == null) {
                System.out.println("Message: No interfaces found");
            } else {
                while (interfaceList.hasMoreElements()) {
                    NetworkInterface iface = interfaceList.nextElement();
                    Enumeration<InetAddress> addrList = iface.getInetAddresses();
                    if (!addrList.hasMoreElements())
                        continue;
                    ArrayList<InetAddress> iaddress = new ArrayList<InetAddress>();
                    while (addrList.hasMoreElements())
                        iaddress.add(addrList.nextElement());
                    interfaceMap.put(iface, iaddress);
                }
            }
        } catch (SocketException se) {
            System.out.println("Error getting network interfaces: " + se.getMessage());
        }
    }

    public void show() {
        for (NetworkInterface n : interfaceMap.keySet()) {
            System.out.print("Interface ");
            System.out.print(n.getName());
            System.out.println(": ");
            for (InetAddress a : interfaceMap.get(n)) {
                System.out.print("\tAddress (");
                if (a instanceof Inet4Address) {
                    System.out.print("IPv4");
                } else if (a instanceof Inet6Address) {
                    System.out.print("IPv6");
                } else {
                    System.out.print("?");
                }
                System.out.print(") :");
                System.out.println(a.getHostAddress());
            }
        }
    }

    public HashMap<NetworkInterface, List<InetAddress>> getInterfaceMap() {
        return interfaceMap;
    }

    public void setInterfaceMap(HashMap<NetworkInterface, List<InetAddress>> interfaceMap) {
        this.interfaceMap = interfaceMap;
    }

    public static void main(String[] args) {
        InetAddressesInfo i = new InetAddressesInfo();
        i.getInterfaces();
        i.show();
    }
}
