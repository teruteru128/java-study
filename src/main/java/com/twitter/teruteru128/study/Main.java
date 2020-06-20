package com.twitter.teruteru128.study;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;

import com.twitter.teruteru128.study.bitmessage.genaddress.BMAddress;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import jakarta.xml.bind.DatatypeConverter;

/**
 * Main
 * 
 */
public class Main {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Provider provider = Security.getProvider("BC");
        if ( provider == null){
            Security.addProvider(provider = new BouncyCastleProvider());
        }
        byte[] a = DatatypeConverter.parseHexBinary("3296B5AA5F8CEC34D3F7EEAFDF380DCEBB1278A7DA7E512B014374210CB29157AF5DCEEA25CDF8DC4D7140A964C90C3BA14FBEE37172AB8542E3B1ADD30BC234");
        byte[] b = DatatypeConverter.parseHexBinary("B951308CA6B5CC59939C969D8973E0957E494B03C5727A4F86A67078EE8F2C5136974F0DC0AC14FB210083D622814CFB633B663CBDC4F1F15135CB304905CA83");
        MessageDigest sha512 = MessageDigest.getInstance("SHA512");
        MessageDigest ripemd160 = MessageDigest.getInstance("RIPEMD160");
        sha512.update((byte)0x04);
        sha512.update(a);
        sha512.update((byte)0x04);
        sha512.update(b);
        byte[] cache64 = new byte[64];
        sha512.digest(cache64, 0, 64);
        ripemd160.update(cache64, 0, 64);
        byte[] ripe = new byte[20];
        ripemd160.digest(ripe, 0, 20);
        System.out.println(DatatypeConverter.printHexBinary(ripe));
        String address3 = BMAddress.encodeAddress(3, 1, ripe);
        String address4 = BMAddress.encodeAddress(4, 1, ripe);
        System.out.println(address3);
        System.out.println(address4);
    }
}
