# bmhash

bitmessageのripe計算 `RIPEMD160(SHA512(署名鍵 || 暗号化鍵))` を16メッセージ同時に計算する
ネイティブ実装(`libbmhash16.so`)へのFFMバインディング。

どちらの段も入力長が固定である前提に特化しており、パディングブロックが全レーン共通の
定数になるので分岐が消える。

| 関数 | 入力 | 出力 |
|---|---|---|
| `sha512` | 130バイト×16 (公開鍵65バイト×2) | 64バイト×16 |
| `ripemd160` | 64バイト×16 (SHA-512の出力) | 20バイト×16 |
| `setSignKey` + `ripe` | 署名用公開鍵65バイト + 暗号化用公開鍵65バイト×16 | 20バイト×16 (ripe) |

`ripe`は上の2段を一体で計算する(C側は`ripe16`)。署名用公開鍵を固定して暗号化用公開鍵だけを
変えるアドレス探索向けで、`sha512Prefixed`+`ripemd160`と同じ値を返す。AVX-512BWも要るので、
使えるかは`isRipeAvailable()`で別に確かめる(`RipeCalculator`は使えなければ2段の経路に落ちる)。

## 速度

    RIPEMD-160  OpenSSL EVP (スカラー) : 0.6176 us/ハッシュ
                AVX-512 16レーン        : 0.0307 us/ハッシュ   約20倍

    SHA-512     OpenSSL EVP (AVX2)     : 0.4323 us/ハッシュ
                AVX-512 16レーン        : 0.1597 us/ハッシュ   約2.7倍

一体版`ripe`(2026-11-03、Ryzen 7 8745H、16スレッドで全コア使用時のripe計算全体):

    sha512Prefixed + ripemd160 : 5.18e7 組/秒
    ripe (一体版)              : 7.44e7 組/秒   約1.44倍

内訳(試作で分けて測ったもの): 入力の組み立てを1バイトずつのシフトからgather+vpshufbに
替えたのが約+34%、署名用公開鍵だけで決まるSHA-512の最初の8ラウンドの事前計算が約+3%、
SHA-512の出力をバイト列に戻さずレジスタ上でRIPEMD-160の入力へ組み替えたのが約+5%。
RIPEMD-160はSHA-512の約1/5の重さしかない。

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
| `src/bmhash16_internal.h` | ライブラリ内部だけの宣言(`rmd160_16way_lanes`)。jextractには読ませない |

生成物は`python3 src/gen_sha512_avx512.py > src/sha512_avx512.c`と
`python3 src/gen_rmd160_avx512.py > src/rmd160_avx512.c`で作り直す。

バインディング(`bmhash16_h.java`、`ripe16_sign_ctx.java`)の生成コマンド:

```sh
jextract --output bmhash/src/main/java -t com.github.teruteru128.foreign.bmhash \
  --header-class-name bmhash16_h \
  --include-function rmd160_16way_available --include-function rmd160_16way \
  --include-function sha512_16way_available --include-function sha512_16way \
  --include-function sha512_16way_prefixed \
  --include-function ripe16_available --include-function ripe16_set_sign_key \
  --include-function ripe16 \
  --include-struct ripe16_sign_ctx --include-typedef ripe16_sign_ctx \
  ../src/bmhash16.h
```

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
