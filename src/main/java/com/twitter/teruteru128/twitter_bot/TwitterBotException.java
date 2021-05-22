package com.twitter.teruteru128.twitter_bot;

/**
 * @author 
 *
 */
public class TwitterBotException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -7136842440257498804L;

    public TwitterBotException()
    {
    }

    public TwitterBotException(Throwable e)
    {
        super(e);
    }

    public TwitterBotException(String msg)
    {
        super(msg);
    }

    public TwitterBotException(String msg, Throwable e)
    {
        super(msg, e);
    }

}
