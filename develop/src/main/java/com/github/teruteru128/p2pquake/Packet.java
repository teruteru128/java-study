package com.github.teruteru128.p2pquake;

import java.nio.charset.Charset;

/**
 * 
*/
public abstract class Packet {
    protected int code = -1;
    protected int hop = -1;

    public Packet(int code, int hop) {
        this.code = code;
        this.hop = hop;
    }

    /**
     * 
     */
    @Override
    public abstract String toString();

    private static final Charset SHIFT_JIS = Charset.forName("Shift-JIS");

    /**
     * Shift-JISを使用してこのパケットをエンコードし、結果を新しいバイト配列に格納します。
     * 
     *  Shift-JISでこの文字列をエンコード化できない場合、このメソッドの動作は指定されません。 エンコード処理をより強力に制御する必要がある場合は、{@link #toString()}メソッドと{@link java.nio.charset.CharsetEncoder CharsetEncoder}クラスを使用してください。 
     * @return Shift-JISでエンコードされたバイト配列
     */
    public byte[] getBytes() {
        return toString().getBytes(SHIFT_JIS);
    }

    /**
     * 
     * @return
     */
    public byte[] getBytes(Charset charset) {
        return toString().getBytes(charset);
    }

    // TODO: "dataだけが欲しい"なんて状況あり得るか？
}
