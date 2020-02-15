package com.twitter.teruteru128.study.bitmessage.decode1;

public class AddressPrivateKeyDecode {

    /**
     * <pre>
     * [BM-NB2rTLxnyJCcS8RmTePkSAeFzHyzAR9p]
     * label = njchat onagami
     * enabled = true
     * decoy = false
     * noncetrialsperbyte = 1000
     * payloadlengthextrabytes = 1000
     * privsigningkey = 5JVK5vzpfU7Noa2dfaBGTZ3zzQG8WntT2kMeZk4MroZyEiJBuNM
     * privencryptionkey = 5JiaY6eLJKb6LDt9oQEDXssA3H4y6wbFEZHdkHjikTJFygbT4gu
     * lastpubkeysendtime = 1542869750
     * 
     * </pre>
     * 
     * @param args
     */
    public static void main(String[] args) {
        var privsigningkey = "5JVK5vzpfU7Noa2dfaBGTZ3zzQG8WntT2kMeZk4MroZyEiJBuNM";
        var privencryptionkey = "5JiaY6eLJKb6LDt9oQEDXssA3H4y6wbFEZHdkHjikTJFygbT4gu";
        System.out.println(privsigningkey);
        System.out.println(privencryptionkey);
        System.out.println("BitMessageはBase58を使用しています");
    }

}
