# bmhash

bitmessageのripe計算 `RIPEMD160(SHA512(署名鍵 || 暗号化鍵))` を16メッセージ同時に計算する
ネイティブ実装(`libbmhash16.so`)へのFFMバインディング。

どちらの段も入力長が固定である前提に特化しており、パディングブロックが全レーン共通の
定数になるので分岐が消える。

| 関数 | 入力 | 出力 |
|---|---|---|
| `sha512` | 130バイト×16 (公開鍵65バイト×2) | 64バイト×16 |
| `ripemd160` | 64バイト×16 (SHA-512の出力) | 20バイト×16 |

## 速度

    RIPEMD-160  OpenSSL EVP (スカラー) : 0.6176 us/ハッシュ
                AVX-512 16レーン        : 0.0307 us/ハッシュ   約20倍

    SHA-512     OpenSSL EVP (AVX2)     : 0.4323 us/ハッシュ
                AVX-512 16レーン        : 0.1597 us/ハッシュ   約2.7倍

RIPEMD-160の伸びが大きいのは、OpenSSLのx86_64版がアセンブリを持たない素のスカラーCで、
f1〜f5が`vpternlogd`1命令に、318個あるローテートが`vprold`1命令に潰せるため。SHA-512は
OpenSSL側が既にAVX2実装を持つうえ、64bit値なのでzmmに8レーンしか入らない(16レーンは
8レーン版を2つ交互に走らせている。命令数は2倍になるが速度は1.14倍しか上がらず、既に
スループット律速)。

## ネイティブ側

Cの実装は`study`リポジトリ本体にある。

| ファイル | 役割 |
|---|---|
| `src/gen_rmd160_avx512.py` | RIPEMD-160の生成スクリプト |
| `src/gen_sha512_avx512.py` | SHA-512の生成スクリプト。K[80]とH[8]は素数の立方根/平方根から導出する |
| `src/rmd160_avx512.c`, `src/sha512_avx512.c` | 生成物。手で編集しないこと |
| `src/bmhash16.h` | 共通ヘッダ。jextractはこれを読む |

ビルドは `cmake --build build-Release --target bmhash16`。

## ライブラリの場所

システムパスには入れないので、次のいずれかで場所を教える必要がある。

1. システムプロパティ `com.github.teruteru.bmhash16.library` に`.so`の絶対パス
2. `java.library.path` に置いてライブラリ名 `bmhash16` で解決させる

```sh
JAVA_OPTS="-Dcom.github.teruteru.bmhash16.library=/path/to/build-Release/src/libbmhash16.so" \
  develop addressSearch4 '/path/to/publicKeys%d.bin'
```

見つからない場合やAVX-512の無いCPUでは`BmHash16.isAvailable()`がfalseを返し、
`RipeCalculator.calcRipeBatch`が1件ずつの経路へ自動的に落ちる。
