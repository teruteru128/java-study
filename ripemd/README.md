# ripemd

64バイト入力専用のRIPEMD-160を16メッセージ同時に計算するネイティブ実装
(`librmd160avx512.so`)へのFFMバインディング。

bitmessageのripe計算 `RIPEMD160(SHA512(署名鍵 || 暗号化鍵))` の後段に特化している。
入力が常に64バイト(SHA-512の出力)なので、パディングブロックが全レーン共通の定数になり
分岐が消える。

## なぜ自前実装なのか

OpenSSLのx86_64版RIPEMD-160はアセンブリを持たない素のスカラーCで、逆アセンブルすると
1ブロックあたり1,765命令の完全アンロールだった。SHA-1やSHA-256と違いRIPEMD-160には
CPU命令による支援が無く、SHA-512のようなAVX2実装も無い。

一方でf1〜f5はいずれも3入力ブール関数なので`vpternlogd`1命令に潰せ、318個ある
ローテートも`vprold`1命令になる(AVX2だと`vpslld`+`vpsrld`+`vpor`の3命令)。

    OpenSSL EVP (スカラー)  : 0.6176 us/ハッシュ
    AVX-512 16レーン         : 0.0307 us/ハッシュ   約20倍

## ネイティブ側

Cの実装は`study`リポジトリ本体にある。

| ファイル | 役割 |
|---|---|
| `src/gen_rmd160_avx512.py` | 生成スクリプト。定数表の写し間違いを避けるため160ステップを手書きしない |
| `src/rmd160_avx512.c` | 生成物。手で編集しないこと |
| `src/rmd160_avx512.h` | |

ビルドは `cmake --build build-Release --target rmd160avx512`。

## ライブラリの場所

システムパスには入れないので、次のいずれかで場所を教える必要がある。

1. システムプロパティ `com.github.teruteru.rmd160.library` に`.so`の絶対パス
2. `java.library.path` に置いてライブラリ名 `rmd160avx512` で解決させる

例:

```sh
JAVA_OPTS="-Dcom.github.teruteru.rmd160.library=/path/to/build-Release/src/librmd160avx512.so" \
  develop addressSearch4 '/path/to/publicKeys%d.bin'
```

見つからない場合やAVX-512の無いCPUでは`Rmd160.isAvailable()`がfalseを返し、
`RipeCalculator.calcRipeBatch`が1件ずつの経路へ自動的に落ちるので、呼び出し側での
呼び分けは不要。GCEスポットインスタンスなどAVX-512の無い環境でも動く。
