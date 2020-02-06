package com.twitter.teruteru128.study.bitmessage.genaddress;

class AddressGeneratorRequest {
    String command = "";
    int addressVersionNumber = 0;
    int streamNumber;
    String label = "";
    String deterministicPassphrase = "";
    boolean live = true;
    int numberOfAddressesToMake = 0;
    boolean eighteenByteRipe = false;
    int nonceTrialsPerByte = 0;
    int payloadLengthExtraBytes = 0;

    public AddressGeneratorRequest(String command, int addressVersionNumber, int streamNumber, String label,
            String deterministicPassphrase, boolean live) {
    }

    public String getCommand() {
        return null;
    }

}