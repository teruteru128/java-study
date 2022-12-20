package com.twitter.teruteru128.bitmessage.genaddress;

public abstract class Args implements Cloneable {

    protected Args(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    protected Command command;

    public Args clone() {
        Args clone = null;
        try {
            clone = (Args) super.clone();
        } catch (CloneNotSupportedException e) {
            // NONE
        }
        return clone;
    }

}
