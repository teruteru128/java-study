package com.twitter.teruteru128.brainfuck;

/**
 * @author Teruteru
 *
 */
public class DataPointerOutOfBoundsException extends IndexOutOfBoundsException {

    /**
     * 
     */
    private static final long serialVersionUID = 6111293373413949123L;
    /**
     * 
     * */
    public DataPointerOutOfBoundsException(){
        super();
    }
    /**
     * 
     * */
    public DataPointerOutOfBoundsException(String s){
        super(s);
    }
}
