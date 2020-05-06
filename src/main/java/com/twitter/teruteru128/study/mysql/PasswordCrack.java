package com.twitter.teruteru128.study.mysql;

public class PasswordCrack {

    /**
     * <pre>
     * +-----------+------------------+-------------------------------------------+
     * | Host      | User             | authentication_string                     |
     * +-----------+------------------+-------------------------------------------+
     * | localhost | root             |                                           |
     * | localhost | mysql.session    | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE |
     * | localhost | mysql.sys        | *THISISNOTAVALIDPASSWORDTHATCANBEUSEDHERE |
     * | localhost | debian-sys-maint | *D0CC70AB049F30DF27F158FE5426EF82E3277E1A |
     * | localhost | phpmyadmin       | *5C3EDE5ABE3137B15F1005C1FFAFDD7F756ED081 |
     * | localhost | wordpressuser    | *2470C0C06DEE42FD1618BB99005ADCA2EC9D1E19 | // password
     * | %         | admin            | *505466973A72E3A84006EBCCC909FBDF9C6BA9A1 |
     * | localhost | wordpress        | *8667B830495390774EBDA09D947B4B5F9F24F98F |
     * | localhost | wp1              | *BEE618C9E0250EB28EA055637579294E7ED925ED |
     * | localhost | user             | *5C3EDE5ABE3137B15F1005C1FFAFDD7F756ED081 |
     * +-----------+------------------+-------------------------------------------+
     * </pre>
     * 
     * unknown hashcode : 505466973A72E3A84006EBCCC909FBDF9C6BA9A1
     * 
     * @param args
     */
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println();
            return;
        }
        for (int i = 0; i < args.length; i++) {
            crack(args[0]);
        }
    }

    private static void crack(String hash) {

    }
}
