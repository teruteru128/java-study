# openssl

OpenSSLの`libcrypto`(EVPダイジェストAPI)へのFFMバインディング。

`RIPEMD-160`がBouncyCastleの純Java実装より約4.1倍速いため、それを使うことが主目的。
SHA-512はJDK(SUNプロバイダ)がAVX2イントリンシックで同等の速度を出すので、わざわざ
こちらを使う必要はない。

## 再生成

`jextract`で必要な関数だけに絞って生成している。`openssl/evp.h`は全体で10,260シンボル
あり、丸ごと生成すると現実的でないため。

```sh
jextract \
  --output src/main/java \
  -t com.github.teruteru128.foreign.openssl \
  --header-class-name evp_h \
  -l crypto \
  --include-function EVP_MD_fetch \
  --include-function EVP_MD_free \
  --include-function EVP_get_digestbyname \
  --include-function EVP_MD_get_size \
  --include-function EVP_MD_CTX_new \
  --include-function EVP_MD_CTX_free \
  --include-function EVP_MD_CTX_reset \
  --include-function EVP_DigestInit_ex \
  --include-function EVP_DigestUpdate \
  --include-function EVP_DigestFinal_ex \
  --include-function EVP_Digest \
  /usr/include/openssl/evp.h
```

生成後に`module-info.java`は上書きされないが、手書きなので消さないこと。

## RIPEMD-160の入手性

OpenSSL 3ではRIPEMD-160がlegacy providerに移されたディストリビューションがあるが、
Ubuntu 24.04の3.0.13では`@ default`に入っているため`EVP_MD_fetch(NULL, "RIPEMD160", NULL)`
がそのまま通る。他環境へ持っていく場合は`openssl list -digest-algorithms | grep -i ripemd`
で確認すること。
