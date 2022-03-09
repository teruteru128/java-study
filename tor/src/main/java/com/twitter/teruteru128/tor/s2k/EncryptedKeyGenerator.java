package com.twitter.teruteru128.tor.s2k;

import java.util.concurrent.Callable;

/**
 * test -> 16:17AEC9679C42F075600CF835CE02ECAB6D297F27D233E150D3EA71DB9A
 * 
 * @see https://gist.github.com/antitree/3962751/d7110ef3767f64b1f10750da6ddf0a7ad4337709
 * @see https://github.com/torproject/tor/blob/4f02812242d1fd90d859eb98ac3fb1ed182f18cf/src/lib/crypt_ops/crypto_s2k.c#L203
 */
public class EncryptedKeyGenerator implements Callable<EncryptedKey> {

    @Override
    public EncryptedKey call() throws Exception {
        return EncryptedKey.getInstanceFromPassword("unchi");
    }
}
