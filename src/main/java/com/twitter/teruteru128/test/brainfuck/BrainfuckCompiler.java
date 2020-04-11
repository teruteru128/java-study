package com.twitter.teruteru128.test.brainfuck;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author <a href="https://twitter.com/teruteru128">teruteru128</a>
 *
 */
public class BrainfuckCompiler implements Runnable {
    private BrainfuckSource source;
    private int dataPointer = 0;
    private ArrayList<Byte> dataArray = new ArrayList<>(
            Arrays.asList(new Byte[] { 0 }));

    public BrainfuckCompiler(String sorce) {
        this(new BrainfuckSource(sorce));
    }

    public BrainfuckCompiler(BrainfuckSource sorce) {
        this.source = sorce;
    }

    public byte getCurrentValue() {
        return dataArray.get(dataPointer);
    }

    public int getDataPointer() {
        return this.dataPointer;
    }

    public void run() {
        String source_s = source.getSource();
        ArrayList<Byte> array = dataArray;
        int pointer = dataPointer;
        for (char chr : source_s.toCharArray()) {
            switch (chr) {
            case '>':
                pointer++;
                while (array.size() - 1 < pointer) {
                    array.add((byte) 0);
                }
                break;
            case '<':
                if (pointer <= 0) {
                    throw new DataPointerOutOfBoundsException();
                }
                pointer--;
                break;
            case '+':
                if (array.get(pointer) == Byte.MAX_VALUE) {
                    array.set(pointer, Byte.MIN_VALUE);
                } else {
                    array.set(pointer, (byte) (array.get(pointer) + 1));
                }
                break;
            case '-':
                if (array.get(pointer) == Byte.MIN_VALUE) {
                    array.set(pointer, Byte.MAX_VALUE);
                } else {
                    array.set(pointer, (byte) (array.get(pointer) - 1));
                }
                break;
            case '[':
                break;
            case ']':
                break;
            case '.':
                break;
            case ',':
                break;
            default:
                break;
            }
        }
        dataPointer = pointer;
    }

    int findIndexOfEndBrucket(int index) {
        int brucketCounter = 1;
        index++;
        String source_s = source.getSource();
        int length = source_s.length();
        while (brucketCounter > 0 && index < length) {
            if (source_s.charAt(index) == '[') {
                brucketCounter++;
            }
            if (source_s.charAt(index) == ']') {
                brucketCounter--;
            }
            index++;
        }
        return index - 1;
    }

    int findIndexOfStartBrucket(int index) {
        index--;
        int brucketCounter = 1;
        String source_s = source.getSource();
        while (brucketCounter > 0 && index >= 0) {
            if (source_s.charAt(index) == '[') {
                brucketCounter--;
            }
            if (source_s.charAt(index) == ']') {
                brucketCounter++;
            }
            index--;
        }
        return index - 1;
    }
}