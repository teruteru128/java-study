#!/bin/bash
# systemdのprime-search@.serviceから呼ばれる素数探索ラッパー
# 使い方: run-prime-search.sh <instance>  (instanceはeven-numberファイルのUUID接頭辞)
set -eu
# DB接続情報(パスワードを含む)は ~/.config/prime-search/db.env に置いてある。
# このスクリプトをgitに入れても秘密が漏れないようにするための分離なので、
# ここにDB_URLを書き戻さないこと。
CONF="$HOME/.config/prime-search/db.env"
if [ ! -r "$CONF" ]; then
  echo "$CONF が読めません。DB接続情報が設定されていません。" >&2
  exit 78  # EX_CONFIG
fi
# shellcheck source=/dev/null
. "$CONF"
: "${DB_URL:?db.envにDB_URLがありません}"
export DB_URL
LAUNCHER=/home/teruteru/Documents/Projects/teruteru128/study/java/prime-search/build/install/prime-search/bin/prime-search
BASE_DIR=/home/teruteru/Documents/Projects/teruteru128/study
# FLINT fft_smallによる底2のMiller-Rabin(src/mr2fs.c)。GMP単独の約2倍速い。
# 無ければ(または起動時に読めなければ)GMPのみの経路に自動で落ちる。起動ログの
# 「mr2fs高速経路: 有効」で必ず有効になっているか確認すること。
MR2FS_LIB="$BASE_DIR/build-Release/src/libmr2fs.so.1.0.0"
if [ -r "$MR2FS_LIB" ]; then
  export JAVA_OPTS="${JAVA_OPTS:-} -Dcom.github.teruteru.mr2fs.library=$MR2FS_LIB"
fi
# PFGW(gwnum、底3のFermat、Gerbiczの誤り検出付き)。1本ならmr2fsの約2.5倍速い
# (1ステップ2.05ms対5.12ms、2026-10-25)。8本同時の速さは未測定。
# 候補ごとに外部プロセスとして起動し、無ければmr2fs→GMPの順に自動で落ちる。起動ログの
# 「pfgw高速経路: 有効」を確認すること。作業ディレクトリには候補ごとに10進の候補と再開用の
# *.gecが置かれ(1件1MB程度)、判定が終われば消える。
PFGW_EXE=/home/teruteru/Documents/Projects/openpfgw-code/pfgw64
PFGW_WORK="${XDG_STATE_HOME:-$HOME/.local/state}/prime-search/pfgw"
if [ -x "$PFGW_EXE" ]; then
  export JAVA_OPTS="${JAVA_OPTS:-} -Dcom.github.teruteru.pfgw.executable=$PFGW_EXE -Dcom.github.teruteru.pfgw.workdir=$PFGW_WORK"
fi

case "$1" in
  037c1901)
    exec "$LAUNCHER" search -t 7 "$BASE_DIR/even-number-2097152bit-037c1901-916f-4ce8-9461-cba9e1f4851f.txt"
    ;;
  49d09838)
    exec "$LAUNCHER" search -t 8 "$BASE_DIR/even-number-2097152bit-49d09838-e81d-470e-a6eb-7157ea24ac6c.txt"
    ;;
  *)
    echo "unknown instance: $1" >&2
    exit 1
    ;;
esac
